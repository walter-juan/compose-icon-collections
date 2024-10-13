package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.moodle.Original
import com.woowla.compose.icon.collections.devicons.devicons.moodle.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.moodle.Plain
import com.woowla.compose.icon.collections.devicons.devicons.moodle.PlainWordmark
import kotlin.collections.List as ____KtList

public object MoodleGroup

public val Devicons.Moodle: MoodleGroup
  get() = MoodleGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MoodleGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
