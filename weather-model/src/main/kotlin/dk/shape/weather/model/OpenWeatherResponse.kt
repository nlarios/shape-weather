package dk.shape.weather.model

data class OpenWeatherResponse (
    val code: Int,
    val message: String,
    val city: City,
    val count: Int,
    val forecast: List<Forecast>
)