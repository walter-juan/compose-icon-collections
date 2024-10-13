package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.swift.Original
import com.woowla.compose.icon.collections.devicons.devicons.swift.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.swift.Plain
import com.woowla.compose.icon.collections.devicons.devicons.swift.PlainWordmark
import kotlin.collections.List as ____KtList

public object SwiftGroup

public val Devicons.Swift: SwiftGroup
  get() = SwiftGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SwiftGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
