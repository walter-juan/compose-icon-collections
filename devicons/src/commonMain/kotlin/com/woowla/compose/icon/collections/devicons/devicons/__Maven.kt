package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.maven.Original
import com.woowla.compose.icon.collections.devicons.devicons.maven.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.maven.Plain
import com.woowla.compose.icon.collections.devicons.devicons.maven.PlainWordmark
import kotlin.collections.List as ____KtList

public object MavenGroup

public val Devicons.Maven: MavenGroup
  get() = MavenGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MavenGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
