package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.envoy.Original
import com.woowla.compose.icon.collections.devicons.devicons.envoy.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.envoy.Plain
import com.woowla.compose.icon.collections.devicons.devicons.envoy.PlainWordmark
import kotlin.collections.List as ____KtList

public object EnvoyGroup

public val Devicons.Envoy: EnvoyGroup
  get() = EnvoyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val EnvoyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
