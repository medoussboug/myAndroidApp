package com.example.trendingrespositoriesapp.domain

import com.example.trendingrespositoriesapp.domain.DTOs.TrendingRepositoriesDTO
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import java.text.SimpleDateFormat
import java.util.*

enum class GithubApiStatus { LOADING, ERROR, DONE }

class GithubClient {
    val retrofitService: GithubServices by lazy { retrofit.create(GithubServices::class.java) }

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL_TRENDING_REPOSITORIES)
        .build()

    companion object {
        private val DATE = SimpleDateFormat("YYYY-MM-DD", Locale.getDefault()).toString()
        private val BASE_URL_TRENDING_REPOSITORIES =
            "https://api.github.com/search/repositories?q=created:>" + DATE
    }
}

interface GithubServices {
    @GET("&sort=stars&order=desc")
    fun getMostStaredRepositories(): TrendingRepositoriesDTO
}


