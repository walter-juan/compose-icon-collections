package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.dropwizard.Original
import com.woowla.compose.icon.collections.devicons.devicons.dropwizard.Plain
import kotlin.collections.List as ____KtList

public object DropwizardGroup

public val Devicons.Dropwizard: DropwizardGroup
  get() = DropwizardGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DropwizardGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
