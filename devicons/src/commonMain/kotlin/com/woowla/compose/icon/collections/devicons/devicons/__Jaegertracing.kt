package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jaegertracing.Original
import com.woowla.compose.icon.collections.devicons.devicons.jaegertracing.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jaegertracing.Plain
import com.woowla.compose.icon.collections.devicons.devicons.jaegertracing.PlainWordmark
import kotlin.collections.List as ____KtList

public object JaegertracingGroup

public val Devicons.Jaegertracing: JaegertracingGroup
  get() = JaegertracingGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JaegertracingGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
