package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.yugabytedb.Original
import com.woowla.compose.icon.collections.devicons.devicons.yugabytedb.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.yugabytedb.Plain
import com.woowla.compose.icon.collections.devicons.devicons.yugabytedb.PlainWordmark
import kotlin.collections.List as ____KtList

public object YugabytedbGroup

public val Devicons.Yugabytedb: YugabytedbGroup
  get() = YugabytedbGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val YugabytedbGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
