package com.example.network.data.model

import com.google.gson.annotations.SerializedName

data class CatImageModel(
    val id: String,
    val url: String,
    val width: Int,
    val height: Int,
    val breeds: List<Breed>? = null
)

data class Breed(
    val id: String,
    val name: String,
    val temperament: String? = null,
    val description: String? = null,
    val origin: String? = null,
    @SerializedName("life_span")
    val lifeSpan: String? = null,
)