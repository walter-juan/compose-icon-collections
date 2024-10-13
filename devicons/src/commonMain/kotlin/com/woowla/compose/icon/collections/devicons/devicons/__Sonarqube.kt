package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.sonarqube.Line
import com.woowla.compose.icon.collections.devicons.devicons.sonarqube.LineWordmark
import com.woowla.compose.icon.collections.devicons.devicons.sonarqube.Original
import com.woowla.compose.icon.collections.devicons.devicons.sonarqube.OriginalWordmark
import com.woowla.compose.icon.collections.devicons.devicons.sonarqube.PlainWordmark
import kotlin.collections.List as ____KtList

public object SonarqubeGroup

public val Devicons.Sonarqube: SonarqubeGroup
  get() = SonarqubeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SonarqubeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, LineWordmark, Original, OriginalWordmark, PlainWordmark)
    return __AllIcons!!
  }
