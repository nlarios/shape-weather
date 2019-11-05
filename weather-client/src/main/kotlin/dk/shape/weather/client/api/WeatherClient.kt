package dk.shape.weather.client.api

import dk.shape.weather.model.entity.OpenWeatherResponse


interface WeatherClient {

    fun getCurrentWeather()

    fun getShortTermWeather(locationId: Int): OpenWeatherResponse?

    fun getHourlyWeather(locationId: Int): OpenWeatherResponse?

    fun getLongTermWeather(locationId: Int): OpenWeatherResponse?

}