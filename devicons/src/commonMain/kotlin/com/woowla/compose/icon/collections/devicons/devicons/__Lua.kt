package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.lua.Line
import com.woowla.compose.icon.collections.devicons.devicons.lua.Original
import com.woowla.compose.icon.collections.devicons.devicons.lua.Plain
import kotlin.collections.List as ____KtList

public object LuaGroup

public val Devicons.Lua: LuaGroup
  get() = LuaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LuaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
