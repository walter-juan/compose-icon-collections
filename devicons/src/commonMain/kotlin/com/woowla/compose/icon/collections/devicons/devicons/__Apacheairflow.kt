package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.apacheairflow.Original
import com.woowla.compose.icon.collections.devicons.devicons.apacheairflow.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.apacheairflow.Plain
import com.woowla.compose.icon.collections.devicons.devicons.apacheairflow.PlainWordmark
import kotlin.collections.List as ____KtList

public object ApacheairflowGroup

public val Devicons.Apacheairflow: ApacheairflowGroup
  get() = ApacheairflowGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ApacheairflowGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
