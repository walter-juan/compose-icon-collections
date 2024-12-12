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

public val Simpleicons.Continente: ImageVector
    get() {
        if (_continente != null) {
            return _continente!!
        }
        _continente = Builder(name = "Continente", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.992f, 0.0f)
                curveTo(5.374f, 0.0f, 0.008f, 5.381f, 0.008f, 12.0f)
                curveToRelative(0.0f, 6.633f, 5.351f, 12.0f, 11.984f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.367f, 12.0f, -12.0f)
                reflectiveCurveToRelative(-5.381f, -12.0f, -12.0f, -12.0f)
                moveToRelative(0.0f, 2.504f)
                curveToRelative(5.247f, 0.0f, 9.512f, 4.264f, 9.512f, 9.496f)
                curveToRelative(0.0f, 5.232f, -4.265f, 9.51f, -9.512f, 9.51f)
                reflectiveCurveTo(2.496f, 17.262f, 2.496f, 12.0f)
                curveToRelative(0.0f, -5.247f, 4.249f, -9.496f, 9.496f, -9.496f)
                moveToRelative(-0.059f, 2.385f)
                curveToRelative(-3.935f, 0.0f, -7.127f, 3.177f, -7.127f, 7.127f)
                reflectiveCurveToRelative(3.192f, 7.141f, 7.127f, 7.141f)
                curveToRelative(1.968f, 0.0f, 3.755f, -0.791f, 5.037f, -2.088f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, 0.0f, -2.684f)
                curveToRelative(-0.73f, -0.746f, -1.923f, -0.746f, -2.668f, 0.0f)
                curveToRelative(-0.611f, 0.611f, -1.445f, 0.984f, -2.369f, 0.984f)
                curveToRelative(-1.848f, 0.0f, -3.34f, -1.52f, -3.34f, -3.353f)
                reflectiveCurveToRelative(1.491f, -3.34f, 3.34f, -3.34f)
                verticalLineToRelative(-0.016f)
                curveToRelative(0.924f, 0.0f, 1.758f, 0.373f, 2.369f, 0.984f)
                curveToRelative(0.73f, 0.73f, 1.923f, 0.73f, 2.668f, 0.0f)
                reflectiveCurveToRelative(0.745f, -1.923f, 0.0f, -2.684f)
                curveToRelative(-1.282f, -1.282f, -3.069f, -2.072f, -5.037f, -2.072f)
                moveToRelative(0.059f, 5.754f)
                curveToRelative(-0.76f, 0.0f, -1.371f, 0.613f, -1.371f, 1.373f)
                reflectiveCurveToRelative(0.611f, 1.371f, 1.371f, 1.371f)
                curveToRelative(0.76f, 0.0f, 1.371f, -0.626f, 1.371f, -1.371f)
                curveToRelative(0.0f, -0.745f, -0.611f, -1.373f, -1.371f, -1.373f)
            }
        }
        .build()
        return _continente!!
    }

private var _continente: ImageVector? = null
