package dk.shape.weather.regulator.cache

import com.google.common.cache.CacheBuilder
import com.google.common.cache.CacheLoader
import com.google.common.cache.LoadingCache
import dk.shape.weather.client.api.WeatherClient
import dk.shape.weather.model.entity.Forecast
import dk.shape.weather.model.entity.OpenWeatherResponse
import org.springframework.stereotype.Component
import java.util.concurrent.TimeUnit


@Component
class WeatherCache(weatherClient: WeatherClient) {
    val weatherCache: LoadingCache<Int, OpenWeatherResponse> = CacheBuilder.newBuilder()
            .expireAfterAccess(1, TimeUnit.DAYS)      // cache will expire after 1 day of access
        .build(object : CacheLoader<Int, OpenWeatherResponse>() {  // build the cacheloader

            @Throws(Exception::class)
            override fun load(locationId: Int): OpenWeatherResponse?{
                //make the expensive call
//                    if
                var response = weatherClient.getShortTermWeather(locationId)
                println("Response: $response")

                return response
            }
        })
}

