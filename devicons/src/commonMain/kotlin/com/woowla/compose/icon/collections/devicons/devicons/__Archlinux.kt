package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.archlinux.Original
import com.woowla.compose.icon.collections.devicons.devicons.archlinux.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.archlinux.Plain
import com.woowla.compose.icon.collections.devicons.devicons.archlinux.PlainWordmark
import kotlin.collections.List as ____KtList

public object ArchlinuxGroup

public val Devicons.Archlinux: ArchlinuxGroup
  get() = ArchlinuxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ArchlinuxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
