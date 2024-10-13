package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.powershell.Original
import com.woowla.compose.icon.collections.devicons.devicons.powershell.Plain
import kotlin.collections.List as ____KtList

public object PowershellGroup

public val Devicons.Powershell: PowershellGroup
  get() = PowershellGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PowershellGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
