package com.mogmet.traveltest.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AmericaViewModel : ViewModel() {
    private val _labelText: MutableLiveData<String> = MutableLiveData<String>().also {
            mutableLiveData -> mutableLiveData.value = "USA"
    }
    val labelText: LiveData<String>
        get() = _labelText

    fun setupLabel(text: String) {
        _labelText.value = text
    }
}
