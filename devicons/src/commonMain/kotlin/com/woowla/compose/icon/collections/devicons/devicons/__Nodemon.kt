package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nodemon.Line
import com.woowla.compose.icon.collections.devicons.devicons.nodemon.Original
import com.woowla.compose.icon.collections.devicons.devicons.nodemon.Plain
import kotlin.collections.List as ____KtList

public object NodemonGroup

public val Devicons.Nodemon: NodemonGroup
  get() = NodemonGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NodemonGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
