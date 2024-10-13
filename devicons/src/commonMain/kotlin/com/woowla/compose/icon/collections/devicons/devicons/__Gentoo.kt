package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gentoo.Line
import com.woowla.compose.icon.collections.devicons.devicons.gentoo.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gentoo.Original
import com.woowla.compose.icon.collections.devicons.devicons.gentoo.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gentoo.Plain
import com.woowla.compose.icon.collections.devicons.devicons.gentoo.PlainWordmark
import kotlin.collections.List as ____KtList

public object GentooGroup

public val Devicons.Gentoo: GentooGroup
  get() = GentooGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GentooGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
