package com.marsya.idn.weatherrapp.models

import com.google.gson.annotations.SerializedName

data class Clouds (
    @field:SerializedName("all")
    val all: Int,
)