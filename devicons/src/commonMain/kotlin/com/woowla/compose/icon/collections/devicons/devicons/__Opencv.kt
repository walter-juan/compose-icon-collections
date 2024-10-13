package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.opencv.Original
import com.woowla.compose.icon.collections.devicons.devicons.opencv.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.opencv.Plain
import com.woowla.compose.icon.collections.devicons.devicons.opencv.PlainWordmark
import kotlin.collections.List as ____KtList

public object OpencvGroup

public val Devicons.Opencv: OpencvGroup
  get() = OpencvGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OpencvGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
