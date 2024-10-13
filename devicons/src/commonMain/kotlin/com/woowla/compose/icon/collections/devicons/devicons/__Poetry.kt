package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.poetry.Original
import com.woowla.compose.icon.collections.devicons.devicons.poetry.Plain
import kotlin.collections.List as ____KtList

public object PoetryGroup

public val Devicons.Poetry: PoetryGroup
  get() = PoetryGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PoetryGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
