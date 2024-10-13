package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.pycharm.Original
import com.woowla.compose.icon.collections.devicons.devicons.pycharm.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.pycharm.Plain
import com.woowla.compose.icon.collections.devicons.devicons.pycharm.PlainWordmark
import kotlin.collections.List as ____KtList

public object PycharmGroup

public val Devicons.Pycharm: PycharmGroup
  get() = PycharmGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PycharmGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
