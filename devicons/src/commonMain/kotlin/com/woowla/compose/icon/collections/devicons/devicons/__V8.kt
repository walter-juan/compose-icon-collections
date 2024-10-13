package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.v8.Original
import com.woowla.compose.icon.collections.devicons.devicons.v8.Plain
import kotlin.collections.List as ____KtList

public object V8Group

public val Devicons.V8: V8Group
  get() = V8Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val V8Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
