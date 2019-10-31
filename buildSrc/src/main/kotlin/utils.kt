
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
    }
}


/**
 * Configures the current project as a Kotlin project by adding the Kotlin `stdlib` as a dependency.
 */
fun Project.kotlinProject() {
    dependencies {
        // Kotlin libs
        "implementation"(kotlin("stdlib-jdk8"))

        // Logging
//        "implementation"("org.slf4j:slf4j-simple:1.7.25")
//        "implementation" ("log4j:log4j:1.2.17")

//        "implementation"("io.github.microutils:kotlin-logging:1.6.22")

        "annotationProcessor"("org.springframework.boot:spring-boot-configuration-processor")

        // Mockk
        "testImplementation"("io.mockk:mockk:1.9")

        // JUnit 5
        "testImplementation"("org.junit.jupiter:junit-jupiter-api:$junitVersion")
        "testImplementation"("org.junit.jupiter:junit-jupiter-params:$junitVersion")
        "runtime"("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
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