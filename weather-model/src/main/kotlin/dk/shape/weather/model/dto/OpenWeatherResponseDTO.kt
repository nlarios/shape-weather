package dk.shape.weather.model.dto

import com.fasterxml.jackson.annotation.JsonProperty
import dk.shape.weather.model.entity.Forecast
import dk.shape.weather.model.entity.Location

class OpenWeatherResponseDTO (
    val code: Int,
    val message: String,
    @JsonProperty("city")
    val location: Location,
    val count: Int,
    @JsonProperty("list")
    val forecast: List<Forecast>
)