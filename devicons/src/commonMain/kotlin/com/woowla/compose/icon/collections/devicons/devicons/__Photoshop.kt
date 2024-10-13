package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.photoshop.Line
import com.woowla.compose.icon.collections.devicons.devicons.photoshop.Original
import com.woowla.compose.icon.collections.devicons.devicons.photoshop.Plain
import kotlin.collections.List as ____KtList

public object PhotoshopGroup

public val Devicons.Photoshop: PhotoshopGroup
  get() = PhotoshopGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PhotoshopGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
