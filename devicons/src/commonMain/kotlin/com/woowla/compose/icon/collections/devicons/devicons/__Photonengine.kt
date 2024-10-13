package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.photonengine.Original
import com.woowla.compose.icon.collections.devicons.devicons.photonengine.Plain
import kotlin.collections.List as ____KtList

public object PhotonengineGroup

public val Devicons.Photonengine: PhotonengineGroup
  get() = PhotonengineGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val PhotonengineGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
