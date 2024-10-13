package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jira.Original
import com.woowla.compose.icon.collections.devicons.devicons.jira.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.jira.Plain
import com.woowla.compose.icon.collections.devicons.devicons.jira.PlainWordmark
import kotlin.collections.List as ____KtList

public object JiraGroup

public val Devicons.Jira: JiraGroup
  get() = JiraGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JiraGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
