package com.ardor.data

import com.ardor.domain.repository.SampleRepository

class SampleRepositoryImpl() : SampleRepository {
    override fun add(x: Int, y: Int): Int = x + y
}