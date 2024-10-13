package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.rancher.Line
import com.woowla.compose.icon.collections.devicons.devicons.rancher.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.rancher.Original
import com.woowla.compose.icon.collections.devicons.devicons.rancher.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.rancher.PlainWordmark
import kotlin.collections.List as ____KtList

public object RancherGroup

public val Devicons.Rancher: RancherGroup
  get() = RancherGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RancherGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
