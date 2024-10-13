package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.git.Original
import com.woowla.compose.icon.collections.devicons.devicons.git.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.git.Plain
import com.woowla.compose.icon.collections.devicons.devicons.git.PlainWordmark
import kotlin.collections.List as ____KtList

public object GitGroup

public val Devicons.Git: GitGroup
  get() = GitGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GitGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
