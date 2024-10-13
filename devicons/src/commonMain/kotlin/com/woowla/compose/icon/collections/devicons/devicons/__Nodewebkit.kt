package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nodewebkit.Line
import com.woowla.compose.icon.collections.devicons.devicons.nodewebkit.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nodewebkit.Original
import com.woowla.compose.icon.collections.devicons.devicons.nodewebkit.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nodewebkit.Plain
import com.woowla.compose.icon.collections.devicons.devicons.nodewebkit.PlainWordmark
import kotlin.collections.List as ____KtList

public object NodewebkitGroup

public val Devicons.Nodewebkit: NodewebkitGroup
  get() = NodewebkitGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NodewebkitGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
