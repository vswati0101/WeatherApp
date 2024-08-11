package com.example.weatherapp.api

data class WeatherModel(
    val current: Current,
    val location: Location
)
data class Condition(
    val code: String,
    val icon: String,
    val text: String
)
data class Current(
    val cloud: String,
    val condition: Condition,
    val dewpoint_c: String,
    val dewpoint_f: String,
    val feelslike_c: String,
    val feelslike_f: String,
    val gust_kph: String,
    val gust_mph: String,
    val heatindex_c: String,
    val heatindex_f: String,
    val humidity: String,
    val is_day: String,
    val last_updated: String,
    val last_updated_epoch: String,
    val precip_in: String,
    val precip_mm: String,
    val pressure_in: String,
    val pressure_mb: String,
    val temp_c: String,
    val temp_f: String,
    val uv: String,
    val vis_km: String,
    val vis_miles: String,
    val wind_degree: String,
    val wind_dir: String,
    val wind_kph: String,
    val wind_mph: String,
    val windchill_c: String,
    val windchill_f: String
)
data class Location(
    val country: String,
    val lat: String,
    val localtime: String,
    val localtime_epoch: String,
    val lon: String,
    val name: String,
    val region: String,
    val tz_id: String
)