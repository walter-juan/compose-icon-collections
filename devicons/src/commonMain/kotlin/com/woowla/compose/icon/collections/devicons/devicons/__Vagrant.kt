package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vagrant.Original
import com.woowla.compose.icon.collections.devicons.devicons.vagrant.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vagrant.Plain
import com.woowla.compose.icon.collections.devicons.devicons.vagrant.PlainWordmark
import kotlin.collections.List as ____KtList

public object VagrantGroup

public val Devicons.Vagrant: VagrantGroup
  get() = VagrantGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VagrantGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
