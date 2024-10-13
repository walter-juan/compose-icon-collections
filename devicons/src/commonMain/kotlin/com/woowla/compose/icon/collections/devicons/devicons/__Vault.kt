package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.vault.Original
import com.woowla.compose.icon.collections.devicons.devicons.vault.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.vault.PlainWordmark
import kotlin.collections.List as ____KtList

public object VaultGroup

public val Devicons.Vault: VaultGroup
  get() = VaultGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val VaultGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
