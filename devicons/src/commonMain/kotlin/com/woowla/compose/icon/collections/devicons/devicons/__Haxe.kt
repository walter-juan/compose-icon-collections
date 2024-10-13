package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.haxe.Original
import com.woowla.compose.icon.collections.devicons.devicons.haxe.Plain
import kotlin.collections.List as ____KtList

public object HaxeGroup

public val Devicons.Haxe: HaxeGroup
  get() = HaxeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HaxeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
