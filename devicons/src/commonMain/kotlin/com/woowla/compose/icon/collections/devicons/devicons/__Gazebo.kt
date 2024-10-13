package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.gazebo.Original
import com.woowla.compose.icon.collections.devicons.devicons.gazebo.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.gazebo.Plain
import com.woowla.compose.icon.collections.devicons.devicons.gazebo.PlainWordmark
import kotlin.collections.List as ____KtList

public object GazeboGroup

public val Devicons.Gazebo: GazeboGroup
  get() = GazeboGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GazeboGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
