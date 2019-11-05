package dk.shape.weather.application.web

import dk.shape.weather.core.utils.enumContains
import dk.shape.weather.core.service.WeatherService
import dk.shape.weather.model.dto.LocationDTO
import dk.shape.weather.model.dto.OpenWeatherResponseDTO
import dk.shape.weather.model.entity.OpenWeatherResponse
import dk.shape.weather.model.entity.TempUnit
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["weather"])
class WeatherController (weatherService: WeatherService){

    private val weatherService = weatherService

    @RequestMapping("summary", method=[RequestMethod.GET])
    fun getLocationsWithTemp(
        @RequestParam("unit") unit: String,
        @RequestParam("locations") locations: List<Int>,
        @RequestParam("temp") temp: Double
    ): ResponseEntity <List<LocationDTO> >{
        var locationsDtos: List<LocationDTO>
//        var locations: List<Int> = locationsInput.split(",").map { it.trim().toInt() }
        println("FADFASFADSFSAFX")
        if(enumContains<TempUnit>(unit.toUpperCase())) {
            locationsDtos = weatherService.getLocationsWithForecast(TempUnit.valueOf(unit.toUpperCase()), locations, temp)
        }
        else {
            return ResponseEntity(HttpStatus.BAD_REQUEST)
        }

        return ResponseEntity(locationsDtos, HttpStatus.OK)
    }

    @RequestMapping("locations/{id}", method=[RequestMethod.GET])
    fun getForecastForLocation(@PathVariable("id")id: Int): ResponseEntity<OpenWeatherResponseDTO> {

        val openWeatherResponse = weatherService.getForecastForLocation(id)

        return ResponseEntity(openWeatherResponse, HttpStatus.OK)
    }

}