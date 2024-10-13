package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.scala.Original
import com.woowla.compose.icon.collections.devicons.devicons.scala.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.scala.Plain
import com.woowla.compose.icon.collections.devicons.devicons.scala.PlainWordmark
import kotlin.collections.List as ____KtList

public object ScalaGroup

public val Devicons.Scala: ScalaGroup
  get() = ScalaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ScalaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
