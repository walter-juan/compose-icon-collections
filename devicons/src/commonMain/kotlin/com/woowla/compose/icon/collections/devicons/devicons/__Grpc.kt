package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.grpc.Original
import com.woowla.compose.icon.collections.devicons.devicons.grpc.Plain
import kotlin.collections.List as ____KtList

public object GrpcGroup

public val Devicons.Grpc: GrpcGroup
  get() = GrpcGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val GrpcGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Original, Plain)
    return __AllIcons!!
  }
