package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.kibana.Original
import com.woowla.compose.icon.collections.devicons.devicons.kibana.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.kibana.Plain
import com.woowla.compose.icon.collections.devicons.devicons.kibana.PlainWordmark
import kotlin.collections.List as ____KtList

public object KibanaGroup

public val Devicons.Kibana: KibanaGroup
  get() = KibanaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val KibanaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
