package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.tailwindcss.Original
import com.woowla.compose.icon.collections.devicons.devicons.tailwindcss.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.tailwindcss.PlainWordmark
import kotlin.collections.List as ____KtList

public object TailwindcssGroup

public val Devicons.Tailwindcss: TailwindcssGroup
  get() = TailwindcssGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TailwindcssGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
