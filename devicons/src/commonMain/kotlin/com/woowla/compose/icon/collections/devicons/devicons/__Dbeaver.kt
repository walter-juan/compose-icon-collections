package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.dbeaver.Original
import com.woowla.compose.icon.collections.devicons.devicons.dbeaver.Plain
import kotlin.collections.List as ____KtList

public object DbeaverGroup

public val Devicons.Dbeaver: DbeaverGroup
  get() = DbeaverGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DbeaverGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
