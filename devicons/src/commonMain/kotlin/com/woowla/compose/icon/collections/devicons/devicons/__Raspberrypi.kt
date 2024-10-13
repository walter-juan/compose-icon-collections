package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.raspberrypi.Line
import com.woowla.compose.icon.collections.devicons.devicons.raspberrypi.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.raspberrypi.Original
import com.woowla.compose.icon.collections.devicons.devicons.raspberrypi.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.raspberrypi.Plain
import com.woowla.compose.icon.collections.devicons.devicons.raspberrypi.PlainWordmark
import kotlin.collections.List as ____KtList

public object RaspberrypiGroup

public val Devicons.Raspberrypi: RaspberrypiGroup
  get() = RaspberrypiGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RaspberrypiGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
