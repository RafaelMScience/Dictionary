package com.techrmr.dictionary.feature_dictionary.data.remote.dto

import com.techrmr.dictionary.feature_dictionary.data.local.entity.WordInfoEntity

data class WordInfoDTO(
    val meanings: List<MeaningDTO>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDTO>,
    val word: String
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings.map { it.toMeaining() },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }
}