package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.azuresqldatabase.Original
import com.woowla.compose.icon.collections.devicons.devicons.azuresqldatabase.Plain
import kotlin.collections.List as ____KtList

public object AzuresqldatabaseGroup

public val Devicons.Azuresqldatabase: AzuresqldatabaseGroup
  get() = AzuresqldatabaseGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AzuresqldatabaseGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
