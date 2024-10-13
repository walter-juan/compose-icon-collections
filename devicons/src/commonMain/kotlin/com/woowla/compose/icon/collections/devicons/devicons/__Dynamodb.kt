package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.dynamodb.Original
import com.woowla.compose.icon.collections.devicons.devicons.dynamodb.Plain
import kotlin.collections.List as ____KtList

public object DynamodbGroup

public val Devicons.Dynamodb: DynamodbGroup
  get() = DynamodbGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DynamodbGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
