package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.quasar.Original
import com.woowla.compose.icon.collections.devicons.devicons.quasar.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.quasar.Plain
import com.woowla.compose.icon.collections.devicons.devicons.quasar.PlainWordmark
import kotlin.collections.List as ____KtList

public object QuasarGroup

public val Devicons.Quasar: QuasarGroup
  get() = QuasarGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val QuasarGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
