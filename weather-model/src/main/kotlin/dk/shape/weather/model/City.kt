package dk.shape.weather.model

import javax.management.monitor.StringMonitor

data class City (
    val geonameId: Int,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val country: String,
    val iso2: String,
    val type: String,
    val population: Int
)