package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.helm.Line
import com.woowla.compose.icon.collections.devicons.devicons.helm.Original
import kotlin.collections.List as ____KtList

public object HelmGroup

public val Devicons.Helm: HelmGroup
  get() = HelmGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HelmGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original)
    return __AllIcons!!
  }
