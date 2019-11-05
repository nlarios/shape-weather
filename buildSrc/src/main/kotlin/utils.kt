
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.exclude
import org.gradle.kotlin.dsl.kotlin

const val junitVersion = "5.3.2"

fun Project.kotlinSpring() {
    dependencies {

        "implementation"("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        "implementation"("com.fasterxml.jackson.module:jackson-module-kotlin")
        "implementation"("org.springframework.boot:spring-boot-starter-web")
        "implementation"("com.fasterxml.jackson.module:jackson-module-kotlin")
        "implementation"("org.jetbrains.kotlin:kotlin-reflect")
        "testImplementation"("org.springframework.boot:spring-boot-starter-test") {
            exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        }
        "annotationProcessor"("org.springframework.boot:spring-boot-configuration-processor")

    }
}


/**
 * Configures the current project as a Kotlin project by adding the Kotlin `stdlib` as a dependency.
 */
fun Project.kotlinProject() {
    dependencies {
        // Kotlin libs
        "implementation"(kotlin("stdlib-jdk8"))

        // Mockk
        "testImplementation"("io.mockk:mockk:1.9")

        // JUnit 5
        "testImplementation"("org.junit.jupiter:junit-jupiter-api:$junitVersion")
        "testImplementation"("org.junit.jupiter:junit-jupiter-params:$junitVersion")
        "runtime"("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
    }
}

fun Project.cacheLibs() {
    dependencies {
        "implementation"("com.google.guava:guava:28.1-jre")
    }
}

fun Project.kotlinCore() {
    dependencies {
        // https://mvnrepository.com/artifact/org.modelmapper/modelmapper
        "implementation"("org.modelmapper:modelmapper:2.3.5")

    }
}

/**
 * Configures data layer libs needed for interacting with the DB
 */
fun Project.dataLibs() {
    dependencies {
        "implementation"("org.jetbrains.exposed:exposed:0.12.1")
        "implementation"("org.xerial:sqlite-jdbc:3.25.2")
    }
}