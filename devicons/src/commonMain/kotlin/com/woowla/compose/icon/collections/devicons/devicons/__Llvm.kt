package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.llvm.Original
import com.woowla.compose.icon.collections.devicons.devicons.llvm.Plain
import kotlin.collections.List as ____KtList

public object LlvmGroup

public val Devicons.Llvm: LlvmGroup
  get() = LlvmGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LlvmGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
