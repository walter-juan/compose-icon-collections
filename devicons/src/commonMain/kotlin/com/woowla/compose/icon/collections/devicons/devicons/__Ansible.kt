package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.ansible.Original
import com.woowla.compose.icon.collections.devicons.devicons.ansible.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.ansible.Plain
import com.woowla.compose.icon.collections.devicons.devicons.ansible.PlainWordmark
import kotlin.collections.List as ____KtList

public object AnsibleGroup

public val Devicons.Ansible: AnsibleGroup
  get() = AnsibleGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AnsibleGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
