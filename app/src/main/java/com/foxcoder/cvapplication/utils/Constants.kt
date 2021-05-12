package com.foxcoder.cvapplication.utils

import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.models.*


val myExperiences =
    listOf(
        Experience(
            joinDate = "December 2019",
            currentlyEmployed = true,
            companyName = "Go Zayaan Pvt. Ltd.",
            companyLogo = R.drawable.gz
        ),
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

val myProjects = listOf(
    Project(
        projectName = "Shuttle",
        clientName = "Go Zayaan Pvt. Ltd.",
        shortDescription = "An app to provide shuttle service during Covid-19 pandemic.Unfortunately currently discontinued",
        contributions = listOf("Designed", "Developed"),
        appIcon = R.drawable.shuttle,
        storeUrl = "http://gozayaan.com",
    ),
    Project(
        projectName = "HateemTai",
        clientName = "ConstantMD Inc.",
        shortDescription = "HatemTai is an e-commerce plat form which can help you source products not available locally! Win an iphone by giving us name of a product that you can’t find locally. Please sign up at HateemTai.com and send us the name.",
        contributions = listOf("Developed as part of team"),
        appIcon = R.drawable.hatemtai,
        storeUrl = "https://play.google.com/store/apps/details?id=com.constantmd.hateemtai&hl=en",

        ),
    Project(
        projectName = "Jorip.me",
        clientName = "ConstantMD Inc.",
        shortDescription = "Jorip gives you ability to collect data from anytime in anywhere in the world. Setup questionnaire, assign Surveyor and Start Collecting Data in minutes.",
        contributions = listOf("Designed", "Developed"),
        appIcon = R.drawable.jorip,
        storeUrl = "https://play.google.com/store/apps/details?id=com.constantmd.jorip&hl=en",
    ),
    Project(
        projectName = "Uddom",
        clientName = "Rahimafrooz Solar",
        shortDescription = "Uddom, a smart phone based application, UDDOM, to mobilize the untapped potential of the rural unserved market/population.",
        contributions = listOf("Developed as part of team"),
        appIcon = R.drawable.uddom,
        storeUrl = "http://rahimafrooz-solar.com/uddom/"
    ),
    Project(
        projectName = "Truck Pathao (ট্রাক পাঠাও)",
        clientName = "TruckPathao Inc.",
        shortDescription = "Truck Pathao make transportation easier. You can hire or rent a vehicles, such as trucks, covered vans, prime movers etc.",
        contributions = listOf("Design", "Planned", "Developed", "Freelance Project"),
        appIcon = R.drawable.truck,
        storeUrl = "https://play.google.com/store/apps/details?id=com.truckpathao.www",
    )
)
val coreSkills = listOf(
    "Ability to multitask with strict time constraints, budgets and business goals.",
    "Writing efficient code.", "Consistently delivers working software that meets standards.",
    "Efficiently executes assigned task with proper documentation and coding structure.",
    "Ensures applications meet the acceptance criteria.",
    "Prioritizes programming work and assigns tasks.",
    "Appropriately deals with problems in the team.",
    "Collaborates closely with customers.",
    "Monitors timeliness of attendance at team meetings.",
    "Experienced Android application and integrating android payment SDKs.",
    "Researching different software programs, maintaining software documentation.",
    "Knowledge and experience of fundamental Android components and libraries like Dependency Injection, Live Data, View Binding, Navigation component etc  "
)

val programmingLanguages = listOf("Kotlin", "java", "C++", "Dart", "Swift")
val ide = listOf("Intellij", "VS Code", "Android Studio")
val os = listOf("Windows", "macOS", "linux")
val designTools = listOf("Figma", "Adobe XD", "Adobe Illustrator", "Adobe InDesign", "Adobe Photoshop")
val vsc = listOf("GitHub", "BitBucket", "Source Tree")
val designPattern = listOf("MVP", "MVVM", "Google Material Design")

val personalDataItems = listOf(
    PersonalDataItem("Academic Accomplishments", R.drawable.ic_education),
    PersonalDataItem("Professional Trainings", R.drawable.ic_certification),
    PersonalDataItem("Languages I Speak", R.drawable.ic_language),
    PersonalDataItem("Leisure Interests", R.drawable.ic_hobbies),
    PersonalDataItem("Social Handles", R.drawable.ic_like),
)

val academicAccomplishmentItems = listOf(
    AcademicAccomplishmentItem(
        schoolName = "East West University, Dhaka",
        degree = "Bachelor of Science (BSc)",
        cgpa = "2.72 (With 79% marks) Out of 4",
        passingYear = "2015",
        department = "Computer Science and Engineering"
    ),

    AcademicAccomplishmentItem(
        schoolName = "B.A.F. Shaheen College, Dhaka",
        degree = "Higher Secondary Certificate (HSC)",
        cgpa = "4.3 Out of 5",
        passingYear = "2010",
        department = "Science Department"
    ),

    AcademicAccomplishmentItem(
        schoolName = "Chandpur Hasan Ali Govt. High School",
        degree = "Secondary Certificate (SSC)",
        cgpa = "5 Out of 5 with Scholarship",
        passingYear = "2008",
        department = "Science Department"
    ),
)

val trainings = listOf(
    TrainingItem(
        institute = "Basis Institute of Technology & Management (BITM)",
        date = "2016", subject = "Professional Android Application Development", durations = "120 Hours"
    )
)

val languagesISpeak = listOf(
    LanguageItem("Bangla", "Native speaker"),
    LanguageItem("English", "Can speak and write professionally"),
    LanguageItem("Japanese", "Hi-Hello")

)

val myHobbies =
    listOf("IOT","Aquascaping", "Cycling", "Photography" ,"Farming", "Traveling", "Poetry", "Cooking", "DIY projects")