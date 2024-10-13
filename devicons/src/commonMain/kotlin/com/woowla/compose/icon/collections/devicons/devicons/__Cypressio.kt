package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cypressio.Line
import com.woowla.compose.icon.collections.devicons.devicons.cypressio.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.cypressio.Original
import com.woowla.compose.icon.collections.devicons.devicons.cypressio.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.cypressio.Plain
import com.woowla.compose.icon.collections.devicons.devicons.cypressio.PlainWordmark
import kotlin.collections.List as ____KtList

public object CypressioGroup

public val Devicons.Cypressio: CypressioGroup
  get() = CypressioGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CypressioGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
