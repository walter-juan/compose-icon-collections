package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.php.Original
import com.woowla.compose.icon.collections.devicons.devicons.php.Plain
import kotlin.collections.List as ____KtList

public object PhpGroup

public val Devicons.Php: PhpGroup
  get() = PhpGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PhpGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
