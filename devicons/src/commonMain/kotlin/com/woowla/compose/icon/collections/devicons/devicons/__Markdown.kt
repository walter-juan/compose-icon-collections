package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.markdown.Original
import kotlin.collections.List as ____KtList

public object MarkdownGroup

public val Devicons.Markdown: MarkdownGroup
  get() = MarkdownGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MarkdownGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
