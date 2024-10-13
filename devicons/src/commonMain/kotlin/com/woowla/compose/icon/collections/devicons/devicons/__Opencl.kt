package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.opencl.Line
import com.woowla.compose.icon.collections.devicons.devicons.opencl.Original
import com.woowla.compose.icon.collections.devicons.devicons.opencl.Plain
import kotlin.collections.List as ____KtList

public object OpenclGroup

public val Devicons.Opencl: OpenclGroup
  get() = OpenclGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OpenclGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
