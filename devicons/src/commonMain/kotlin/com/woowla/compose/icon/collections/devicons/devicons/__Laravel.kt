package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.laravel.Line
import com.woowla.compose.icon.collections.devicons.devicons.laravel.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.laravel.Original
import com.woowla.compose.icon.collections.devicons.devicons.laravel.OriginalWordmark
import kotlin.collections.List as ____KtList

public object LaravelGroup

public val Devicons.Laravel: LaravelGroup
  get() = LaravelGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LaravelGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
