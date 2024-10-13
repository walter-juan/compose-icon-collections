package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.trello.Line
import com.woowla.compose.icon.collections.devicons.devicons.trello.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.trello.Original
import com.woowla.compose.icon.collections.devicons.devicons.trello.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.trello.Plain
import com.woowla.compose.icon.collections.devicons.devicons.trello.PlainWordmark
import kotlin.collections.List as ____KtList

public object TrelloGroup

public val Devicons.Trello: TrelloGroup
  get() = TrelloGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TrelloGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
