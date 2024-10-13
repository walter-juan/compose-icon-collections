package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ruby.Original
import com.woowla.compose.icon.collections.devicons.devicons.ruby.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.ruby.Plain
import com.woowla.compose.icon.collections.devicons.devicons.ruby.PlainWordmark
import kotlin.collections.List as ____KtList

public object RubyGroup

public val Devicons.Ruby: RubyGroup
  get() = RubyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RubyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
