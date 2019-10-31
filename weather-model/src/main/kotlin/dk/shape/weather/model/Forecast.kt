package dk.shape.weather.model

class Forecast (
    val dt: Long,
    val temp: Temp,
    val pressure: Double,
    val humidity: Int,
    val weather: Weather,
    val speed: Double,
    val deg: Int,
    val snow: Double
)