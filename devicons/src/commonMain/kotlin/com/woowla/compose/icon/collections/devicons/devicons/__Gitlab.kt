package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gitlab.Original
import com.woowla.compose.icon.collections.devicons.devicons.gitlab.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gitlab.Plain
import com.woowla.compose.icon.collections.devicons.devicons.gitlab.PlainWordmark
import kotlin.collections.List as ____KtList

public object GitlabGroup

public val Devicons.Gitlab: GitlabGroup
  get() = GitlabGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GitlabGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
