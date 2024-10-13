package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gitbook.Line
import com.woowla.compose.icon.collections.devicons.devicons.gitbook.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gitbook.Original
import com.woowla.compose.icon.collections.devicons.devicons.gitbook.OriginalWordmark
import kotlin.collections.List as ____KtList

public object GitbookGroup

public val Devicons.Gitbook: GitbookGroup
  get() = GitbookGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GitbookGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
