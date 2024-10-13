package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.typo3.Line
import com.woowla.compose.icon.collections.devicons.devicons.typo3.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.typo3.Original
import com.woowla.compose.icon.collections.devicons.devicons.typo3.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.typo3.PlainWordmark
import kotlin.collections.List as ____KtList

public object Typo3Group

public val Devicons.Typo3: Typo3Group
  get() = Typo3Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val Typo3Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
