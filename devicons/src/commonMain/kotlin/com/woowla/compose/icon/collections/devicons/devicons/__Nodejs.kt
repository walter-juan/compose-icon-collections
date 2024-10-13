package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nodejs.Line
import com.woowla.compose.icon.collections.devicons.devicons.nodejs.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nodejs.Original
import com.woowla.compose.icon.collections.devicons.devicons.nodejs.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nodejs.Plain
import com.woowla.compose.icon.collections.devicons.devicons.nodejs.PlainWordmark
import kotlin.collections.List as ____KtList

public object NodejsGroup

public val Devicons.Nodejs: NodejsGroup
  get() = NodejsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NodejsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
