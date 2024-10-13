package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.slack.Original
import com.woowla.compose.icon.collections.devicons.devicons.slack.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.slack.Plain
import com.woowla.compose.icon.collections.devicons.devicons.slack.PlainWordmark
import kotlin.collections.List as ____KtList

public object SlackGroup

public val Devicons.Slack: SlackGroup
  get() = SlackGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SlackGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
