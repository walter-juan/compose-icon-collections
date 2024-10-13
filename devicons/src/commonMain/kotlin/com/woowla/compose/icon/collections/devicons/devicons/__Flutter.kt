package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.flutter.Original
import com.woowla.compose.icon.collections.devicons.devicons.flutter.Plain
import kotlin.collections.List as ____KtList

public object FlutterGroup

public val Devicons.Flutter: FlutterGroup
  get() = FlutterGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FlutterGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
