package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.firebase.Line
import com.woowla.compose.icon.collections.devicons.devicons.firebase.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.firebase.Original
import com.woowla.compose.icon.collections.devicons.devicons.firebase.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.firebase.Plain
import com.woowla.compose.icon.collections.devicons.devicons.firebase.PlainWordmark
import kotlin.collections.List as ____KtList

public object FirebaseGroup

public val Devicons.Firebase: FirebaseGroup
  get() = FirebaseGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FirebaseGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
