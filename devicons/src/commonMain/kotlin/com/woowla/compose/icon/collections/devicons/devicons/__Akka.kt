package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.akka.Original
import com.woowla.compose.icon.collections.devicons.devicons.akka.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.akka.Plain
import com.woowla.compose.icon.collections.devicons.devicons.akka.PlainWordmark
import kotlin.collections.List as ____KtList

public object AkkaGroup

public val Devicons.Akka: AkkaGroup
  get() = AkkaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AkkaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
