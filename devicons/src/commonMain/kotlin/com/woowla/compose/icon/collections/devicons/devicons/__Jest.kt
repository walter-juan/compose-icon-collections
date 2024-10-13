package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jest.Plain
import kotlin.collections.List as ____KtList

public object JestGroup

public val Devicons.Jest: JestGroup
  get() = JestGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JestGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Plain)
    return __AllIcons!!
  }
