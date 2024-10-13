package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.openstack.Original
import com.woowla.compose.icon.collections.devicons.devicons.openstack.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.openstack.PlainWordmark
import kotlin.collections.List as ____KtList

public object OpenstackGroup

public val Devicons.Openstack: OpenstackGroup
  get() = OpenstackGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OpenstackGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
