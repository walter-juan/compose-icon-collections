package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.podman.Original
import com.woowla.compose.icon.collections.devicons.devicons.podman.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.podman.Plain
import com.woowla.compose.icon.collections.devicons.devicons.podman.PlainWordmark
import kotlin.collections.List as ____KtList

public object PodmanGroup

public val Devicons.Podman: PodmanGroup
  get() = PodmanGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PodmanGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
