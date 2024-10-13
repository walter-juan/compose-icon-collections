package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.eleventy.Original
import com.woowla.compose.icon.collections.devicons.devicons.eleventy.Plain
import kotlin.collections.List as ____KtList

public object EleventyGroup

public val Devicons.Eleventy: EleventyGroup
  get() = EleventyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val EleventyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
