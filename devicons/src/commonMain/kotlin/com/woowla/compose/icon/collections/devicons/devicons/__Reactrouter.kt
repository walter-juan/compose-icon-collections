package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.reactrouter.Original
import com.woowla.compose.icon.collections.devicons.devicons.reactrouter.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.reactrouter.Plain
import com.woowla.compose.icon.collections.devicons.devicons.reactrouter.PlainWordmark
import kotlin.collections.List as ____KtList

public object ReactrouterGroup

public val Devicons.Reactrouter: ReactrouterGroup
  get() = ReactrouterGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ReactrouterGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
