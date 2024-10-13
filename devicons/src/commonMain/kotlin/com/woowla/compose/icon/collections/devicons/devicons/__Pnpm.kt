package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.pnpm.Original
import com.woowla.compose.icon.collections.devicons.devicons.pnpm.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.pnpm.Plain
import com.woowla.compose.icon.collections.devicons.devicons.pnpm.PlainWordmark
import kotlin.collections.List as ____KtList

public object PnpmGroup

public val Devicons.Pnpm: PnpmGroup
  get() = PnpmGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PnpmGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
