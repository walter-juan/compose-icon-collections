package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.materializecss.Original
import com.woowla.compose.icon.collections.devicons.devicons.materializecss.Plain
import kotlin.collections.List as ____KtList

public object MaterializecssGroup

public val Devicons.Materializecss: MaterializecssGroup
  get() = MaterializecssGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MaterializecssGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
