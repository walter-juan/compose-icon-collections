package com.woowla.compose.icon.collections.devicons.devicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.woowla.compose.icon.collections.devicons.Devicons
import com.woowla.compose.icon.collections.devicons.devicons.jenkins.Line
import com.woowla.compose.icon.collections.devicons.devicons.jenkins.Original
import com.woowla.compose.icon.collections.devicons.devicons.jenkins.Plain
import kotlin.collections.List as ____KtList

public object JenkinsGroup

public val Devicons.Jenkins: JenkinsGroup
  get() = JenkinsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val JenkinsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Line, Original, Plain)
    return __AllIcons!!
  }
