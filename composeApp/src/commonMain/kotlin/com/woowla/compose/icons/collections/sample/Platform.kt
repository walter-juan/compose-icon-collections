package com.woowla.compose.icons.collections.sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform