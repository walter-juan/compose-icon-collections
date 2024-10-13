package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.realm.Original
import com.woowla.compose.icon.collections.devicons.devicons.realm.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.realm.Plain
import com.woowla.compose.icon.collections.devicons.devicons.realm.PlainWordmark
import kotlin.collections.List as ____KtList

public object RealmGroup

public val Devicons.Realm: RealmGroup
  get() = RealmGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RealmGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
