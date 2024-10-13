package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.kotlin.Original
import com.woowla.compose.icon.collections.devicons.devicons.kotlin.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.kotlin.Plain
import com.woowla.compose.icon.collections.devicons.devicons.kotlin.PlainWordmark
import kotlin.collections.List as ____KtList

public object KotlinGroup

public val Devicons.Kotlin: KotlinGroup
  get() = KotlinGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val KotlinGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
