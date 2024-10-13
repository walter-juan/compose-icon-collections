package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cakephp.Original
import com.woowla.compose.icon.collections.devicons.devicons.cakephp.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.cakephp.Plain
import com.woowla.compose.icon.collections.devicons.devicons.cakephp.PlainWordmark
import kotlin.collections.List as ____KtList

public object CakephpGroup

public val Devicons.Cakephp: CakephpGroup
  get() = CakephpGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CakephpGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
