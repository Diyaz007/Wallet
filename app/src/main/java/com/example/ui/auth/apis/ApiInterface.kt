package com.example.ui.auth.apis

import com.example.ui.auth.models.MarketModel
import okhttp3.Response
import retrofit2.http.GET
interface ApiInterface {

    @GET("data-api/v3/cryptocurrency/listing?start=1&limit=500")
    suspend fun getMarketData() : Response
}