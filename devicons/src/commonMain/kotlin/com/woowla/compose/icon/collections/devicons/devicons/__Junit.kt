package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.junit.Line
import com.woowla.compose.icon.collections.devicons.devicons.junit.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.junit.Original
import com.woowla.compose.icon.collections.devicons.devicons.junit.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.junit.Plain
import com.woowla.compose.icon.collections.devicons.devicons.junit.PlainWordmark
import kotlin.collections.List as ____KtList

public object JunitGroup

public val Devicons.Junit: JunitGroup
  get() = JunitGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JunitGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
