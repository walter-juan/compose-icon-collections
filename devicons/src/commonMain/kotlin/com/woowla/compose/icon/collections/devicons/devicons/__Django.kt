package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.django.Plain
import com.woowla.compose.icon.collections.devicons.devicons.django.PlainWordmark
import kotlin.collections.List as ____KtList

public object DjangoGroup

public val Devicons.Django: DjangoGroup
  get() = DjangoGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DjangoGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Plain, PlainWordmark)
    return __AllIcons!!
  }
