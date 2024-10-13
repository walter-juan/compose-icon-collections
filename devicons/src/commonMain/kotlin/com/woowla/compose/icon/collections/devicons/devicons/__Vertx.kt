package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vertx.Line
import com.woowla.compose.icon.collections.devicons.devicons.vertx.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vertx.Original
import com.woowla.compose.icon.collections.devicons.devicons.vertx.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vertx.Plain
import com.woowla.compose.icon.collections.devicons.devicons.vertx.PlainWordmark
import kotlin.collections.List as ____KtList

public object VertxGroup

public val Devicons.Vertx: VertxGroup
  get() = VertxGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VertxGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
