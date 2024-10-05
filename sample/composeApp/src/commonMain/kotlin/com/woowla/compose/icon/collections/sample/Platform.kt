package com.woowla.compose.icon.collections.sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform