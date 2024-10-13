package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vscode.Original
import com.woowla.compose.icon.collections.devicons.devicons.vscode.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vscode.Plain
import com.woowla.compose.icon.collections.devicons.devicons.vscode.PlainWordmark
import kotlin.collections.List as ____KtList

public object VscodeGroup

public val Devicons.Vscode: VscodeGroup
  get() = VscodeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VscodeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
