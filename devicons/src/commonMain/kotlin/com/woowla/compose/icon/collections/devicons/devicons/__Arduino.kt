package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.arduino.Original
import com.woowla.compose.icon.collections.devicons.devicons.arduino.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.arduino.Plain
import com.woowla.compose.icon.collections.devicons.devicons.arduino.PlainWordmark
import kotlin.collections.List as ____KtList

public object ArduinoGroup

public val Devicons.Arduino: ArduinoGroup
  get() = ArduinoGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ArduinoGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
