package com.varma.hemanshu.kitty.data.viewmodels

import androidx.lifecycle.ViewModel
import com.varma.hemanshu.kitty.repository.Repository

class HomeViewModel(val repository: Repository) : ViewModel() {

    init {
        println("ViewModel init")
    }
}