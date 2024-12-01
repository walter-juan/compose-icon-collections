package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Gamescience: ImageVector
    get() {
        if (_gamescience != null) {
            return _gamescience!!
        }
        _gamescience = Builder(name = "Gamescience", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.847f, 19.089f)
                curveToRelative(-0.555f, -0.137f, -0.853f, -0.305f, -1.213f, -0.685f)
                curveToRelative(-0.613f, -0.645f, -0.76f, -1.273f, -0.534f, -2.287f)
                curveToRelative(0.394f, -1.77f, 1.645f, -3.34f, 3.321f, -4.166f)
                curveToRelative(1.03f, -0.508f, 1.64f, -0.657f, 2.693f, -0.656f)
                curveToRelative(0.759f, 0.0f, 0.928f, 0.027f, 1.325f, 0.212f)
                lineToRelative(0.456f, 0.213f)
                lineToRelative(4.263f, -2.841f)
                curveToRelative(2.344f, -1.563f, 4.276f, -2.828f, 4.294f, -2.81f)
                reflectiveCurveToRelative(-0.177f, 0.987f, -0.431f, 2.155f)
                curveToRelative(-0.254f, 1.169f, -0.462f, 2.176f, -0.462f, 2.24f)
                curveToRelative(0.0f, 0.063f, 1.865f, -1.167f, 4.144f, -2.734f)
                curveToRelative(4.153f, -2.856f, 4.42f, -3.037f, 4.265f, -2.883f)
                curveToRelative(-0.268f, 0.266f, -10.33f, 8.653f, -10.353f, 8.63f)
                curveToRelative(-0.015f, -0.017f, 0.174f, -1.036f, 0.419f, -2.267f)
                reflectiveCurveToRelative(0.436f, -2.28f, 0.426f, -2.334f)
                curveToRelative(-0.011f, -0.053f, -1.231f, 0.964f, -2.712f, 2.26f)
                lineToRelative(-2.693f, 2.356f)
                lineToRelative(-0.053f, 0.765f)
                curveToRelative(-0.17f, 2.428f, -2.022f, 4.156f, -5.168f, 4.823f)
                curveToRelative(-0.69f, 0.146f, -1.42f, 0.15f, -1.987f, 0.009f)
            }
        }
        .build()
        return _gamescience!!
    }

private var _gamescience: ImageVector? = null
