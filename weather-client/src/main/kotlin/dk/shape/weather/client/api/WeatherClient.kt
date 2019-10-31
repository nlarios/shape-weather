package dk.shape.weather.client.api

interface WeatherClient {

    fun getCurrentWeather()

    fun getShortTermWeather()

    fun getLongTermWeather()

}