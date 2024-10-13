package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.opengl.Original
import com.woowla.compose.icon.collections.devicons.devicons.opengl.Plain
import kotlin.collections.List as ____KtList

public object OpenglGroup

public val Devicons.Opengl: OpenglGroup
  get() = OpenglGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OpenglGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
