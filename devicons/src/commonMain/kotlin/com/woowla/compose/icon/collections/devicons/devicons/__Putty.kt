package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.putty.Original
import com.woowla.compose.icon.collections.devicons.devicons.putty.Plain
import kotlin.collections.List as ____KtList

public object PuttyGroup

public val Devicons.Putty: PuttyGroup
  get() = PuttyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PuttyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
