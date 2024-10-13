package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.sentry.Original
import com.woowla.compose.icon.collections.devicons.devicons.sentry.OriginalWordmark
import kotlin.collections.List as ____KtList

public object SentryGroup

public val Devicons.Sentry: SentryGroup
  get() = SentryGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SentryGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
