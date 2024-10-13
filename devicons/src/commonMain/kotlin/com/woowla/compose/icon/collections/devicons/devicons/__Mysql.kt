package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.mysql.Original
import com.woowla.compose.icon.collections.devicons.devicons.mysql.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.mysql.PlainWordmark
import kotlin.collections.List as ____KtList

public object MysqlGroup

public val Devicons.Mysql: MysqlGroup
  get() = MysqlGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MysqlGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
