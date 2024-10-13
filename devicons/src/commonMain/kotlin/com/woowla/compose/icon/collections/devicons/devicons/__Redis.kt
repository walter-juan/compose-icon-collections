package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.redis.Original
import com.woowla.compose.icon.collections.devicons.devicons.redis.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.redis.Plain
import com.woowla.compose.icon.collections.devicons.devicons.redis.PlainWordmark
import kotlin.collections.List as ____KtList

public object RedisGroup

public val Devicons.Redis: RedisGroup
  get() = RedisGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RedisGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
