package com.varma.hemanshu.kitty.repository

import com.varma.hemanshu.kitty.data.models.CatResponse
import retrofit2.Response

interface Repository {

    suspend fun getCats(limit: Int): Response<List<CatResponse>>
}