package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.erlang.Original
import com.woowla.compose.icon.collections.devicons.devicons.erlang.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.erlang.Plain
import com.woowla.compose.icon.collections.devicons.devicons.erlang.PlainWordmark
import kotlin.collections.List as ____KtList

public object ErlangGroup

public val Devicons.Erlang: ErlangGroup
  get() = ErlangGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ErlangGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
