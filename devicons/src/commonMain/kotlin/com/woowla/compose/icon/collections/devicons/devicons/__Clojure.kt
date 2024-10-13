package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.clojure.Line
import com.woowla.compose.icon.collections.devicons.devicons.clojure.Original
import kotlin.collections.List as ____KtList

public object ClojureGroup

public val Devicons.Clojure: ClojureGroup
  get() = ClojureGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ClojureGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original)
    return __AllIcons!!
  }
