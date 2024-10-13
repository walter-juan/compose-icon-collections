package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.circleci.Plain
import com.woowla.compose.icon.collections.devicons.devicons.circleci.PlainWordmark
import kotlin.collections.List as ____KtList

public object CircleciGroup

public val Devicons.Circleci: CircleciGroup
  get() = CircleciGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CircleciGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Plain, PlainWordmark)
    return __AllIcons!!
  }
