package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.okta.Original
import com.woowla.compose.icon.collections.devicons.devicons.okta.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.okta.Plain
import com.woowla.compose.icon.collections.devicons.devicons.okta.PlainWordmark
import kotlin.collections.List as ____KtList

public object OktaGroup

public val Devicons.Okta: OktaGroup
  get() = OktaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OktaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
