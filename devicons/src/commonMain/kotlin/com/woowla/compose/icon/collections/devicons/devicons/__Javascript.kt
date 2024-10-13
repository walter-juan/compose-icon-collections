package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.javascript.Original
import com.woowla.compose.icon.collections.devicons.devicons.javascript.Plain
import kotlin.collections.List as ____KtList

public object JavascriptGroup

public val Devicons.Javascript: JavascriptGroup
  get() = JavascriptGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JavascriptGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
