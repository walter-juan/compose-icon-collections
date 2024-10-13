package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.githubcodespaces.Original
import com.woowla.compose.icon.collections.devicons.devicons.githubcodespaces.Plain
import kotlin.collections.List as ____KtList

public object GithubcodespacesGroup

public val Devicons.Githubcodespaces: GithubcodespacesGroup
  get() = GithubcodespacesGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GithubcodespacesGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
