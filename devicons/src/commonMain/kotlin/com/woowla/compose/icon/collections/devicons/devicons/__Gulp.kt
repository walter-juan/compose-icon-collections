package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gulp.Plain
import kotlin.collections.List as ____KtList

public object GulpGroup

public val Devicons.Gulp: GulpGroup
  get() = GulpGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GulpGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Plain)
    return __AllIcons!!
  }
