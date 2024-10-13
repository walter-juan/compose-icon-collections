package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.wasm.Original
import com.woowla.compose.icon.collections.devicons.devicons.wasm.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.wasm.PlainWordmark
import kotlin.collections.List as ____KtList

public object WasmGroup

public val Devicons.Wasm: WasmGroup
  get() = WasmGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val WasmGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
