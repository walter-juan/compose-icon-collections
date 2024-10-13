package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.rxjs.Original
import com.woowla.compose.icon.collections.devicons.devicons.rxjs.Plain
import kotlin.collections.List as ____KtList

public object RxjsGroup

public val Devicons.Rxjs: RxjsGroup
  get() = RxjsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RxjsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
