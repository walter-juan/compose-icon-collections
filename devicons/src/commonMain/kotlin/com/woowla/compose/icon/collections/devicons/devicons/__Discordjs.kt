package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.discordjs.Original
import com.woowla.compose.icon.collections.devicons.devicons.discordjs.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.discordjs.Plain
import com.woowla.compose.icon.collections.devicons.devicons.discordjs.PlainWordmark
import kotlin.collections.List as ____KtList

public object DiscordjsGroup

public val Devicons.Discordjs: DiscordjsGroup
  get() = DiscordjsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DiscordjsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
