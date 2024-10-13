package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.pytorch.Original
import com.woowla.compose.icon.collections.devicons.devicons.pytorch.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.pytorch.PlainWordmark
import kotlin.collections.List as ____KtList

public object PytorchGroup

public val Devicons.Pytorch: PytorchGroup
  get() = PytorchGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PytorchGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
