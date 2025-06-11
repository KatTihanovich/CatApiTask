package com.example.network.data.network

import com.example.network.data.model.CatImageModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

// NEVER DO IT IN PROD
private const val API_KEY = "live_pfSFuZfQpEA3E5adHygQKLnM9urKL10ulWs1zIDbyGwCjKZSSpQsfqvsFUOVD0my"

interface CatApiService {
    @GET("v1/images/search")
    suspend fun getRandomCats(
        @Query("limit") limit: Int = 10,
        @Query("size") size: String = "med",
        @Query("has_breeds") hasBreeds: Int = 1,
        @Header("x-api-key") apiKey: String = API_KEY
    ): List<CatImageModel>
    
    @GET("v1/images/search")
    suspend fun getCatsByBreed(
        @Query("breed_ids") breedId: String,
        @Query("limit") limit: Int = 10,
        @Header("x-api-key") apiKey: String = API_KEY
    ): List<CatImageModel>
}