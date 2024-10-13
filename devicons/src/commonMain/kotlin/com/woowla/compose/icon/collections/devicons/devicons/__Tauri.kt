package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.tauri.Original
import com.woowla.compose.icon.collections.devicons.devicons.tauri.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.tauri.Plain
import com.woowla.compose.icon.collections.devicons.devicons.tauri.PlainWordmark
import kotlin.collections.List as ____KtList

public object TauriGroup

public val Devicons.Tauri: TauriGroup
  get() = TauriGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TauriGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
