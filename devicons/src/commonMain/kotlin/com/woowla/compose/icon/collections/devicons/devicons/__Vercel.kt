package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vercel.Line
import com.woowla.compose.icon.collections.devicons.devicons.vercel.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vercel.Original
import com.woowla.compose.icon.collections.devicons.devicons.vercel.OriginalWordmark
import kotlin.collections.List as ____KtList

public object VercelGroup

public val Devicons.Vercel: VercelGroup
  get() = VercelGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VercelGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
