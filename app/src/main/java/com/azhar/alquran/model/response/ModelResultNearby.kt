package com.azhar.alquran.model.response

import com.google.gson.annotations.SerializedName
import com.azhar.alquran.model.nearby.ModelResults



class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}