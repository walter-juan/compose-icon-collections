package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.consul.Original
import com.woowla.compose.icon.collections.devicons.devicons.consul.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.consul.PlainWordmark
import kotlin.collections.List as ____KtList

public object ConsulGroup

public val Devicons.Consul: ConsulGroup
  get() = ConsulGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ConsulGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
