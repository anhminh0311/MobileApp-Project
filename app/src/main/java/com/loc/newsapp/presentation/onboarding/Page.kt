package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image: Int
)

val pages = listOf<Page>(
    Page(
        title = "Welcome to my News app",
        description = "Place you can update about everything from finance",
        image = R.drawable.onboarding1
    ),
    Page(
        title ="Welcome to my News app",
        description ="To travel and news around the world",
        image = R.drawable.onboarding2
    ),
    Page(
        title ="Welcome to my News app",
        description ="Or even discovery new dish and how to make it",
        image = R.drawable.onboarding3
    ),
)
