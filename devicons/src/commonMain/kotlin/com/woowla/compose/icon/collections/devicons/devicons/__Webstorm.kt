package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.webstorm.Original
import com.woowla.compose.icon.collections.devicons.devicons.webstorm.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.webstorm.Plain
import com.woowla.compose.icon.collections.devicons.devicons.webstorm.PlainWordmark
import kotlin.collections.List as ____KtList

public object WebstormGroup

public val Devicons.Webstorm: WebstormGroup
  get() = WebstormGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val WebstormGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
