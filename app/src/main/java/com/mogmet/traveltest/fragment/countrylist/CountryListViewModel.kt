package com.mogmet.traveltest.fragment.countrylist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountryListViewModel : ViewModel() {
    private val _countries = mutableListOf<MutableLiveData<String>>()
    val countries: List<LiveData<String>>
        get() = _countries
    private val _goOut = MutableLiveData<String>()
    val goOut: LiveData<String>
        get() = _goOut

    fun setup() {
        listOf("America", "Japan", "Bali").forEach { country ->
            _countries.add(MutableLiveData<String>().also { it.value = country })
        }
    }

    fun onClickCountry(position: Int) {
        _goOut.value = countries[position].value
    }
}
