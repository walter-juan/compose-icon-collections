package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.bitbucket.Original
import com.woowla.compose.icon.collections.devicons.devicons.bitbucket.OriginalWordmark
import kotlin.collections.List as ____KtList

public object BitbucketGroup

public val Devicons.Bitbucket: BitbucketGroup
  get() = BitbucketGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BitbucketGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
