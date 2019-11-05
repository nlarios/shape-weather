plugins {
    kotlin("jvm")
}

kotlinSpring()
kotlinProject()

dependencies {
    compile(project(":weather-model"))
}

