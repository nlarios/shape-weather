package dk.shape.weather.core.utils

import dk.shape.weather.model.entity.TempMain
import dk.shape.weather.model.entity.TempUnit

internal fun convertTempUnit(value: Double, unit: TempUnit): Double {
    return when (unit) {
        TempUnit.CELSIUS -> value * (9f / 5) + 32

        TempUnit.FAHRENHEIT -> ((value  - 32)*5)/9
    }
}

internal fun convertTempUnitFromKelvin(value: Double, unit: TempUnit): Double {
    return when (unit) {
        TempUnit.CELSIUS -> value - 273.15

        TempUnit.FAHRENHEIT -> (9/5) * value  - 459.67
    }
}

internal fun convertTempUnitToKelvin(value: Double, unit: TempUnit): Double {
    return when (unit) {
        TempUnit.CELSIUS -> value +272.15

        TempUnit.FAHRENHEIT -> value +457.87
    }
}

internal fun convertTemp(temp: TempMain, tempUnit: TempUnit): TempMain {
    return temp.changeTemps(
        temp = convertTempUnitFromKelvin(temp.temp, tempUnit),
        temp_max = convertTempUnitFromKelvin(temp.temp_max, tempUnit),
        temp_min = convertTempUnitFromKelvin(temp.temp_min, tempUnit)
        )
}