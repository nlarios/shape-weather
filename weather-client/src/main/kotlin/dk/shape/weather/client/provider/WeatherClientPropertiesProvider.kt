package dk.shape.weather.client.provider

import dk.shape.weather.client.api.ClientType
import dk.shape.weather.client.configuration.WeatherClientsProperties
import dk.shape.weather.client.exception.UnsupportedWeatherClient
import org.springframework.stereotype.Component
import java.util.*

@Component
class WeatherClientPropertiesProvider(weatherClientsProperties: WeatherClientsProperties): ClientPropertiesProvider {

    private val weatherClientProperties = weatherClientsProperties

    override fun getWeatherClientProperties(clientType: ClientType): WeatherClientsProperties.ClientProperties {
        return Optional.ofNullable(weatherClientProperties.clients[clientType.stringType]).orElseThrow {
            UnsupportedWeatherClient(
                clientType
            )
        }
    }


}