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

public val Simpleicons.Skoda: ImageVector
    get() {
        if (_skoda != null) {
            return _skoda!!
        }
        _skoda = Builder(name = "Skoda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.964f)
                curveTo(5.945f, 22.964f, 1.036f, 18.055f, 1.036f, 12.0f)
                curveTo(1.036f, 5.945f, 5.945f, 1.036f, 12.0f, 1.036f)
                reflectiveCurveTo(22.964f, 5.945f, 22.964f, 12.0f)
                reflectiveCurveTo(18.055f, 22.964f, 12.0f, 22.964f)
                close()
                moveTo(17.189f, 15.731f)
                lineTo(16.92f, 16.457f)
                horizontalLineToRelative(-0.984f)
                curveToRelative(0.263f, -0.709f, 3.578f, -8.618f, -2.936f, -13.982f)
                arcToRelative(9.525f, 9.525f, 0.0f, false, false, -4.053f, 0.448f)
                curveToRelative(0.217f, 0.175f, 2.474f, 2.028f, 3.537f, 4.315f)
                lineToRelative(-0.312f, 0.084f)
                curveToRelative(-0.586f, -0.639f, -2.716f, -2.983f, -4.745f, -3.738f)
                arcToRelative(9.618f, 9.618f, 0.0f, false, false, -2.845f, 2.36f)
                curveToRelative(0.953f, 0.488f, 3.443f, 1.975f, 4.39f, 3.13f)
                curveToRelative(-0.054f, 0.024f, -0.267f, 0.139f, -0.267f, 0.139f)
                curveToRelative(-1.736f, -1.319f, -4.82f, -2.004f, -4.977f, -2.038f)
                arcToRelative(9.513f, 9.513f, 0.0f, false, false, -1.227f, 3.61f)
                curveToRelative(4.776f, 0.961f, 6.062f, 3.171f, 6.282f, 5.672f)
                lineTo(7.878f, 16.457f)
                lineToRelative(-1.554f, -0.678f)
                arcToRelative(0.856f, 0.856f, 0.0f, false, false, -0.252f, -0.053f)
                lineTo(3.177f, 15.727f)
                arcToRelative(9.587f, 9.587f, 0.0f, false, false, 1.927f, 2.915f)
                horizontalLineToRelative(1.233f)
                curveToRelative(0.106f, 0.0f, 0.199f, -0.013f, 0.292f, -0.066f)
                lineToRelative(1.249f, -0.638f)
                horizontalLineToRelative(9.042f)
                lineToRelative(0.269f, 0.726f)
                arcToRelative(4.839f, 4.839f, 0.0f, false, false, 2.947f, -1.467f)
                arcToRelative(4.839f, 4.839f, 0.0f, false, false, -2.947f, -1.467f)
                close()
                moveTo(13.049f, 15.153f)
                arcToRelative(1.186f, 1.186f, 0.0f, false, true, -0.504f, -1.216f)
                arcToRelative(1.186f, 1.186f, 0.0f, false, true, 0.931f, -0.931f)
                arcToRelative(1.186f, 1.186f, 0.0f, false, true, 1.216f, 0.504f)
                curveToRelative(0.31f, 0.464f, 0.256f, 1.092f, -0.147f, 1.496f)
                curveToRelative(-0.403f, 0.403f, -1.032f, 0.457f, -1.496f, 0.147f)
                close()
            }
        }
        .build()
        return _skoda!!
    }

private var _skoda: ImageVector? = null
