package dk.shape.weather.model.entity

data class TempMain (
    var temp: Double,
    var temp_min: Double,
    var temp_max: Double,
    val pressure: Double,
    val sea_level: Double,
    val grnd_level: Double,
    val humidity: Int,
    val temp_kf: Int
) {
  fun changeTemps(temp: Double, temp_max: Double, temp_min: Double): TempMain{
      this.temp = temp
      this.temp_max = temp_max
      this.temp_min = temp_min
      return this
  }
}