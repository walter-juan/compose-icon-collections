package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nixos.Original
import com.woowla.compose.icon.collections.devicons.devicons.nixos.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nixos.Plain
import com.woowla.compose.icon.collections.devicons.devicons.nixos.PlainWordmark
import kotlin.collections.List as ____KtList

public object NixosGroup

public val Devicons.Nixos: NixosGroup
  get() = NixosGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NixosGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
