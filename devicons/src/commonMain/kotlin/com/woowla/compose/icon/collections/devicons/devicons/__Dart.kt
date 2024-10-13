package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.dart.Original
import com.woowla.compose.icon.collections.devicons.devicons.dart.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.dart.Plain
import com.woowla.compose.icon.collections.devicons.devicons.dart.PlainWordmark
import kotlin.collections.List as ____KtList

public object DartGroup

public val Devicons.Dart: DartGroup
  get() = DartGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DartGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
