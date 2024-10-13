package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.codeigniter.Plain
import com.woowla.compose.icon.collections.devicons.devicons.codeigniter.PlainWordmark
import kotlin.collections.List as ____KtList

public object CodeigniterGroup

public val Devicons.Codeigniter: CodeigniterGroup
  get() = CodeigniterGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CodeigniterGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Plain, PlainWordmark)
    return __AllIcons!!
  }
