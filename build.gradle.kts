import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    base
    kotlin("jvm") version "1.3.20"
    kotlin("plugin.spring") version "1.3.50" apply false
    id("org.springframework.boot") version "2.2.0.RELEASE" apply false
    id("org.jmailen.kotlinter") version "1.20.1"
}



allprojects {
    group = "dk.shape.weather"
    version = "1.0"

    repositories {
        mavenCentral()
        jcenter()
    }

}

subprojects {
//    apply(plugin = "java")
//    apply(plugin = "org.springframework.boot")
    println("Enabling Kotlin Spring plugin in project ${project.name}...")
//    apply(plugin = "org.jetbrains.kotlin.plugin.spring")

    println("Enabling Spring Boot Dependency Management in project ${project.name}...")
    apply(plugin = "io.spring.dependency-management")
    the<DependencyManagementExtension>().apply {
            imports {
                mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
            }
    }

    tasks.withType<KotlinCompile>().configureEach {
        println("Configuring $name in project ${project.name}...")
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }


}

dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}

kotlinter {
    continuationIndentSize = 4
}
