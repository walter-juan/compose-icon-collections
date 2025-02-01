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

public val Simpleicons.Ultralytics: ImageVector
    get() {
        if (_ultralytics != null) {
            return _ultralytics!!
        }
        _ultralytics = Builder(name = "Ultralytics", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.736f, 7.341f)
                lineToRelative(-0.002f, 2.897f)
                curveToRelative(0.012f, 3.953f, -3.188f, 7.177f, -7.098f, 7.171f)
                curveToRelative(-1.553f, -0.003f, -2.967f, -0.48f, -4.112f, -1.313f)
                curveToRelative(2.056f, 3.725f, 5.999f, 6.24f, 10.48f, 6.245f)
                curveToRelative(6.511f, -0.003f, 11.891f, -5.343f, 11.992f, -11.91f)
                lineToRelative(-0.002f, -0.027f)
                curveToRelative(0.006f, -0.151f, 0.0f, -2.951f, 0.006f, -3.075f)
                curveToRelative(-0.01f, -3.116f, -2.538f, -5.677f, -5.63f, -5.67f)
                curveToRelative(-3.105f, -0.006f, -5.645f, 2.54f, -5.634f, 5.683f)
                close()
                moveTo(5.629f, 4.573f)
                curveTo(2.525f, 4.573f, 0.0f, 7.118f, 0.0f, 10.246f)
                reflectiveCurveToRelative(2.525f, 5.673f, 5.63f, 5.673f)
                curveToRelative(3.103f, 0.0f, 5.629f, -2.545f, 5.629f, -5.673f)
                reflectiveCurveToRelative(-2.526f, -5.673f, -5.63f, -5.673f)
            }
        }
        .build()
        return _ultralytics!!
    }

private var _ultralytics: ImageVector? = null
