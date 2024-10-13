package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.couchbase.Original
import com.woowla.compose.icon.collections.devicons.devicons.couchbase.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.couchbase.PlainWordmark
import kotlin.collections.List as ____KtList

public object CouchbaseGroup

public val Devicons.Couchbase: CouchbaseGroup
  get() = CouchbaseGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CouchbaseGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
