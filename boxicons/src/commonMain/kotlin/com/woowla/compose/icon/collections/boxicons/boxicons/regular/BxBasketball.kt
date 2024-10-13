package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxBasketball: ImageVector
    get() {
        if (_bxBasketball != null) {
            return _bxBasketball!!
        }
        _bxBasketball = Builder(name = "BxBasketball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 19.071f)
                curveToRelative(1.895f, 1.895f, 4.405f, 2.938f, 7.071f, 2.938f)
                reflectiveCurveToRelative(5.177f, -1.043f, 7.071f, -2.938f)
                curveToRelative(3.899f, -3.899f, 3.899f, -10.243f, 0.0f, -14.143f)
                curveTo(17.177f, 3.034f, 14.665f, 1.99f, 12.0f, 1.99f)
                reflectiveCurveTo(6.823f, 3.034f, 4.929f, 4.929f)
                curveToRelative(-3.899f, 3.898f, -3.899f, 10.243f, 0.0f, 14.142f)
                close()
                moveTo(12.309f, 4.006f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, true, 4.594f, 1.678f)
                lineTo(12.0f, 10.586f)
                lineToRelative(-1.46f, -1.46f)
                curveToRelative(1.161f, -1.479f, 1.792f, -3.308f, 1.769f, -5.12f)
                close()
                moveTo(9.11f, 7.696f)
                lineTo(7.098f, 5.684f)
                arcToRelative(7.929f, 7.929f, 0.0f, false, true, 3.218f, -1.51f)
                curveToRelative(-0.015f, 1.236f, -0.445f, 2.477f, -1.206f, 3.522f)
                close()
                moveTo(7.686f, 9.1f)
                arcToRelative(6.065f, 6.065f, 0.0f, false, true, -3.459f, 1.057f)
                arcToRelative(7.923f, 7.923f, 0.0f, false, true, 1.458f, -3.058f)
                lineTo(7.686f, 9.1f)
                close()
                moveTo(4.011f, 12.146f)
                curveToRelative(0.077f, 0.002f, 0.154f, 0.014f, 0.231f, 0.014f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, false, 4.877f, -1.626f)
                lineTo(10.586f, 12.0f)
                lineToRelative(-4.901f, 4.901f)
                arcToRelative(7.972f, 7.972f, 0.0f, false, true, -1.674f, -4.755f)
                close()
                moveTo(16.305f, 14.891f)
                curveToRelative(1.042f, -0.758f, 2.28f, -1.188f, 3.508f, -1.206f)
                arcToRelative(7.947f, 7.947f, 0.0f, false, true, -1.497f, 3.217f)
                lineToRelative(-2.011f, -2.011f)
                close()
                moveTo(16.902f, 18.316f)
                arcToRelative(7.935f, 7.935f, 0.0f, false, true, -3.059f, 1.47f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, true, 1.057f, -3.472f)
                lineToRelative(2.002f, 2.002f)
                close()
                moveTo(11.858f, 20.002f)
                arcToRelative(7.922f, 7.922f, 0.0f, false, true, -4.761f, -1.686f)
                lineTo(12.0f, 13.414f)
                lineToRelative(1.463f, 1.463f)
                curveToRelative(-1.103f, 1.444f, -1.659f, 3.266f, -1.605f, 5.125f)
                close()
                moveTo(19.982f, 11.692f)
                curveToRelative(-1.807f, -0.018f, -3.633f, 0.61f, -5.108f, 1.768f)
                lineTo(13.414f, 12.0f)
                lineToRelative(4.901f, -4.901f)
                arcToRelative(7.968f, 7.968f, 0.0f, false, true, 1.667f, 4.593f)
                close()
            }
        }
        .build()
        return _bxBasketball!!
    }

private var _bxBasketball: ImageVector? = null
