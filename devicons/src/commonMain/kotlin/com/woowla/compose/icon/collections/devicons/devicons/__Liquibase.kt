package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.liquibase.Original
import com.woowla.compose.icon.collections.devicons.devicons.liquibase.OriginalWordmark
import kotlin.collections.List as ____KtList

public object LiquibaseGroup

public val Devicons.Liquibase: LiquibaseGroup
  get() = LiquibaseGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LiquibaseGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
