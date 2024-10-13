package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jetpackcompose.Line
import com.woowla.compose.icon.collections.devicons.devicons.jetpackcompose.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jetpackcompose.Original
import com.woowla.compose.icon.collections.devicons.devicons.jetpackcompose.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jetpackcompose.Plain
import com.woowla.compose.icon.collections.devicons.devicons.jetpackcompose.PlainWordmark
import kotlin.collections.List as ____KtList

public object JetpackcomposeGroup

public val Devicons.Jetpackcompose: JetpackcomposeGroup
  get() = JetpackcomposeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JetpackcomposeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
