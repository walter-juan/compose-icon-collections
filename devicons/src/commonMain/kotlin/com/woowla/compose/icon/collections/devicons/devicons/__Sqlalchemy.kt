package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.sqlalchemy.Original
import com.woowla.compose.icon.collections.devicons.devicons.sqlalchemy.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.sqlalchemy.Plain
import com.woowla.compose.icon.collections.devicons.devicons.sqlalchemy.PlainWordmark
import kotlin.collections.List as ____KtList

public object SqlalchemyGroup

public val Devicons.Sqlalchemy: SqlalchemyGroup
  get() = SqlalchemyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SqlalchemyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
