package dk.shape.weather.core.service

import dk.shape.weather.model.dto.LocationDTO
import dk.shape.weather.model.dto.OpenWeatherResponseDTO
import dk.shape.weather.model.entity.Location
import dk.shape.weather.model.entity.OpenWeatherResponse
import dk.shape.weather.model.entity.TempUnit

interface WeatherService {

    fun getLocationsWithForecast(unit: TempUnit, locations: List<Int>, temp: Double ): List<LocationDTO>

    fun getForecastForLocation(locationId: Int): OpenWeatherResponseDTO
}