package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nextjs.Line
import com.woowla.compose.icon.collections.devicons.devicons.nextjs.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nextjs.Original
import com.woowla.compose.icon.collections.devicons.devicons.nextjs.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nextjs.Plain
import kotlin.collections.List as ____KtList

public object NextjsGroup

public val Devicons.Nextjs: NextjsGroup
  get() = NextjsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NextjsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain)
    return __AllIcons!!
  }
