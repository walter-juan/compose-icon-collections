package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.djangorest.Line
import com.woowla.compose.icon.collections.devicons.devicons.djangorest.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.djangorest.Original
import com.woowla.compose.icon.collections.devicons.devicons.djangorest.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.djangorest.Plain
import com.woowla.compose.icon.collections.devicons.devicons.djangorest.PlainWordmark
import kotlin.collections.List as ____KtList

public object DjangorestGroup

public val Devicons.Djangorest: DjangorestGroup
  get() = DjangorestGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DjangorestGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
