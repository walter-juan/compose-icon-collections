package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.knexjs.Original
import com.woowla.compose.icon.collections.devicons.devicons.knexjs.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.knexjs.PlainWordmark
import kotlin.collections.List as ____KtList

public object KnexjsGroup

public val Devicons.Knexjs: KnexjsGroup
  get() = KnexjsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val KnexjsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
