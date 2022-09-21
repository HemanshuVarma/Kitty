package com.varma.hemanshu.kitty.data.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.varma.hemanshu.kitty.repository.Repository
import kotlinx.coroutines.launch

class HomeViewModel(val repository: Repository) : ViewModel() {

    init {
        println("ViewModel init")
        viewModelScope.launch {
            val result = repository.getCats(limit = 10)
            val body = result.body()?.get(0)
            println("result is: $body")
        }
    }
}