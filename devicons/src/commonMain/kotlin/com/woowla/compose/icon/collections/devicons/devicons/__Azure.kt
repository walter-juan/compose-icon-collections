package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.azure.Original
import com.woowla.compose.icon.collections.devicons.devicons.azure.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.azure.Plain
import com.woowla.compose.icon.collections.devicons.devicons.azure.PlainWordmark
import kotlin.collections.List as ____KtList

public object AzureGroup

public val Devicons.Azure: AzureGroup
  get() = AzureGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AzureGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
