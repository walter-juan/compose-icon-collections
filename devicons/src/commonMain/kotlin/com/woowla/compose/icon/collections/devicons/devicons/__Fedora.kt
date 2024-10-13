package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.fedora.Original
import com.woowla.compose.icon.collections.devicons.devicons.fedora.Plain
import kotlin.collections.List as ____KtList

public object FedoraGroup

public val Devicons.Fedora: FedoraGroup
  get() = FedoraGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FedoraGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
