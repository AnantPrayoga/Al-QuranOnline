package com.azhar.alquran.model.nearby

import com.google.gson.annotations.SerializedName
import com.azhar.alquran.model.nearby.ModelLocation



class ModelGeometry {
    @SerializedName("location")
    lateinit var modelLocation: ModelLocation
}