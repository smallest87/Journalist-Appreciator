package com.javasatu.journalistappreciator.model

data class DataJob(
    val id: Int,
    val jenisJob:List<String>,
    val topikBerita: String,
    val detailJob: String,
    val namaPekerja: String,
    val waktuJob: String
)
