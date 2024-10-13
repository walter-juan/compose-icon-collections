package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.godot.Original
import com.woowla.compose.icon.collections.devicons.devicons.godot.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.godot.Plain
import com.woowla.compose.icon.collections.devicons.devicons.godot.PlainWordmark
import kotlin.collections.List as ____KtList

public object GodotGroup

public val Devicons.Godot: GodotGroup
  get() = GodotGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GodotGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
