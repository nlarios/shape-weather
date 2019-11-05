package dk.shape.weather.regulator.api

import dk.shape.weather.model.entity.Forecast
import dk.shape.weather.model.entity.OpenWeatherResponse

interface CacheService {

    fun checkCacheForLocation(locationId: Int): OpenWeatherResponse

    fun loadCacheFromPersistence()

}