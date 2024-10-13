package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.couchdb.Original
import com.woowla.compose.icon.collections.devicons.devicons.couchdb.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.couchdb.Plain
import com.woowla.compose.icon.collections.devicons.devicons.couchdb.PlainWordmark
import kotlin.collections.List as ____KtList

public object CouchdbGroup

public val Devicons.Couchdb: CouchdbGroup
  get() = CouchdbGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CouchdbGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
