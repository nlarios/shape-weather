package dk.shape.weather.model

data class Weather (
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)