package dk.shape.weather.core.helpers

import dk.shape.weather.model.entity.Forecast
import dk.shape.weather.model.entity.TempMain
import dk.shape.weather.model.entity.Weather


fun mockForecast(
    dt: Long = 1485766800,
    temp: TempMain = mockTemp(),
    pressure: Double = 1024.53,
    humidity: Int = 76,
    weather: Weather = mockWeather(),
    speed: Double = 4.57,
    deg: Int = 225,
    clouds: Int = 0,
    snow: Double = 0.01
): Forecast {
    return Forecast(
        dt = dt,
        temp = temp,
        pressure = pressure,
        humidity = humidity,
        weather = weather,
        speed = speed,
        deg = deg,
        clouds = clouds,
        snow = snow
    )
}

fun mockTemp(
     day: Double = 262.5,
     min: Double = 261.41,
     max: Double = 262.65,
     night: Double = 261.41,
     evening: Double = 262.65,
     morning: Double = 262.65
): TempMain {
    return TempMain(
        day = day,
        min = min,
        max = max,
        night = night,
        evening = evening,
        morning = morning
    )
}

fun mockWeather(
     id: Int = 800,
     main: String = "Clear",
     description: String = "sky is clear",
     icon: String = "01d"
): Weather {
    return Weather(
        id = id,
        main = main,
        description = description,
        icon = icon
    )
}


