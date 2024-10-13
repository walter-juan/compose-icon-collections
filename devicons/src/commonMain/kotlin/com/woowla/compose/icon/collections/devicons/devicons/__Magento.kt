package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.magento.Line
import com.woowla.compose.icon.collections.devicons.devicons.magento.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.magento.Original
import com.woowla.compose.icon.collections.devicons.devicons.magento.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.magento.PlainWordmark
import kotlin.collections.List as ____KtList

public object MagentoGroup

public val Devicons.Magento: MagentoGroup
  get() = MagentoGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MagentoGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
