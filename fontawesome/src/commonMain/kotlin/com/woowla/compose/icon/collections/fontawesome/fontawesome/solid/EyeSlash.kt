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

public val SolidGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-96.4f, -96.4f)
                curveToRelative(2.7f, -2.4f, 5.4f, -4.8f, 8.0f, -7.2f)
                curveToRelative(46.8f, -43.5f, 78.1f, -95.4f, 93.0f, -131.1f)
                curveToRelative(3.3f, -7.9f, 3.3f, -16.7f, 0.0f, -24.6f)
                curveToRelative(-14.9f, -35.7f, -46.2f, -87.7f, -93.0f, -131.1f)
                curveToRelative(-47.1f, -43.7f, -111.8f, -80.6f, -192.6f, -80.6f)
                curveToRelative(-56.8f, 0.0f, -105.6f, 18.2f, -146.0f, 44.2f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(204.5f, 138.7f)
                curveToRelative(23.5f, -16.8f, 52.4f, -26.7f, 83.5f, -26.7f)
                curveToRelative(79.5f, 0.0f, 144.0f, 64.5f, 144.0f, 144.0f)
                curveToRelative(0.0f, 31.1f, -9.9f, 59.9f, -26.7f, 83.5f)
                lineToRelative(-34.7f, -34.7f)
                curveToRelative(12.7f, -21.4f, 17.0f, -47.7f, 10.1f, -73.7f)
                curveToRelative(-13.7f, -51.2f, -66.4f, -81.6f, -117.6f, -67.9f)
                curveToRelative(-8.6f, 2.3f, -16.7f, 5.7f, -24.0f, 10.0f)
                lineToRelative(-34.7f, -34.7f)
                close()
                moveTo(325.3f, 395.1f)
                curveToRelative(-11.9f, 3.2f, -24.4f, 4.9f, -37.3f, 4.9f)
                curveToRelative(-79.5f, 0.0f, -144.0f, -64.5f, -144.0f, -144.0f)
                curveToRelative(0.0f, -12.9f, 1.7f, -25.4f, 4.9f, -37.3f)
                lineTo(69.4f, 139.2f)
                curveToRelative(-32.6f, 36.8f, -55.0f, 75.8f, -66.9f, 104.5f)
                curveToRelative(-3.3f, 7.9f, -3.3f, 16.7f, 0.0f, 24.6f)
                curveToRelative(14.9f, 35.7f, 46.2f, 87.7f, 93.0f, 131.1f)
                curveToRelative(47.1f, 43.7f, 111.8f, 80.6f, 192.6f, 80.6f)
                curveToRelative(37.3f, 0.0f, 71.2f, -7.9f, 101.5f, -20.6f)
                lineToRelative(-64.2f, -64.2f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
