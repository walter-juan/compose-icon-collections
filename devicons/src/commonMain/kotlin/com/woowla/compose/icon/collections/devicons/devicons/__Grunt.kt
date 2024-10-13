package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.grunt.Line
import com.woowla.compose.icon.collections.devicons.devicons.grunt.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.grunt.Original
import com.woowla.compose.icon.collections.devicons.devicons.grunt.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.grunt.Plain
import com.woowla.compose.icon.collections.devicons.devicons.grunt.PlainWordmark
import kotlin.collections.List as ____KtList

public object GruntGroup

public val Devicons.Grunt: GruntGroup
  get() = GruntGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GruntGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
