package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ocaml.Original
import com.woowla.compose.icon.collections.devicons.devicons.ocaml.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.ocaml.Plain
import com.woowla.compose.icon.collections.devicons.devicons.ocaml.PlainWordmark
import kotlin.collections.List as ____KtList

public object OcamlGroup

public val Devicons.Ocaml: OcamlGroup
  get() = OcamlGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OcamlGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
