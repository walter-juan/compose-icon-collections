package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.twitter.Original
import kotlin.collections.List as ____KtList

public object TwitterGroup

public val Devicons.Twitter: TwitterGroup
  get() = TwitterGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TwitterGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
