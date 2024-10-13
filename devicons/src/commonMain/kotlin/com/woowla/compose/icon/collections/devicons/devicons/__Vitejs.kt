package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vitejs.Original
import com.woowla.compose.icon.collections.devicons.devicons.vitejs.Plain
import kotlin.collections.List as ____KtList

public object VitejsGroup

public val Devicons.Vitejs: VitejsGroup
  get() = VitejsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VitejsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
