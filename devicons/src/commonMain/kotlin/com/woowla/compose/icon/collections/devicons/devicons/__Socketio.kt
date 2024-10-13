package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.socketio.Original
import com.woowla.compose.icon.collections.devicons.devicons.socketio.OriginalWordmark
import kotlin.collections.List as ____KtList

public object SocketioGroup

public val Devicons.Socketio: SocketioGroup
  get() = SocketioGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SocketioGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
