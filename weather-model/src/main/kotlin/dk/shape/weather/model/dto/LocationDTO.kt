package dk.shape.weather.model.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationDTO (
    val id: Int,
    val name: String,
    @JsonProperty("lat")
    val latitude: Double,
    @JsonProperty("lon")
    val longitude: Double,
    val country: String
)