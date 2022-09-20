package com.ardor.domain.usecase

import com.ardor.domain.repository.SampleRepository
import javax.inject.Inject

class SampleUseCase @Inject constructor(private val repository: SampleRepository) {
    fun invoke(x: Int, y: Int): Int = repository.add(x, y)
}