package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.androidstudio.Original
import com.woowla.compose.icon.collections.devicons.devicons.androidstudio.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.androidstudio.Plain
import com.woowla.compose.icon.collections.devicons.devicons.androidstudio.PlainWordmark
import kotlin.collections.List as ____KtList

public object AndroidstudioGroup

public val Devicons.Androidstudio: AndroidstudioGroup
  get() = AndroidstudioGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AndroidstudioGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
