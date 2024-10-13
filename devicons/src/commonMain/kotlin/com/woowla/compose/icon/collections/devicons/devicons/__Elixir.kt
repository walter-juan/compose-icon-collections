package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.elixir.Original
import com.woowla.compose.icon.collections.devicons.devicons.elixir.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.elixir.Plain
import com.woowla.compose.icon.collections.devicons.devicons.elixir.PlainWordmark
import kotlin.collections.List as ____KtList

public object ElixirGroup

public val Devicons.Elixir: ElixirGroup
  get() = ElixirGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ElixirGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
