package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.cucumber.Plain
import com.woowla.compose.icon.collections.devicons.devicons.cucumber.PlainWordmark
import kotlin.collections.List as ____KtList

public object CucumberGroup

public val Devicons.Cucumber: CucumberGroup
  get() = CucumberGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CucumberGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Plain, PlainWordmark)
    return __AllIcons!!
  }
