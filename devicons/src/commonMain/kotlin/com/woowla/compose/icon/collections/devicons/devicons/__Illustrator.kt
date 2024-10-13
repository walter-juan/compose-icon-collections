package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.illustrator.Line
import com.woowla.compose.icon.collections.devicons.devicons.illustrator.Plain
import kotlin.collections.List as ____KtList

public object IllustratorGroup

public val Devicons.Illustrator: IllustratorGroup
  get() = IllustratorGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val IllustratorGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Plain)
    return __AllIcons!!
  }
