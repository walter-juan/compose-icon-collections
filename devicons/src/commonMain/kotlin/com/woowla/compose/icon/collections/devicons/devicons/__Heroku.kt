package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.heroku.Original
import com.woowla.compose.icon.collections.devicons.devicons.heroku.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.heroku.Plain
import com.woowla.compose.icon.collections.devicons.devicons.heroku.PlainWordmark
import kotlin.collections.List as ____KtList

public object HerokuGroup

public val Devicons.Heroku: HerokuGroup
  get() = HerokuGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HerokuGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
