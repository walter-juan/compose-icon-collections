package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.wordpress.Original
import com.woowla.compose.icon.collections.devicons.devicons.wordpress.Plain
import com.woowla.compose.icon.collections.devicons.devicons.wordpress.PlainWordmark
import kotlin.collections.List as ____KtList

public object WordpressGroup

public val Devicons.Wordpress: WordpressGroup
  get() = WordpressGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val WordpressGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain, PlainWordmark)
    return __AllIcons!!
  }
