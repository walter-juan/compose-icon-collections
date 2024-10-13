package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nuxtjs.Original
import com.woowla.compose.icon.collections.devicons.devicons.nuxtjs.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nuxtjs.Plain
import com.woowla.compose.icon.collections.devicons.devicons.nuxtjs.PlainWordmark
import kotlin.collections.List as ____KtList

public object NuxtjsGroup

public val Devicons.Nuxtjs: NuxtjsGroup
  get() = NuxtjsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NuxtjsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
