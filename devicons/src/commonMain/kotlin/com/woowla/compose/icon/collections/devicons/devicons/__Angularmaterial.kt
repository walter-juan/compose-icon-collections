package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.angularmaterial.Original
import com.woowla.compose.icon.collections.devicons.devicons.angularmaterial.Plain
import kotlin.collections.List as ____KtList

public object AngularmaterialGroup

public val Devicons.Angularmaterial: AngularmaterialGroup
  get() = AngularmaterialGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AngularmaterialGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
