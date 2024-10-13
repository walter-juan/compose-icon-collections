package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.trpc.Original
import com.woowla.compose.icon.collections.devicons.devicons.trpc.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.trpc.Plain
import com.woowla.compose.icon.collections.devicons.devicons.trpc.PlainWordmark
import kotlin.collections.List as ____KtList

public object TrpcGroup

public val Devicons.Trpc: TrpcGroup
  get() = TrpcGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TrpcGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
