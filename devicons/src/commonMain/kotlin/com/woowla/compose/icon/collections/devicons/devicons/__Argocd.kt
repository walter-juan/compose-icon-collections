package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.argocd.Original
import com.woowla.compose.icon.collections.devicons.devicons.argocd.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.argocd.Plain
import com.woowla.compose.icon.collections.devicons.devicons.argocd.PlainWordmark
import kotlin.collections.List as ____KtList

public object ArgocdGroup

public val Devicons.Argocd: ArgocdGroup
  get() = ArgocdGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ArgocdGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
