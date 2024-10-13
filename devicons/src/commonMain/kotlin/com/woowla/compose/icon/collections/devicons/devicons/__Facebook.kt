package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.facebook.Original
import com.woowla.compose.icon.collections.devicons.devicons.facebook.Plain
import kotlin.collections.List as ____KtList

public object FacebookGroup

public val Devicons.Facebook: FacebookGroup
  get() = FacebookGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FacebookGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
