package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ktor.Original
import com.woowla.compose.icon.collections.devicons.devicons.ktor.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.ktor.Plain
import com.woowla.compose.icon.collections.devicons.devicons.ktor.PlainWordmark
import kotlin.collections.List as ____KtList

public object KtorGroup

public val Devicons.Ktor: KtorGroup
  get() = KtorGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val KtorGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
