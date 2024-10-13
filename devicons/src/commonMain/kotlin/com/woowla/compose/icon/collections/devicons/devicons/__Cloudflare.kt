package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cloudflare.Original
import com.woowla.compose.icon.collections.devicons.devicons.cloudflare.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.cloudflare.Plain
import com.woowla.compose.icon.collections.devicons.devicons.cloudflare.PlainWordmark
import kotlin.collections.List as ____KtList

public object CloudflareGroup

public val Devicons.Cloudflare: CloudflareGroup
  get() = CloudflareGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CloudflareGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
