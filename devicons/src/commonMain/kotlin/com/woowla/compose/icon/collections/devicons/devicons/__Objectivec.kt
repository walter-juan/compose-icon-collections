package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.objectivec.Plain
import kotlin.collections.List as ____KtList

public object ObjectivecGroup

public val Devicons.Objectivec: ObjectivecGroup
  get() = ObjectivecGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ObjectivecGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Plain)
    return __AllIcons!!
  }
