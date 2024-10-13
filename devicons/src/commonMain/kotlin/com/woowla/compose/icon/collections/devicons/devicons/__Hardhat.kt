package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.hardhat.Original
import com.woowla.compose.icon.collections.devicons.devicons.hardhat.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.hardhat.Plain
import com.woowla.compose.icon.collections.devicons.devicons.hardhat.PlainWordmark
import kotlin.collections.List as ____KtList

public object HardhatGroup

public val Devicons.Hardhat: HardhatGroup
  get() = HardhatGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HardhatGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
