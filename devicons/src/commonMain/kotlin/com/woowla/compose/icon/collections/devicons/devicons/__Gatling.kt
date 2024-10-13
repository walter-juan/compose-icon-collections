package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gatling.Line
import com.woowla.compose.icon.collections.devicons.devicons.gatling.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gatling.Original
import com.woowla.compose.icon.collections.devicons.devicons.gatling.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gatling.PlainWordmark
import kotlin.collections.List as ____KtList

public object GatlingGroup

public val Devicons.Gatling: GatlingGroup
  get() = GatlingGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GatlingGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
