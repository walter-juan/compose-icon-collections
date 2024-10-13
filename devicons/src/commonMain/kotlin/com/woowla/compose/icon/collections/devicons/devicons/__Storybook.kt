package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.storybook.Original
import com.woowla.compose.icon.collections.devicons.devicons.storybook.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.storybook.Plain
import com.woowla.compose.icon.collections.devicons.devicons.storybook.PlainWordmark
import kotlin.collections.List as ____KtList

public object StorybookGroup

public val Devicons.Storybook: StorybookGroup
  get() = StorybookGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val StorybookGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
