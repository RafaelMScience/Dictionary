package com.techrmr.dictionary.feature_dictionary.data.remote.dto

import com.techrmr.dictionary.feature_dictionary.domain.model.Meaning

data class MeaningDTO(
    val definitions: List<DefinitionDTO>,
    val partOfSpeech: String
) {
    fun toMeaining(): Meaning {
        return Meaning(
            definitions = definitions.map { it.toDefinition() },
            partOfSpeech = partOfSpeech
        )
    }
}