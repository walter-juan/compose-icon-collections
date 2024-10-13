package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.amazonwebservices.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.amazonwebservices.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.amazonwebservices.PlainWordmark
import kotlin.collections.List as ____KtList

public object AmazonwebservicesGroup

public val Devicons.Amazonwebservices: AmazonwebservicesGroup
  get() = AmazonwebservicesGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AmazonwebservicesGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(LineWordmark, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
