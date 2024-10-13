package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.karma.Original
import com.woowla.compose.icon.collections.devicons.devicons.karma.Plain
import kotlin.collections.List as ____KtList

public object KarmaGroup

public val Devicons.Karma: KarmaGroup
  get() = KarmaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val KarmaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
