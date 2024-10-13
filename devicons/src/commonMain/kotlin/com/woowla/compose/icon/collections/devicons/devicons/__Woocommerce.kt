package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.woocommerce.Original
import com.woowla.compose.icon.collections.devicons.devicons.woocommerce.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.woocommerce.Plain
import com.woowla.compose.icon.collections.devicons.devicons.woocommerce.PlainWordmark
import kotlin.collections.List as ____KtList

public object WoocommerceGroup

public val Devicons.Woocommerce: WoocommerceGroup
  get() = WoocommerceGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val WoocommerceGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
