package com.techrmr.dictionary.feature_dictionary.data.remote.dto

import com.techrmr.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoDTO(
    val meanings: List<MeaningDTO>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDTO>,
    val word: String
){
    fun toWordInfo(): WordInfo{
        return WordInfo(
            meanings = meanings.map { it.toMeaining() },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }
}