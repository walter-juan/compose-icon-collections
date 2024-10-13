package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.redhat.Original
import com.woowla.compose.icon.collections.devicons.devicons.redhat.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.redhat.Plain
import com.woowla.compose.icon.collections.devicons.devicons.redhat.PlainWordmark
import kotlin.collections.List as ____KtList

public object RedhatGroup

public val Devicons.Redhat: RedhatGroup
  get() = RedhatGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RedhatGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
