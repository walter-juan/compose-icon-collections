package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vuejs.Line
import com.woowla.compose.icon.collections.devicons.devicons.vuejs.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vuejs.Original
import com.woowla.compose.icon.collections.devicons.devicons.vuejs.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vuejs.Plain
import com.woowla.compose.icon.collections.devicons.devicons.vuejs.PlainWordmark
import kotlin.collections.List as ____KtList

public object VuejsGroup

public val Devicons.Vuejs: VuejsGroup
  get() = VuejsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VuejsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
