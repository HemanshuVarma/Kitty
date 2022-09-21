package com.varma.hemanshu.kitty.repository

import com.varma.hemanshu.kitty.api.CatApi

class CatRepositoryImpl : Repository {

    override suspend fun getCats(limit: Int) {
        CatApi.api.getCatsList(limit)
    }
}