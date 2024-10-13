package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.faunadb.Line
import com.woowla.compose.icon.collections.devicons.devicons.faunadb.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.faunadb.Original
import com.woowla.compose.icon.collections.devicons.devicons.faunadb.OriginalWordmark
import kotlin.collections.List as ____KtList

public object FaunadbGroup

public val Devicons.Faunadb: FaunadbGroup
  get() = FaunadbGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FaunadbGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
