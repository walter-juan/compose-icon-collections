package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.postman.Original
import com.woowla.compose.icon.collections.devicons.devicons.postman.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.postman.Plain
import com.woowla.compose.icon.collections.devicons.devicons.postman.PlainWordmark
import kotlin.collections.List as ____KtList

public object PostmanGroup

public val Devicons.Postman: PostmanGroup
  get() = PostmanGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PostmanGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
