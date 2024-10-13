package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.pulsar.Original
import com.woowla.compose.icon.collections.devicons.devicons.pulsar.OriginalWordmark
import kotlin.collections.List as ____KtList

public object PulsarGroup

public val Devicons.Pulsar: PulsarGroup
  get() = PulsarGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PulsarGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
