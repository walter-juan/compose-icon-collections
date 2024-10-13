package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.githubactions.Original
import com.woowla.compose.icon.collections.devicons.devicons.githubactions.Plain
import kotlin.collections.List as ____KtList

public object GithubactionsGroup

public val Devicons.Githubactions: GithubactionsGroup
  get() = GithubactionsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GithubactionsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
