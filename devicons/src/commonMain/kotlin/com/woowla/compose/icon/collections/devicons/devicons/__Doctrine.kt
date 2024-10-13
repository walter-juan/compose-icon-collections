package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.doctrine.Line
import com.woowla.compose.icon.collections.devicons.devicons.doctrine.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.doctrine.Original
import com.woowla.compose.icon.collections.devicons.devicons.doctrine.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.doctrine.Plain
import com.woowla.compose.icon.collections.devicons.devicons.doctrine.PlainWordmark
import kotlin.collections.List as ____KtList

public object DoctrineGroup

public val Devicons.Doctrine: DoctrineGroup
  get() = DoctrineGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DoctrineGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
