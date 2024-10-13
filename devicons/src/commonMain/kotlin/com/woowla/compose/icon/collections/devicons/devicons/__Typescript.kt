package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.typescript.Original
import com.woowla.compose.icon.collections.devicons.devicons.typescript.Plain
import kotlin.collections.List as ____KtList

public object TypescriptGroup

public val Devicons.Typescript: TypescriptGroup
  get() = TypescriptGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TypescriptGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
