package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.perl.Original
import com.woowla.compose.icon.collections.devicons.devicons.perl.Plain
import kotlin.collections.List as ____KtList

public object PerlGroup

public val Devicons.Perl: PerlGroup
  get() = PerlGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PerlGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
