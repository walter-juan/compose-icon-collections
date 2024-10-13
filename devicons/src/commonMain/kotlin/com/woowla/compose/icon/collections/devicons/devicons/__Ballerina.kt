package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ballerina.Line
import com.woowla.compose.icon.collections.devicons.devicons.ballerina.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.ballerina.Original
import com.woowla.compose.icon.collections.devicons.devicons.ballerina.OriginalWordmark
import kotlin.collections.List as ____KtList

public object BallerinaGroup

public val Devicons.Ballerina: BallerinaGroup
  get() = BallerinaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BallerinaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
