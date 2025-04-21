package com.hfad.crypt.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hfad.crypt.api.Repository
import com.hfad.crypt.data.cushCurrencyRate
import kotlinx.coroutines.launch
import retrofit2.Response

class cashViewModel:ViewModel() {
    val repository = Repository()
    val cryptoList:MutableLiveData<Response<cushCurrencyRate>> = MutableLiveData()
    fun getCryptoData() {
        viewModelScope.launch {
            cryptoList.value = repository.getCash()
        }
    }

}