package dk.shape.weather.client.configuration

import dk.shape.weather.client.api.ClientType
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "weather")
class WeatherClientsProperties {

    lateinit var clients: Map<String, ClientProperties>

    class ClientProperties {
        lateinit var basePath: String
        lateinit var currentWeatherPath: String
        lateinit var shortTermForecastPath: String
        lateinit var hourlyForecastPath: String
        lateinit var longTermForecastPath: String
        lateinit var apiKey: String
    }

}