package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.flask.Original
import com.woowla.compose.icon.collections.devicons.devicons.flask.OriginalWordmark
import kotlin.collections.List as ____KtList

public object FlaskGroup

public val Devicons.Flask: FlaskGroup
  get() = FlaskGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FlaskGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
