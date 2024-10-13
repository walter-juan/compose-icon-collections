package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.qwik.Original
import com.woowla.compose.icon.collections.devicons.devicons.qwik.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.qwik.Plain
import com.woowla.compose.icon.collections.devicons.devicons.qwik.PlainWordmark
import kotlin.collections.List as ____KtList

public object QwikGroup

public val Devicons.Qwik: QwikGroup
  get() = QwikGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val QwikGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
