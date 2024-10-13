package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.googlecloud.Original
import com.woowla.compose.icon.collections.devicons.devicons.googlecloud.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.googlecloud.Plain
import com.woowla.compose.icon.collections.devicons.devicons.googlecloud.PlainWordmark
import kotlin.collections.List as ____KtList

public object GooglecloudGroup

public val Devicons.Googlecloud: GooglecloudGroup
  get() = GooglecloudGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GooglecloudGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
