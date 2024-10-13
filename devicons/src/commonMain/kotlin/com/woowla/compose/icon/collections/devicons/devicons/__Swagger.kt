package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.swagger.Original
import com.woowla.compose.icon.collections.devicons.devicons.swagger.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.swagger.Plain
import com.woowla.compose.icon.collections.devicons.devicons.swagger.PlainWordmark
import kotlin.collections.List as ____KtList

public object SwaggerGroup

public val Devicons.Swagger: SwaggerGroup
  get() = SwaggerGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SwaggerGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
