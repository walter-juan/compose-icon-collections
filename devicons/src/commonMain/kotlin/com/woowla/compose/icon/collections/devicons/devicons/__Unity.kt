package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.unity.Line
import com.woowla.compose.icon.collections.devicons.devicons.unity.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.unity.Original
import com.woowla.compose.icon.collections.devicons.devicons.unity.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.unity.Plain
import com.woowla.compose.icon.collections.devicons.devicons.unity.PlainWordmark
import kotlin.collections.List as ____KtList

public object UnityGroup

public val Devicons.Unity: UnityGroup
  get() = UnityGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val UnityGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
