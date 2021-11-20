package com.techrmr.dictionary.feature_dictionary.domain.model

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>
)