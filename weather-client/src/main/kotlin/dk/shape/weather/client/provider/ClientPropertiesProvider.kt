package dk.shape.weather.client.provider

import dk.shape.weather.client.api.ClientType
import dk.shape.weather.client.api.WeatherClient
import dk.shape.weather.client.configuration.WeatherClientsProperties

interface ClientPropertiesProvider {
    fun getWeatherClientProperties(clientType: ClientType): WeatherClientsProperties.ClientProperties?
}