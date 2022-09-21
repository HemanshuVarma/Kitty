package com.varma.hemanshu.kitty.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.varma.hemanshu.kitty.data.viewmodels.HomeViewModel
import com.varma.hemanshu.kitty.repository.Repository

class ViewModelProviderFactory(private val repository: Repository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        HomeViewModel(repository = repository) as T
}