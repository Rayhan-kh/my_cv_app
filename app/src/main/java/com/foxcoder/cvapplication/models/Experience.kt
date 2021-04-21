package com.foxcoder.cvapplication.models

import java.io.Serializable

data class Experience(
    var joinDate: String? = null,
    var terminatedDate: String? = null,
    var currentlyEmployed: Boolean = false,
    var companyName: String,
    var designation: String = "Mobile app developer",
    var companyLogo: Int? = null
) : Serializable