package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cosmosdb.Original
import com.woowla.compose.icon.collections.devicons.devicons.cosmosdb.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.cosmosdb.Plain
import com.woowla.compose.icon.collections.devicons.devicons.cosmosdb.PlainWordmark
import kotlin.collections.List as ____KtList

public object CosmosdbGroup

public val Devicons.Cosmosdb: CosmosdbGroup
  get() = CosmosdbGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CosmosdbGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
