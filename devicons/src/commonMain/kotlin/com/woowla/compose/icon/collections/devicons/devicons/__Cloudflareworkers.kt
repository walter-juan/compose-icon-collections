package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cloudflareworkers.Original
import com.woowla.compose.icon.collections.devicons.devicons.cloudflareworkers.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.cloudflareworkers.Plain
import com.woowla.compose.icon.collections.devicons.devicons.cloudflareworkers.PlainWordmark
import kotlin.collections.List as ____KtList

public object CloudflareworkersGroup

public val Devicons.Cloudflareworkers: CloudflareworkersGroup
  get() = CloudflareworkersGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CloudflareworkersGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
