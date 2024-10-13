package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.replit.Original
import com.woowla.compose.icon.collections.devicons.devicons.replit.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.replit.PlainWordmark
import kotlin.collections.List as ____KtList

public object ReplitGroup

public val Devicons.Replit: ReplitGroup
  get() = ReplitGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ReplitGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
