package com.woowla.compose.icon.collections.fontawesome

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.fontawesome.fontawesome.AllIcons
import com.woowla.compose.icon.collections.fontawesome.fontawesome.Brands
import com.woowla.compose.icon.collections.fontawesome.fontawesome.Regular
import com.woowla.compose.icon.collections.fontawesome.fontawesome.Solid
import kotlin.collections.List as ____KtList

public object FontAwesome

private var __AllIcons: ____KtList<ImageVector>? = null

public val FontAwesome.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Regular.AllIcons + Solid.AllIcons + Brands.AllIcons + listOf()
    return __AllIcons!!
  }
