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

public val SolidGroup.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 0.0f)
                curveToRelative(14.6f, 0.0f, 28.8f, 1.6f, 42.5f, 4.7f)
                curveToRelative(7.4f, 1.7f, 13.0f, 7.8f, 13.9f, 15.4f)
                reflectiveCurveToRelative(-3.0f, 14.9f, -9.8f, 18.3f)
                curveToRelative(-45.4f, 22.6f, -76.6f, 69.5f, -76.6f, 123.6f)
                curveToRelative(0.0f, 76.2f, 61.8f, 138.0f, 138.0f, 138.0f)
                curveToRelative(3.7f, 0.0f, 7.4f, -0.1f, 11.1f, -0.4f)
                curveToRelative(7.6f, -0.6f, 14.7f, 3.6f, 17.8f, 10.6f)
                reflectiveCurveToRelative(1.5f, 15.1f, -3.9f, 20.4f)
                curveToRelative(-26.0f, 25.0f, -59.1f, 42.7f, -95.9f, 49.9f)
                curveToRelative(-11.1f, -25.3f, -30.2f, -46.3f, -54.1f, -59.8f)
                curveToRelative(-7.6f, -63.4f, -61.6f, -112.6f, -127.1f, -112.6f)
                curveToRelative(-11.2f, 0.0f, -22.1f, 1.5f, -32.5f, 4.2f)
                curveToRelative(-4.8f, -4.2f, -9.9f, -8.2f, -15.2f, -11.8f)
                curveToRelative(-0.1f, -2.8f, -0.2f, -5.6f, -0.2f, -8.4f)
                curveToRelative(0.0f, -106.0f, 86.0f, -192.0f, 192.0f, -192.0f)
                close()
                moveTo(479.9f, 431.9f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                lineToRelative(-271.9f, 0.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                curveToRelative(0.0f, -47.6f, 34.6f, -87.0f, 80.0f, -94.6f)
                curveToRelative(-0.4f, -52.8f, 42.9f, -97.3f, 96.0f, -97.3f)
                curveToRelative(34.9f, 0.0f, 65.4f, 18.6f, 82.2f, 46.4f)
                curveToRelative(13.0f, -9.1f, 28.8f, -14.4f, 45.8f, -14.4f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 5.9f, -0.6f, 11.7f, -1.9f, 17.2f)
                curveToRelative(37.4f, 6.7f, 65.8f, 39.4f, 65.8f, 78.7f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
