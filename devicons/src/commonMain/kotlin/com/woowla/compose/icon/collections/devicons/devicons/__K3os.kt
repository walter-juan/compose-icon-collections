package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.k3os.Line
import com.woowla.compose.icon.collections.devicons.devicons.k3os.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.k3os.Original
import com.woowla.compose.icon.collections.devicons.devicons.k3os.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.k3os.PlainWordmark
import kotlin.collections.List as ____KtList

public object K3osGroup

public val Devicons.K3os: K3osGroup
  get() = K3osGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val K3osGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
