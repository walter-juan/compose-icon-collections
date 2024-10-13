package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.google.Original
import com.woowla.compose.icon.collections.devicons.devicons.google.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.google.Plain
import com.woowla.compose.icon.collections.devicons.devicons.google.PlainWordmark
import kotlin.collections.List as ____KtList

public object GoogleGroup

public val Devicons.Google: GoogleGroup
  get() = GoogleGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GoogleGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
