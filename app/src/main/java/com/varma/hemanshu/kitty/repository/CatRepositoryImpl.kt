package com.varma.hemanshu.kitty.repository

import com.varma.hemanshu.kitty.api.CatApi
import com.varma.hemanshu.kitty.data.models.CatResponse
import retrofit2.Response

class CatRepositoryImpl : Repository {

    override suspend fun getCats(limit: Int): Response<List<CatResponse>> {
        return CatApi.api.getCatsList(limit)
    }
}