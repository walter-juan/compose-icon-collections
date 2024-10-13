package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.neovim.Line
import com.woowla.compose.icon.collections.devicons.devicons.neovim.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.neovim.Original
import com.woowla.compose.icon.collections.devicons.devicons.neovim.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.neovim.Plain
import com.woowla.compose.icon.collections.devicons.devicons.neovim.PlainWordmark
import kotlin.collections.List as ____KtList

public object NeovimGroup

public val Devicons.Neovim: NeovimGroup
  get() = NeovimGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NeovimGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
