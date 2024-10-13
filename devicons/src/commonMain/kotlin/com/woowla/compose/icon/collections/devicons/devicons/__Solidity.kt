package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.solidity.Original
import com.woowla.compose.icon.collections.devicons.devicons.solidity.Plain
import kotlin.collections.List as ____KtList

public object SolidityGroup

public val Devicons.Solidity: SolidityGroup
  get() = SolidityGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SolidityGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
