package com.foxcoder.cvapplication.utils

import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.models.Experience


val experiences =
    listOf(
        Experience(joinDate = "December 2019", currentlyEmployed = true, companyName = "Go Zayaan Pvt. Ltd.", companyLogo = R.drawable.gz),
        Experience(
            joinDate = "April 2018",
            terminatedDate = "October 2019",
            currentlyEmployed = false,
            companyName = "Softograph Ltd.",
            companyLogo = R.drawable.softo
        ),
        Experience(
            joinDate = "February 2017",
            terminatedDate = "March 2018",
            currentlyEmployed = false,
            companyName = "ConstantMD Inc.",
            designation = "Android Developer",
            companyLogo = R.drawable.constant
        ),

        Experience(
            joinDate = "November 2015",
            terminatedDate = "June 2016",
            currentlyEmployed = false,
            companyName = "EndingScene Inc.",
            designation = "Junior Developer",
            companyLogo = R.drawable.ending
        )

        )