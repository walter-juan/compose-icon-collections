package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.neo4j.Original
import com.woowla.compose.icon.collections.devicons.devicons.neo4j.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.neo4j.Plain
import com.woowla.compose.icon.collections.devicons.devicons.neo4j.PlainWordmark
import kotlin.collections.List as ____KtList

public object Neo4jGroup

public val Devicons.Neo4j: Neo4jGroup
  get() = Neo4jGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val Neo4jGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
