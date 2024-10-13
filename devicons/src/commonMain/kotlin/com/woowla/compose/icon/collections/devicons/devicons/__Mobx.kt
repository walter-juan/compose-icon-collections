package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.mobx.Original
import com.woowla.compose.icon.collections.devicons.devicons.mobx.Plain
import kotlin.collections.List as ____KtList

public object MobxGroup

public val Devicons.Mobx: MobxGroup
  get() = MobxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MobxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
