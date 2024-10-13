package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.networkx.Line
import com.woowla.compose.icon.collections.devicons.devicons.networkx.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.networkx.Original
import com.woowla.compose.icon.collections.devicons.devicons.networkx.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.networkx.Plain
import com.woowla.compose.icon.collections.devicons.devicons.networkx.PlainWordmark
import kotlin.collections.List as ____KtList

public object NetworkxGroup

public val Devicons.Networkx: NetworkxGroup
  get() = NetworkxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NetworkxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
