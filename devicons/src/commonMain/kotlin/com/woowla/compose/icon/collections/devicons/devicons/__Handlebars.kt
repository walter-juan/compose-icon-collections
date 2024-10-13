package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.handlebars.Line
import com.woowla.compose.icon.collections.devicons.devicons.handlebars.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.handlebars.Original
import com.woowla.compose.icon.collections.devicons.devicons.handlebars.OriginalWordmark
import kotlin.collections.List as ____KtList

public object HandlebarsGroup

public val Devicons.Handlebars: HandlebarsGroup
  get() = HandlebarsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HandlebarsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
