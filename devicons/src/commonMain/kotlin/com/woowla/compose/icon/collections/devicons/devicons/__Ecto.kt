package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ecto.Original
import com.woowla.compose.icon.collections.devicons.devicons.ecto.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.ecto.PlainWordmark
import kotlin.collections.List as ____KtList

public object EctoGroup

public val Devicons.Ecto: EctoGroup
  get() = EctoGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val EctoGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
