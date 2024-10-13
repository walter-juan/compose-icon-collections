package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.traefikproxy.Line
import com.woowla.compose.icon.collections.devicons.devicons.traefikproxy.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.traefikproxy.Original
import com.woowla.compose.icon.collections.devicons.devicons.traefikproxy.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.traefikproxy.PlainWordmark
import kotlin.collections.List as ____KtList

public object TraefikproxyGroup

public val Devicons.Traefikproxy: TraefikproxyGroup
  get() = TraefikproxyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TraefikproxyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
