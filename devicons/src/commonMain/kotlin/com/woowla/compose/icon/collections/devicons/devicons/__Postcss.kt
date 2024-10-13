package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.postcss.Original
import com.woowla.compose.icon.collections.devicons.devicons.postcss.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.postcss.PlainWordmark
import kotlin.collections.List as ____KtList

public object PostcssGroup

public val Devicons.Postcss: PostcssGroup
  get() = PostcssGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PostcssGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
