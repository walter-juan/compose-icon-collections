package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.drupal.Original
import com.woowla.compose.icon.collections.devicons.devicons.drupal.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.drupal.Plain
import com.woowla.compose.icon.collections.devicons.devicons.drupal.PlainWordmark
import kotlin.collections.List as ____KtList

public object DrupalGroup

public val Devicons.Drupal: DrupalGroup
  get() = DrupalGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DrupalGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
