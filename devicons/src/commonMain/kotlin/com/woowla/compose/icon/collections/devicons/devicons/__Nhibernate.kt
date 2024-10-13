package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.nhibernate.Line
import com.woowla.compose.icon.collections.devicons.devicons.nhibernate.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nhibernate.Original
import com.woowla.compose.icon.collections.devicons.devicons.nhibernate.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.nhibernate.Plain
import com.woowla.compose.icon.collections.devicons.devicons.nhibernate.PlainWordmark
import kotlin.collections.List as ____KtList

public object NhibernateGroup

public val Devicons.Nhibernate: NhibernateGroup
  get() = NhibernateGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NhibernateGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
