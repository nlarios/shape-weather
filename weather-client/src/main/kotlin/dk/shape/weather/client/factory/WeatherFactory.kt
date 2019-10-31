package dk.shape.weather.client.factory

interface WeatherFactory {
    fun getWeatherClient(clientName: String)
}