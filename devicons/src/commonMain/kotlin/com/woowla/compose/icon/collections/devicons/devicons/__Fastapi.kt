package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.fastapi.Original
import com.woowla.compose.icon.collections.devicons.devicons.fastapi.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.fastapi.Plain
import com.woowla.compose.icon.collections.devicons.devicons.fastapi.PlainWordmark
import kotlin.collections.List as ____KtList

public object FastapiGroup

public val Devicons.Fastapi: FastapiGroup
  get() = FastapiGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FastapiGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
