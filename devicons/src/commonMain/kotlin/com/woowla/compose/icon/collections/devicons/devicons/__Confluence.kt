package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.confluence.Line
import com.woowla.compose.icon.collections.devicons.devicons.confluence.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.confluence.Original
import com.woowla.compose.icon.collections.devicons.devicons.confluence.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.confluence.Plain
import com.woowla.compose.icon.collections.devicons.devicons.confluence.PlainWordmark
import kotlin.collections.List as ____KtList

public object ConfluenceGroup

public val Devicons.Confluence: ConfluenceGroup
  get() = ConfluenceGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ConfluenceGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
