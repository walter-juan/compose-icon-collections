package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.qodana.Original
import com.woowla.compose.icon.collections.devicons.devicons.qodana.Plain
import com.woowla.compose.icon.collections.devicons.devicons.qodana.PlainWordmark
import kotlin.collections.List as ____KtList

public object QodanaGroup

public val Devicons.Qodana: QodanaGroup
  get() = QodanaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val QodanaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain, PlainWordmark)
    return __AllIcons!!
  }
