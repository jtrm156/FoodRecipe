package com.ujh.data.remote.model

data class Digest(
    val daily: Int,
    val hasRDI: Boolean,
    val label: String,
    val schemaOrgTag: String,
    val sub: Sub,
    val tag: String,
    val total: Int,
    val unit: String
)