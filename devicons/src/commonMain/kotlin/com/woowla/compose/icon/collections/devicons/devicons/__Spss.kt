package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.spss.Original
import com.woowla.compose.icon.collections.devicons.devicons.spss.Plain
import kotlin.collections.List as ____KtList

public object SpssGroup

public val Devicons.Spss: SpssGroup
  get() = SpssGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SpssGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
