package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.puppeteer.Original
import com.woowla.compose.icon.collections.devicons.devicons.puppeteer.Plain
import kotlin.collections.List as ____KtList

public object PuppeteerGroup

public val Devicons.Puppeteer: PuppeteerGroup
  get() = PuppeteerGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PuppeteerGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
