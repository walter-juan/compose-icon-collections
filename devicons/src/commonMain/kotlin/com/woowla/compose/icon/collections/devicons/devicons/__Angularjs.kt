package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.angularjs.Original
import com.woowla.compose.icon.collections.devicons.devicons.angularjs.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.angularjs.Plain
import com.woowla.compose.icon.collections.devicons.devicons.angularjs.PlainWordmark
import kotlin.collections.List as ____KtList

public object AngularjsGroup

public val Devicons.Angularjs: AngularjsGroup
  get() = AngularjsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AngularjsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
