package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.mongoose.Original
import com.woowla.compose.icon.collections.devicons.devicons.mongoose.OriginalWordmark
import kotlin.collections.List as ____KtList

public object MongooseGroup

public val Devicons.Mongoose: MongooseGroup
  get() = MongooseGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MongooseGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
