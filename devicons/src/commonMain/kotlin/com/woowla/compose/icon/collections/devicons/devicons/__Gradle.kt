package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gradle.Original
import com.woowla.compose.icon.collections.devicons.devicons.gradle.OriginalWordmark
import kotlin.collections.List as ____KtList

public object GradleGroup

public val Devicons.Gradle: GradleGroup
  get() = GradleGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GradleGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
