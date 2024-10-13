package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.protractor.Line
import com.woowla.compose.icon.collections.devicons.devicons.protractor.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.protractor.Original
import com.woowla.compose.icon.collections.devicons.devicons.protractor.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.protractor.Plain
import com.woowla.compose.icon.collections.devicons.devicons.protractor.PlainWordmark
import kotlin.collections.List as ____KtList

public object ProtractorGroup

public val Devicons.Protractor: ProtractorGroup
  get() = ProtractorGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ProtractorGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
