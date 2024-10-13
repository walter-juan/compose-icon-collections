package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cassandra.Original
import com.woowla.compose.icon.collections.devicons.devicons.cassandra.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.cassandra.Plain
import com.woowla.compose.icon.collections.devicons.devicons.cassandra.PlainWordmark
import kotlin.collections.List as ____KtList

public object CassandraGroup

public val Devicons.Cassandra: CassandraGroup
  get() = CassandraGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CassandraGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
