package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jupyter.Original
import com.woowla.compose.icon.collections.devicons.devicons.jupyter.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jupyter.Plain
import com.woowla.compose.icon.collections.devicons.devicons.jupyter.PlainWordmark
import kotlin.collections.List as ____KtList

public object JupyterGroup

public val Devicons.Jupyter: JupyterGroup
  get() = JupyterGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JupyterGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
