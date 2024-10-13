package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.adonisjs.Original
import com.woowla.compose.icon.collections.devicons.devicons.adonisjs.OriginalWordmark
import kotlin.collections.List as ____KtList

public object AdonisjsGroup

public val Devicons.Adonisjs: AdonisjsGroup
  get() = AdonisjsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AdonisjsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
