package com.foxcoder.cvapplication.models

import java.io.Serializable

data class SocialHandle(
    val platform: String,
    val userName: String,
    val platformIcon: Int,
    val profileUrl: String
) : Serializable
