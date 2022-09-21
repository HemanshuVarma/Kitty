package com.varma.hemanshu.kitty.api

import com.varma.hemanshu.kitty.util.Constants.BASE_API
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit by lazy {
    val logger = HttpLoggingInterceptor()
    logger.level = HttpLoggingInterceptor.Level.BODY

    val client = OkHttpClient.Builder()
        .addInterceptor(logger)
        .build()

    Retrofit.Builder()
        .baseUrl(BASE_API)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
}

/**
 * A public Api object that exposes the lazy-initialized Retrofit service
 */
object CatApi {

    val api: CatApiService by lazy {
        retrofit.create(CatApiService::class.java)
    }
}