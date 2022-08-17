package com.example.anotacioneskoinejemplo.viemodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.anotacioneskoinejemplo.model.ColorModel
import com.example.anotacioneskoinejemplo.model.ColorProvider
import org.koin.android.annotation.KoinViewModel
import org.koin.java.KoinJavaComponent.inject

@KoinViewModel
class ColorViewModel(val colorProvider: ColorProvider): ViewModel() {

    val colorModel= MutableLiveData<ColorModel>()


    fun randomColor() {
        val currentColor: ColorModel = colorProvider.random()
        colorModel.postValue(currentColor)
    }
}