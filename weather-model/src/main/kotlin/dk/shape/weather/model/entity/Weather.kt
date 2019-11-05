package dk.shape.weather.model.entity

data class Weather (
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)