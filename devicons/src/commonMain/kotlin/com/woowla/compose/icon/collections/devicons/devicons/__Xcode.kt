package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.xcode.Original
import com.woowla.compose.icon.collections.devicons.devicons.xcode.Plain
import kotlin.collections.List as ____KtList

public object XcodeGroup

public val Devicons.Xcode: XcodeGroup
  get() = XcodeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val XcodeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
