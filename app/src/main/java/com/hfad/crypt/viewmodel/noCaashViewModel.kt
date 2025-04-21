package com.hfad.crypt.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hfad.crypt.api.Repository
import com.hfad.crypt.data.NocushCurrenceRate
import kotlinx.coroutines.launch
import retrofit2.Response

class noCaashViewModel:ViewModel(){
    val repository = Repository()
    val NocashList :MutableLiveData<Response<NocushCurrenceRate>> = MutableLiveData()
    fun getDataFromRep(){
        viewModelScope.launch{
            NocashList.value = repository.getNoCash()
        }
    }
}