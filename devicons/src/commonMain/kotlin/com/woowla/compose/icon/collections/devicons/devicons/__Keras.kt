package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.keras.Line
import com.woowla.compose.icon.collections.devicons.devicons.keras.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.keras.Original
import com.woowla.compose.icon.collections.devicons.devicons.keras.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.keras.Plain
import com.woowla.compose.icon.collections.devicons.devicons.keras.PlainWordmark
import kotlin.collections.List as ____KtList

public object KerasGroup

public val Devicons.Keras: KerasGroup
  get() = KerasGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val KerasGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
