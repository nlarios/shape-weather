package dk.shape.weather.model.entity

import com.fasterxml.jackson.annotation.JsonProperty

data class OpenWeatherResponse(
    val code: Int,
    val message: String,
    @JsonProperty("city")
    val location: Location,
    val count: Int,
    @JsonProperty("list")
    val forecast: List<Forecast>
)