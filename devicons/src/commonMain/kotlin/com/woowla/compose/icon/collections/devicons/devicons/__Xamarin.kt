package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.xamarin.Original
import com.woowla.compose.icon.collections.devicons.devicons.xamarin.OriginalWordmark
import kotlin.collections.List as ____KtList

public object XamarinGroup

public val Devicons.Xamarin: XamarinGroup
  get() = XamarinGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val XamarinGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark)
    return __AllIcons!!
  }
