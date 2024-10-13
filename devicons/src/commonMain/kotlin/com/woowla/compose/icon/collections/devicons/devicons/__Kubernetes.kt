package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.kubernetes.Line
import com.woowla.compose.icon.collections.devicons.devicons.kubernetes.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.kubernetes.Original
import com.woowla.compose.icon.collections.devicons.devicons.kubernetes.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.kubernetes.Plain
import com.woowla.compose.icon.collections.devicons.devicons.kubernetes.PlainWordmark
import kotlin.collections.List as ____KtList

public object KubernetesGroup

public val Devicons.Kubernetes: KubernetesGroup
  get() = KubernetesGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val KubernetesGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
