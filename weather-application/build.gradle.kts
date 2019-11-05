plugins {
    application
    kotlin("jvm")
}

kotlinSpring()
kotlinProject()

application  {
    mainClassName ="dk.shape.weather.application.WeatherApplicationKt"
}


dependencies {
    implementation(project(":weather-persistence"))
    implementation(project(":weather-client"))
    implementation(project(":weather-regulator"))
    implementation(project(":weather-core"))
    compile(project(":weather-model"))

}

