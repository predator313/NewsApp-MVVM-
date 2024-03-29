package com.example.newsapp.ui.api

import com.example.newsapp.ui.models.NewsResponse
import com.example.newsapp.ui.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode:String="in",
        @Query("page")
        pageNumber:Int=1,
        @Query("apikey")
        apikey:String=API_KEY
    ):Response<NewsResponse>
    @GET("v2/everythings")
    suspend fun searchForNews(
        @Query("q")
        searchQuery:String,
        @Query("page")
        pageNumber:Int=1,
        @Query("apikey")
        apikey:String=API_KEY
    ):Response<NewsResponse>
}