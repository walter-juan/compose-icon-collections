package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.hadoop.Original
import com.woowla.compose.icon.collections.devicons.devicons.hadoop.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.hadoop.Plain
import com.woowla.compose.icon.collections.devicons.devicons.hadoop.PlainWordmark
import kotlin.collections.List as ____KtList

public object HadoopGroup

public val Devicons.Hadoop: HadoopGroup
  get() = HadoopGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HadoopGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
