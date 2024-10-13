package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.openapi.Line
import com.woowla.compose.icon.collections.devicons.devicons.openapi.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.openapi.Original
import com.woowla.compose.icon.collections.devicons.devicons.openapi.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.openapi.Plain
import com.woowla.compose.icon.collections.devicons.devicons.openapi.PlainWordmark
import kotlin.collections.List as ____KtList

public object OpenapiGroup

public val Devicons.Openapi: OpenapiGroup
  get() = OpenapiGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OpenapiGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
