package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.RibbonHealth: ImageVector
    get() {
        if (_ribbonHealth != null) {
            return _ribbonHealth!!
        }
        _ribbonHealth = Builder(name = "RibbonHealth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 21.0f)
                reflectiveCurveToRelative(9.286f, -9.841f, 9.286f, -13.841f)
                arcToRelative(3.864f, 3.864f, 0.0f, false, false, -1.182f, -3.008f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, false, -3.104f, -1.144f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, false, -3.104f, 1.143f)
                arcToRelative(3.864f, 3.864f, 0.0f, false, false, -1.182f, 3.01f)
                curveToRelative(0.0f, 4.0f, 9.286f, 13.84f, 9.286f, 13.84f)
            }
        }
        .build()
        return _ribbonHealth!!
    }

private var _ribbonHealth: ImageVector? = null
