package dk.shape.weather.application

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages=["dk.shape.weather.application", "dk.shape.weather.core", "dk.shape.weather.regulator",
    "dk.shape.weather.client", "dk.shape.weather.model"])
open class WeatherApplication


fun main(args: Array<String>) {
    runApplication<WeatherApplication>(*args)
}
