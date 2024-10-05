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

public val OutlineGroup.GuitarPick: ImageVector
    get() {
        if (_guitarPick != null) {
            return _guitarPick!!
        }
        _guitarPick = Builder(name = "GuitarPick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 18.5f)
                curveToRelative(2.0f, -2.5f, 4.0f, -6.5f, 4.0f, -10.5f)
                curveToRelative(0.0f, -2.946f, -2.084f, -4.157f, -4.204f, -4.654f)
                curveToRelative(-0.864f, -0.23f, -2.13f, -0.346f, -3.796f, -0.346f)
                curveToRelative(-1.667f, 0.0f, -2.932f, 0.115f, -3.796f, 0.346f)
                curveToRelative(-2.12f, 0.497f, -4.204f, 1.708f, -4.204f, 4.654f)
                curveToRelative(0.0f, 3.312f, 2.0f, 8.0f, 4.0f, 10.5f)
                curveToRelative(0.297f, 0.37f, 0.618f, 0.731f, 0.963f, 1.081f)
                lineToRelative(0.354f, 0.347f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.364f, 0.0f)
                arcToRelative(14.05f, 14.05f, 0.0f, false, false, 1.319f, -1.428f)
                close()
            }
        }
        .build()
        return _guitarPick!!
    }

private var _guitarPick: ImageVector? = null
