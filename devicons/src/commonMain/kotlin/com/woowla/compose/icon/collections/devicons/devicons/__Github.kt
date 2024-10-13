package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.github.Original
import com.woowla.compose.icon.collections.devicons.devicons.github.OriginalWordmark
import kotlin.collections.List as ____KtList

public object GithubGroup

public val Devicons.Github: GithubGroup
  get() = GithubGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GithubGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
