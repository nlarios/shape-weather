package dk.shape.weather.client.client

import dk.shape.weather.client.api.WeatherClient
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class OpenWeatherClient (restTemplate: RestTemplate) : WeatherClient {

    private val restTemplate: RestTemplate = restTemplate

    init {

    }

    override fun getCurrentWeather() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getShortTermWeather() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLongTermWeather() {
//        restTemplate.getForEntity("",List<String>)
    }




}