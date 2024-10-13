package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.aarch64.Line
import com.woowla.compose.icon.collections.devicons.devicons.aarch64.Original
import com.woowla.compose.icon.collections.devicons.devicons.aarch64.Plain
import kotlin.collections.List as ____KtList

public object Aarch64Group

public val Devicons.Aarch64: Aarch64Group
  get() = Aarch64Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val Aarch64Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
