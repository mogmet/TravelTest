package com.mogmet.traveltest.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mogmet.traveltest.R

class TopViewModel : ViewModel() {
    private val _buttonText: MutableLiveData<String> = MutableLiveData<String>().also {
            mutableLiveData -> mutableLiveData.value = "Ready"
    }
    val buttonText: LiveData<String>
        get() = _buttonText

    private val _submitText: MutableLiveData<String> = MutableLiveData<String>().also {
            mutableLiveData -> mutableLiveData.value = "default"
    }
    val submitText: LiveData<String>
        get() = _submitText

    fun updateView(text: String) {
        _buttonText.value = "Set!"
        _submitText.value = text
    }
}
