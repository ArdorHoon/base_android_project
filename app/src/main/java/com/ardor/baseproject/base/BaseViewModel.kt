package com.ardor.baseproject.base

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
abstract class BaseViewModel : ViewModel() {
}