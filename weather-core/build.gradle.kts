
plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlin.plugin.noarg") version "1.3.31"

}

kotlinSpring()
kotlinProject()
kotlinCore()

dependencies {
    implementation(project(":weather-persistence"))
    implementation(project(":weather-client"))
    implementation(project(":weather-regulator"))
    compile(project(":weather-model"))
}