package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.linkedin.Original
import com.woowla.compose.icon.collections.devicons.devicons.linkedin.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.linkedin.Plain
import com.woowla.compose.icon.collections.devicons.devicons.linkedin.PlainWordmark
import kotlin.collections.List as ____KtList

public object LinkedinGroup

public val Devicons.Linkedin: LinkedinGroup
  get() = LinkedinGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LinkedinGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
