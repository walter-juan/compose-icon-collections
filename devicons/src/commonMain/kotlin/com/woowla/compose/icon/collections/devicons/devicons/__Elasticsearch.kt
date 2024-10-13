package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.elasticsearch.Original
import com.woowla.compose.icon.collections.devicons.devicons.elasticsearch.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.elasticsearch.Plain
import com.woowla.compose.icon.collections.devicons.devicons.elasticsearch.PlainWordmark
import kotlin.collections.List as ____KtList

public object ElasticsearchGroup

public val Devicons.Elasticsearch: ElasticsearchGroup
  get() = ElasticsearchGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ElasticsearchGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
