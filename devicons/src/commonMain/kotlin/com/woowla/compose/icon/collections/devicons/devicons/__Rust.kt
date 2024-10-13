package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.rust.Line
import com.woowla.compose.icon.collections.devicons.devicons.rust.Original
import kotlin.collections.List as ____KtList

public object RustGroup

public val Devicons.Rust: RustGroup
  get() = RustGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RustGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original)
    return __AllIcons!!
  }
