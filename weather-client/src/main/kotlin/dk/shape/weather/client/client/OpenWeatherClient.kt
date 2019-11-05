package dk.shape.weather.client.client

import dk.shape.weather.client.api.ClientType
import dk.shape.weather.client.api.WeatherClient
import dk.shape.weather.client.provider.WeatherClientPropertiesProvider
import dk.shape.weather.model.entity.OpenWeatherResponse
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

import java.net.URI


@Component
class OpenWeatherClient (
    weatherClientPropertiesProvider: WeatherClientPropertiesProvider,
    private val restTemplate: RestTemplate
) : WeatherClient {

    private val clientProperties = weatherClientPropertiesProvider.getWeatherClientProperties(ClientType.OPEN_WEATHER)


    override fun getShortTermWeather(locationId: Int): OpenWeatherResponse? {
        val uri = URI("${clientProperties.basePath}${clientProperties.shortTermForecastPath}?id=$locationId&appid=${clientProperties.apiKey}")
        println(uri)
        return restTemplate.getForObject(uri, OpenWeatherResponse::class.java)
    }

    override fun getHourlyWeather(locationId: Int): OpenWeatherResponse? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getCurrentWeather() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getLongTermWeather(locationId: Int): OpenWeatherResponse? {
        val uri = URI("${clientProperties.basePath}/${clientProperties.longTermForecastPath}/id=$locationId&appid=${clientProperties.apiKey}")
        println(uri)
        return restTemplate.getForObject(uri, OpenWeatherResponse::class.java)
    }



}