package dk.shape.weather.core.service

import dk.shape.weather.client.client.OpenWeatherClient
import dk.shape.weather.core.utils.EntityDtoMapper
import dk.shape.weather.core.utils.convertTemp
import dk.shape.weather.model.dto.LocationDTO
import dk.shape.weather.model.dto.OpenWeatherResponseDTO
import dk.shape.weather.model.entity.Forecast
import dk.shape.weather.model.entity.OpenWeatherResponse
import dk.shape.weather.model.entity.TempUnit
import dk.shape.weather.regulator.cache.WeatherCacheService
import org.springframework.stereotype.Service
import java.util.stream.Collectors
import kotlin.streams.toList

@Service
class OpenWeatherService(
    private val weatherCacheService: WeatherCacheService
) : WeatherService {
    companion object Mapper {
        val mapper = EntityDtoMapper()

        inline fun <S, reified T> convert(source: S): T = mapper.map(source, T::class.java)
    }

    override fun getLocationsWithForecast(unit: TempUnit, locations: List<Int>, temp: Double): List<LocationDTO> {
        var locationsForecast: List<OpenWeatherResponse> =
            locations.map { weatherCacheService.checkCacheForLocation(it) }

        locationsForecast.stream().forEach { it.forecast.stream().forEach{ f -> f.main = convertTemp(f.main, unit) }}

        locationsForecast.stream().forEach {it.forecast.stream().forEach{ f -> println(f.main.temp) }}

        val locationDtos = locationsForecast.stream().filter {
            it.forecast.stream().anyMatch { forecast -> forecast.main.temp_max > temp }
        }.map { it.location.toLocationDTO() }.toList()

        return locationDtos
    }

    override fun getForecastForLocation(locationId: Int): OpenWeatherResponseDTO {

        var locationsForecast = weatherCacheService.checkCacheForLocation(locationId)
        println(locationsForecast)

        return convert(locationsForecast)
    }


}