package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.livewire.Original
import com.woowla.compose.icon.collections.devicons.devicons.livewire.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.livewire.Plain
import com.woowla.compose.icon.collections.devicons.devicons.livewire.PlainWordmark
import kotlin.collections.List as ____KtList

public object LivewireGroup

public val Devicons.Livewire: LivewireGroup
  get() = LivewireGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LivewireGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
