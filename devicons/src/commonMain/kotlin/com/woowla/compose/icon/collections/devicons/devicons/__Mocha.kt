package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.mocha.Original
import com.woowla.compose.icon.collections.devicons.devicons.mocha.Plain
import kotlin.collections.List as ____KtList

public object MochaGroup

public val Devicons.Mocha: MochaGroup
  get() = MochaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MochaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
