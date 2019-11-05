package dk.shape.weather.model.entity

import com.fasterxml.jackson.annotation.JsonProperty
import dk.shape.weather.model.dto.LocationDTO

data class Location(
    val id: Int,
    val name: String,
    val coord: Coordinates,
    val country: String
) {
    data class Coordinates(
        @JsonProperty("lat")
        val latitude: Double,
        @JsonProperty("lon")
        val longitude: Double
    )

    fun toLocationDTO() = LocationDTO(
        id = id,
        name = name,
        latitude = coord.latitude,
        longitude = coord.longitude,
        country = country
    )
}