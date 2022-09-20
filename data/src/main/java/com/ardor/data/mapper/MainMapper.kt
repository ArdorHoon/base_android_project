package com.ardor.data.mapper

import com.ardor.data.model.Sample
import com.ardor.domain.model.SampleEntity

//mapper between data layer model and domain layer model
object MainMapper {

    fun sampleMapper(
        sampleEntity: SampleEntity
    ): Sample {
        return Sample(
            value = sampleEntity.value
        )
    }

}