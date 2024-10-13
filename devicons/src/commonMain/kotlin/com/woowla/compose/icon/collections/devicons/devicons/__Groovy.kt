package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.groovy.Original
import com.woowla.compose.icon.collections.devicons.devicons.groovy.Plain
import kotlin.collections.List as ____KtList

public object GroovyGroup

public val Devicons.Groovy: GroovyGroup
  get() = GroovyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GroovyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
