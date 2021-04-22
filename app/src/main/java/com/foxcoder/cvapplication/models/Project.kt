package com.foxcoder.cvapplication.models

data class Project(
    var projectName: String,
    var clientName: String?=null,
    var shortDescription: String,
    var longDescription: String? = null,
    var roles: List<String>? = ArrayList(),
    var appIcon: Int?,
    var storeUrl: String? = null,
    var gitUrl: String? = null,
)