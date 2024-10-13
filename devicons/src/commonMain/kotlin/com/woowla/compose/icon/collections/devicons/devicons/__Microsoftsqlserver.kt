package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.microsoftsqlserver.Line
import com.woowla.compose.icon.collections.devicons.devicons.microsoftsqlserver.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.microsoftsqlserver.Original
import com.woowla.compose.icon.collections.devicons.devicons.microsoftsqlserver.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.microsoftsqlserver.Plain
import com.woowla.compose.icon.collections.devicons.devicons.microsoftsqlserver.PlainWordmark
import kotlin.collections.List as ____KtList

public object MicrosoftsqlserverGroup

public val Devicons.Microsoftsqlserver: MicrosoftsqlserverGroup
  get() = MicrosoftsqlserverGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MicrosoftsqlserverGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
