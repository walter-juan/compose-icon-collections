package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.tomcat.Line
import com.woowla.compose.icon.collections.devicons.devicons.tomcat.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.tomcat.Original
import com.woowla.compose.icon.collections.devicons.devicons.tomcat.OriginalWordmark
import kotlin.collections.List as ____KtList

public object TomcatGroup

public val Devicons.Tomcat: TomcatGroup
  get() = TomcatGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TomcatGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark)
    return __AllIcons!!
  }
