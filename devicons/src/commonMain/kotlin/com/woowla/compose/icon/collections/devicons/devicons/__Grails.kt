package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.grails.Original
import com.woowla.compose.icon.collections.devicons.devicons.grails.Plain
import kotlin.collections.List as ____KtList

public object GrailsGroup

public val Devicons.Grails: GrailsGroup
  get() = GrailsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GrailsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
