package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.python.Original
import com.woowla.compose.icon.collections.devicons.devicons.python.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.python.Plain
import com.woowla.compose.icon.collections.devicons.devicons.python.PlainWordmark
import kotlin.collections.List as ____KtList

public object PythonGroup

public val Devicons.Python: PythonGroup
  get() = PythonGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PythonGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
