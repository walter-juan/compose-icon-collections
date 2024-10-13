package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.yii.Original
import com.woowla.compose.icon.collections.devicons.devicons.yii.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.yii.Plain
import com.woowla.compose.icon.collections.devicons.devicons.yii.PlainWordmark
import kotlin.collections.List as ____KtList

public object YiiGroup

public val Devicons.Yii: YiiGroup
  get() = YiiGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val YiiGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
