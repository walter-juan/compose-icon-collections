package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.blender.Original
import com.woowla.compose.icon.collections.devicons.devicons.blender.OriginalWordmark
import kotlin.collections.List as ____KtList

public object BlenderGroup

public val Devicons.Blender: BlenderGroup
  get() = BlenderGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BlenderGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
