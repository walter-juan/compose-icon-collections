package com.woowla.compose.icon.collections.remix

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.remix.remix.AllIcons
import com.woowla.compose.icon.collections.remix.remix.Arrows
import com.woowla.compose.icon.collections.remix.remix.Buildings
import com.woowla.compose.icon.collections.remix.remix.Business
import com.woowla.compose.icon.collections.remix.remix.Communication
import com.woowla.compose.icon.collections.remix.remix.Design
import com.woowla.compose.icon.collections.remix.remix.Development
import com.woowla.compose.icon.collections.remix.remix.Device
import com.woowla.compose.icon.collections.remix.remix.Document
import com.woowla.compose.icon.collections.remix.remix.Editor
import com.woowla.compose.icon.collections.remix.remix.Finance
import com.woowla.compose.icon.collections.remix.remix.Food
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedical
import com.woowla.compose.icon.collections.remix.remix.Logos
import com.woowla.compose.icon.collections.remix.remix.Map
import com.woowla.compose.icon.collections.remix.remix.Media
import com.woowla.compose.icon.collections.remix.remix.Others
import com.woowla.compose.icon.collections.remix.remix.System
import com.woowla.compose.icon.collections.remix.remix.UserAndFaces
import com.woowla.compose.icon.collections.remix.remix.Weather
import kotlin.collections.List as ____KtList

public object Remix

private var __AllIcons: ____KtList<ImageVector>? = null

public val Remix.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Editor.AllIcons + Logos.AllIcons + Map.AllIcons + Food.AllIcons +
        Development.AllIcons + Others.AllIcons + Business.AllIcons + Buildings.AllIcons +
        Design.AllIcons + Media.AllIcons + Document.AllIcons + Communication.AllIcons +
        Finance.AllIcons + System.AllIcons + Arrows.AllIcons + UserAndFaces.AllIcons +
        Device.AllIcons + Weather.AllIcons + HealthAndMedical.AllIcons + listOf()
    return __AllIcons!!
  }
