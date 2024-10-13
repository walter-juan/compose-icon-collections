package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.redux.Original
import kotlin.collections.List as ____KtList

public object ReduxGroup

public val Devicons.Redux: ReduxGroup
  get() = ReduxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ReduxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original)
    return __AllIcons!!
  }
