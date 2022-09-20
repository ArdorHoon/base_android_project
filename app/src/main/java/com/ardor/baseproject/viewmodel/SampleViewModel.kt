package com.ardor.baseproject.viewmodel

import com.ardor.baseproject.base.BaseViewModel
import com.ardor.domain.usecase.SampleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(private val sampleUseCase: SampleUseCase) :
    BaseViewModel() {

    fun add(x: Int, y: Int): Int = sampleUseCase.invoke(x, y)

}