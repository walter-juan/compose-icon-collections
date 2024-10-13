package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.rabbitmq.Original
import com.woowla.compose.icon.collections.devicons.devicons.rabbitmq.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.rabbitmq.PlainWordmark
import kotlin.collections.List as ____KtList

public object RabbitmqGroup

public val Devicons.Rabbitmq: RabbitmqGroup
  get() = RabbitmqGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RabbitmqGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
