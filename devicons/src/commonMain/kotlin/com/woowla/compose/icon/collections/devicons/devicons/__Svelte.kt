package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.svelte.Original
import com.woowla.compose.icon.collections.devicons.devicons.svelte.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.svelte.Plain
import com.woowla.compose.icon.collections.devicons.devicons.svelte.PlainWordmark
import kotlin.collections.List as ____KtList

public object SvelteGroup

public val Devicons.Svelte: SvelteGroup
  get() = SvelteGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SvelteGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
