package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.notion.Line
import com.woowla.compose.icon.collections.devicons.devicons.notion.Original
import com.woowla.compose.icon.collections.devicons.devicons.notion.Plain
import kotlin.collections.List as ____KtList

public object NotionGroup

public val Devicons.Notion: NotionGroup
  get() = NotionGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NotionGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
