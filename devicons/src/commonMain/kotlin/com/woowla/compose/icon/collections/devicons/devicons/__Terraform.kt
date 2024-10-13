package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.terraform.Original
import com.woowla.compose.icon.collections.devicons.devicons.terraform.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.terraform.Plain
import com.woowla.compose.icon.collections.devicons.devicons.terraform.PlainWordmark
import kotlin.collections.List as ____KtList

public object TerraformGroup

public val Devicons.Terraform: TerraformGroup
  get() = TerraformGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TerraformGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, OriginalWordmark, Plain, PlainWordmark)
    return __AllIcons!!
  }
