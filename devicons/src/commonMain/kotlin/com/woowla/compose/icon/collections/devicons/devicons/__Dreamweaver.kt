package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.dreamweaver.Line
import com.woowla.compose.icon.collections.devicons.devicons.dreamweaver.Original
import com.woowla.compose.icon.collections.devicons.devicons.dreamweaver.Plain
import kotlin.collections.List as ____KtList

public object DreamweaverGroup

public val Devicons.Dreamweaver: DreamweaverGroup
  get() = DreamweaverGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DreamweaverGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
