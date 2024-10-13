package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.pulumi.Original
import com.woowla.compose.icon.collections.devicons.devicons.pulumi.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.pulumi.Plain
import com.woowla.compose.icon.collections.devicons.devicons.pulumi.PlainWordmark
import kotlin.collections.List as ____KtList

public object PulumiGroup

public val Devicons.Pulumi: PulumiGroup
  get() = PulumiGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PulumiGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
