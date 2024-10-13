package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nestjs.Line
import com.woowla.compose.icon.collections.devicons.devicons.nestjs.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nestjs.Original
import com.woowla.compose.icon.collections.devicons.devicons.nestjs.OriginalWordmark
import kotlin.collections.List as ____KtList

public object NestjsGroup

public val Devicons.Nestjs: NestjsGroup
  get() = NestjsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NestjsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
