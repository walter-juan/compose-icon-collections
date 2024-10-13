package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.sequelize.Original
import com.woowla.compose.icon.collections.devicons.devicons.sequelize.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.sequelize.Plain
import com.woowla.compose.icon.collections.devicons.devicons.sequelize.PlainWordmark
import kotlin.collections.List as ____KtList

public object SequelizeGroup

public val Devicons.Sequelize: SequelizeGroup
  get() = SequelizeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SequelizeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
