package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.webpack.Original
import com.woowla.compose.icon.collections.devicons.devicons.webpack.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.webpack.Plain
import com.woowla.compose.icon.collections.devicons.devicons.webpack.PlainWordmark
import kotlin.collections.List as ____KtList

public object WebpackGroup

public val Devicons.Webpack: WebpackGroup
  get() = WebpackGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val WebpackGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
