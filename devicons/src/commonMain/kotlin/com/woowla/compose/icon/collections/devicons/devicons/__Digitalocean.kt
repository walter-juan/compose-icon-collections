package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.digitalocean.Original
import com.woowla.compose.icon.collections.devicons.devicons.digitalocean.OriginalWordmark
import kotlin.collections.List as ____KtList

public object DigitaloceanGroup

public val Devicons.Digitalocean: DigitaloceanGroup
  get() = DigitaloceanGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DigitaloceanGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
