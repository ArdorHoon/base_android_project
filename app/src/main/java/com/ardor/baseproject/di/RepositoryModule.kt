package com.ardor.baseproject.di

import com.ardor.data.SampleRepositoryImpl
import com.ardor.domain.repository.SampleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideSampleRepository(
    ): SampleRepository {
        return SampleRepositoryImpl()
    }

}