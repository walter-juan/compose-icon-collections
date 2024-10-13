package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jetbrains.Original
import com.woowla.compose.icon.collections.devicons.devicons.jetbrains.Plain
import kotlin.collections.List as ____KtList

public object JetbrainsGroup

public val Devicons.Jetbrains: JetbrainsGroup
  get() = JetbrainsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JetbrainsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
