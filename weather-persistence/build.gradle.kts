plugins {

    kotlin("jvm")
}

kotlinSpring()
kotlinProject()


dependencies {
    implementation(project(":weather-core"))
    compile(project(":weather-model"))
}

