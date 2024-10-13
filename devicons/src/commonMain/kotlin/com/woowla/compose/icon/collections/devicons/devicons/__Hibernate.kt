package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.hibernate.Original
import com.woowla.compose.icon.collections.devicons.devicons.hibernate.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.hibernate.Plain
import com.woowla.compose.icon.collections.devicons.devicons.hibernate.PlainWordmark
import kotlin.collections.List as ____KtList

public object HibernateGroup

public val Devicons.Hibernate: HibernateGroup
  get() = HibernateGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HibernateGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
