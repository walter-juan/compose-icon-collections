package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.mongodb.Original
import com.woowla.compose.icon.collections.devicons.devicons.mongodb.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.mongodb.Plain
import com.woowla.compose.icon.collections.devicons.devicons.mongodb.PlainWordmark
import kotlin.collections.List as ____KtList

public object MongodbGroup

public val Devicons.Mongodb: MongodbGroup
  get() = MongodbGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MongodbGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
