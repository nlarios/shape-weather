plugins {

    kotlin("jvm")
}

kotlinSpring()
kotlinProject()
dataLibs()


dependencies {
    compile(project(":weather-model"))
}

