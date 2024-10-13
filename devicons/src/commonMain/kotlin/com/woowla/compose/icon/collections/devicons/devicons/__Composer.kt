package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.composer.Line
import com.woowla.compose.icon.collections.devicons.devicons.composer.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.composer.Original
import kotlin.collections.List as ____KtList

public object ComposerGroup

public val Devicons.Composer: ComposerGroup
  get() = ComposerGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ComposerGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original)
    return __AllIcons!!
  }
