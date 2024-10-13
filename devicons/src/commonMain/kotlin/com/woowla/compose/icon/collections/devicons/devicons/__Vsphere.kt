package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vsphere.Line
import com.woowla.compose.icon.collections.devicons.devicons.vsphere.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vsphere.Original
import com.woowla.compose.icon.collections.devicons.devicons.vsphere.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vsphere.Plain
import com.woowla.compose.icon.collections.devicons.devicons.vsphere.PlainWordmark
import kotlin.collections.List as ____KtList

public object VsphereGroup

public val Devicons.Vsphere: VsphereGroup
  get() = VsphereGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VsphereGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
