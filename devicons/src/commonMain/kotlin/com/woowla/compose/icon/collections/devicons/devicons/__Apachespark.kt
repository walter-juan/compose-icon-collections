package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.apachespark.Original
import com.woowla.compose.icon.collections.devicons.devicons.apachespark.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.apachespark.PlainWordmark
import kotlin.collections.List as ____KtList

public object ApachesparkGroup

public val Devicons.Apachespark: ApachesparkGroup
  get() = ApachesparkGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ApachesparkGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
