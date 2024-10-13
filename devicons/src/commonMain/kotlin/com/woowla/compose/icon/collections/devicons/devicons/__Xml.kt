package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.xml.Line
import com.woowla.compose.icon.collections.devicons.devicons.xml.Original
import com.woowla.compose.icon.collections.devicons.devicons.xml.Plain
import kotlin.collections.List as ____KtList

public object XmlGroup

public val Devicons.Xml: XmlGroup
  get() = XmlGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val XmlGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
