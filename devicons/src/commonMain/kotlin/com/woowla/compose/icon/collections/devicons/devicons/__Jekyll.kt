package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jekyll.Original
import com.woowla.compose.icon.collections.devicons.devicons.jekyll.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jekyll.Plain
import com.woowla.compose.icon.collections.devicons.devicons.jekyll.PlainWordmark
import kotlin.collections.List as ____KtList

public object JekyllGroup

public val Devicons.Jekyll: JekyllGroup
  get() = JekyllGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JekyllGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
