package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.aftereffects.Original
import com.woowla.compose.icon.collections.devicons.devicons.aftereffects.Plain
import kotlin.collections.List as ____KtList

public object AftereffectsGroup

public val Devicons.Aftereffects: AftereffectsGroup
  get() = AftereffectsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AftereffectsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
