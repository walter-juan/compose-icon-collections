package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gitpod.Original
import com.woowla.compose.icon.collections.devicons.devicons.gitpod.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gitpod.Plain
import com.woowla.compose.icon.collections.devicons.devicons.gitpod.PlainWordmark
import kotlin.collections.List as ____KtList

public object GitpodGroup

public val Devicons.Gitpod: GitpodGroup
  get() = GitpodGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GitpodGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
