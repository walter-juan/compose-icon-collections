package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.scikitlearn.Line
import com.woowla.compose.icon.collections.devicons.devicons.scikitlearn.Original
import com.woowla.compose.icon.collections.devicons.devicons.scikitlearn.Plain
import kotlin.collections.List as ____KtList

public object ScikitlearnGroup

public val Devicons.Scikitlearn: ScikitlearnGroup
  get() = ScikitlearnGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ScikitlearnGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
