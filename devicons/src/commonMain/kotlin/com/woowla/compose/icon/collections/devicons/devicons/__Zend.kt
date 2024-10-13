package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.zend.Line
import com.woowla.compose.icon.collections.devicons.devicons.zend.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.zend.Original
import com.woowla.compose.icon.collections.devicons.devicons.zend.OriginalWordmark
import kotlin.collections.List as ____KtList

public object ZendGroup

public val Devicons.Zend: ZendGroup
  get() = ZendGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ZendGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
