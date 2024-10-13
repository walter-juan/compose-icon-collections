package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.premierepro.Original
import com.woowla.compose.icon.collections.devicons.devicons.premierepro.Plain
import kotlin.collections.List as ____KtList

public object PremiereproGroup

public val Devicons.Premierepro: PremiereproGroup
  get() = PremiereproGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PremiereproGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
