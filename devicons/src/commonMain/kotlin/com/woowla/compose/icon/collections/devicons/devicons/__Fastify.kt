package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.fastify.Original
import com.woowla.compose.icon.collections.devicons.devicons.fastify.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.fastify.Plain
import com.woowla.compose.icon.collections.devicons.devicons.fastify.PlainWordmark
import kotlin.collections.List as ____KtList

public object FastifyGroup

public val Devicons.Fastify: FastifyGroup
  get() = FastifyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FastifyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
