package com.varma.hemanshu.kitty.api

import com.varma.hemanshu.kitty.data.models.CatResponse
import com.varma.hemanshu.kitty.util.Constants.API_KEY
import com.varma.hemanshu.kitty.util.Constants.QUERY_PAGE_SIZE
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CatApiService {

    @GET("v1/images/search")
    suspend fun getCatsList(
        @Query("limit")
        limit: Int = QUERY_PAGE_SIZE,
        @Query("api_key")
        apiKey: String = API_KEY
    ): Response<CatResponse>

}