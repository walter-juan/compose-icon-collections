package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.appwrite.Original
import com.woowla.compose.icon.collections.devicons.devicons.appwrite.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.appwrite.Plain
import com.woowla.compose.icon.collections.devicons.devicons.appwrite.PlainWordmark
import kotlin.collections.List as ____KtList

public object AppwriteGroup

public val Devicons.Appwrite: AppwriteGroup
  get() = AppwriteGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AppwriteGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
