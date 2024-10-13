package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ember.Original
import com.woowla.compose.icon.collections.devicons.devicons.ember.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.ember.Plain
import kotlin.collections.List as ____KtList

public object EmberGroup

public val Devicons.Ember: EmberGroup
  get() = EmberGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val EmberGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain)
    return __AllIcons!!
  }
