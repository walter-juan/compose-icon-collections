package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.centos.Original
import com.woowla.compose.icon.collections.devicons.devicons.centos.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.centos.Plain
import com.woowla.compose.icon.collections.devicons.devicons.centos.PlainWordmark
import kotlin.collections.List as ____KtList

public object CentosGroup

public val Devicons.Centos: CentosGroup
  get() = CentosGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CentosGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
