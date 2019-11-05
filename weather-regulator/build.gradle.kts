
plugins {
    kotlin("jvm")
}

kotlinSpring()
kotlinProject()
cacheLibs()

dependencies {
    implementation(project(":weather-client"))
    compile(project(":weather-model"))
}