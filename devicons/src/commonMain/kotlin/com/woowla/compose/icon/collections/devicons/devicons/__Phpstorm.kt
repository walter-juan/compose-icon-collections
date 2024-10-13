package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.phpstorm.Original
import com.woowla.compose.icon.collections.devicons.devicons.phpstorm.Plain
import com.woowla.compose.icon.collections.devicons.devicons.phpstorm.PlainWordmark
import kotlin.collections.List as ____KtList

public object PhpstormGroup

public val Devicons.Phpstorm: PhpstormGroup
  get() = PhpstormGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PhpstormGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain, PlainWordmark)
    return __AllIcons!!
  }
