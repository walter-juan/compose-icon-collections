package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.bootstrap.Original
import com.woowla.compose.icon.collections.devicons.devicons.bootstrap.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.bootstrap.Plain
import com.woowla.compose.icon.collections.devicons.devicons.bootstrap.PlainWordmark
import kotlin.collections.List as ____KtList

public object BootstrapGroup

public val Devicons.Bootstrap: BootstrapGroup
  get() = BootstrapGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BootstrapGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
