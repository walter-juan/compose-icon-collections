package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ngrx.Original
import com.woowla.compose.icon.collections.devicons.devicons.ngrx.Plain
import kotlin.collections.List as ____KtList

public object NgrxGroup

public val Devicons.Ngrx: NgrxGroup
  get() = NgrxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NgrxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
