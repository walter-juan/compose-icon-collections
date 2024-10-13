package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.foundation.Original
import com.woowla.compose.icon.collections.devicons.devicons.foundation.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.foundation.Plain
import com.woowla.compose.icon.collections.devicons.devicons.foundation.PlainWordmark
import kotlin.collections.List as ____KtList

public object FoundationGroup

public val Devicons.Foundation: FoundationGroup
  get() = FoundationGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FoundationGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
