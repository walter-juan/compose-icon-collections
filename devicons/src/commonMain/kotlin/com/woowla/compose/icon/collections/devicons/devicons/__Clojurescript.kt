package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.clojurescript.Original
import com.woowla.compose.icon.collections.devicons.devicons.clojurescript.Plain
import kotlin.collections.List as ____KtList

public object ClojurescriptGroup

public val Devicons.Clojurescript: ClojurescriptGroup
  get() = ClojurescriptGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ClojurescriptGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
