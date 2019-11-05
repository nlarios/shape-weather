package dk.shape.weather.model.entity

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

class Forecast (
    val dt: Long,
    var main: TempMain,
    val weather: List<Weather>,
    val wind: Wind,
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val clouds: Clouds?,
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val snow: Snow?,
    val dt_txt: String?
) {
    data class Wind (
        val speed: Double,
        val deg: Int
    )

    data class Clouds (
        val all: Int
    )

    data class Snow (
        val all: Int
    )
}