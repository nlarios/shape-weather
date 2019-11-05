package dk.shape.weather.regulator.cache

import dk.shape.weather.model.entity.Forecast
import dk.shape.weather.model.entity.OpenWeatherResponse
import dk.shape.weather.regulator.api.CacheService
import org.springframework.stereotype.Service


@Service
class WeatherCacheService(val cache: WeatherCache): CacheService {

    override fun checkCacheForLocation(locationId: Int): OpenWeatherResponse {
        return cache.weatherCache[locationId]
    }

    override fun loadCacheFromPersistence() {

    }
}