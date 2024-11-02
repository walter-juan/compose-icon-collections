package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.PlaneSlash: ImageVector
    get() {
        if (_planeSlash != null) {
            return _planeSlash!!
        }
        _planeSlash = Builder(name = "PlaneSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(514.3f, 192.0f)
                curveToRelative(34.2f, 0.0f, 93.7f, 29.0f, 93.7f, 64.0f)
                curveToRelative(0.0f, 36.0f, -59.5f, 64.0f, -93.7f, 64.0f)
                lineToRelative(-73.8f, 0.0f)
                lineTo(630.8f, 469.1f)
                curveToRelative(10.4f, 8.2f, 12.3f, 23.3f, 4.1f, 33.7f)
                reflectiveCurveToRelative(-23.3f, 12.3f, -33.7f, 4.1f)
                lineTo(9.2f, 42.9f)
                curveTo(-1.2f, 34.7f, -3.1f, 19.6f, 5.1f, 9.2f)
                reflectiveCurveTo(28.4f, -3.1f, 38.8f, 5.1f)
                lineTo(238.1f, 161.3f)
                lineTo(197.8f, 20.4f)
                curveTo(194.9f, 10.2f, 202.6f, 0.0f, 213.2f, 0.0f)
                lineToRelative(56.2f, 0.0f)
                curveToRelative(11.5f, 0.0f, 22.1f, 6.2f, 27.8f, 16.1f)
                lineTo(397.7f, 192.0f)
                lineToRelative(116.6f, 0.0f)
                close()
                moveTo(41.5f, 128.7f)
                lineToRelative(321.0f, 252.9f)
                lineTo(297.2f, 495.9f)
                curveToRelative(-5.7f, 10.0f, -16.3f, 16.1f, -27.8f, 16.1f)
                lineToRelative(-56.2f, 0.0f)
                curveToRelative(-10.6f, 0.0f, -18.3f, -10.2f, -15.4f, -20.4f)
                lineToRelative(49.0f, -171.6f)
                lineTo(144.0f, 320.0f)
                lineToRelative(-43.2f, 57.6f)
                curveToRelative(-3.0f, 4.0f, -7.8f, 6.4f, -12.8f, 6.4f)
                lineToRelative(-42.0f, 0.0f)
                curveToRelative(-7.8f, 0.0f, -14.0f, -6.3f, -14.0f, -14.0f)
                curveToRelative(0.0f, -1.3f, 0.2f, -2.6f, 0.5f, -3.9f)
                lineTo(64.0f, 256.0f)
                lineTo(32.5f, 145.9f)
                curveToRelative(-0.4f, -1.3f, -0.5f, -2.6f, -0.5f, -3.9f)
                curveToRelative(0.0f, -6.2f, 4.0f, -11.4f, 9.5f, -13.3f)
                close()
            }
        }
        .build()
        return _planeSlash!!
    }

private var _planeSlash: ImageVector? = null
