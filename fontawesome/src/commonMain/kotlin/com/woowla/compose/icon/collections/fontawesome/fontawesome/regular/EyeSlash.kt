package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.EyeSlash: ImageVector
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
                moveTo(176.9f, 111.1f)
                curveToRelative(32.1f, -18.9f, 69.2f, -31.1f, 111.1f, -31.1f)
                curveToRelative(65.2f, 0.0f, 118.8f, 29.6f, 159.9f, 67.7f)
                curveToRelative(38.5f, 35.7f, 65.1f, 78.3f, 78.6f, 108.3f)
                curveToRelative(-13.6f, 30.0f, -40.2f, 72.5f, -78.6f, 108.3f)
                curveToRelative(-3.1f, 2.8f, -6.2f, 5.6f, -9.4f, 8.4f)
                lineTo(393.8f, 328.0f)
                curveToRelative(14.0f, -20.5f, 22.2f, -45.3f, 22.2f, -72.0f)
                curveToRelative(0.0f, -70.7f, -57.3f, -128.0f, -128.0f, -128.0f)
                curveToRelative(-26.7f, 0.0f, -51.5f, 8.2f, -72.0f, 22.2f)
                lineToRelative(-39.1f, -39.1f)
                close()
                moveTo(358.9f, 293.1f)
                lineToRelative(-108.0f, -108.0f)
                curveToRelative(11.1f, -5.8f, 23.7f, -9.1f, 37.1f, -9.1f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 13.4f, -3.3f, 26.0f, -9.1f, 37.1f)
                close()
                moveTo(103.4f, 173.2f)
                lineToRelative(-34.0f, -34.0f)
                curveToRelative(-32.6f, 36.8f, -55.0f, 75.8f, -66.9f, 104.5f)
                curveToRelative(-3.3f, 7.9f, -3.3f, 16.7f, 0.0f, 24.6f)
                curveToRelative(14.9f, 35.7f, 46.2f, 87.7f, 93.0f, 131.1f)
                curveToRelative(47.1f, 43.7f, 111.8f, 80.6f, 192.6f, 80.6f)
                curveToRelative(37.3f, 0.0f, 71.2f, -7.9f, 101.5f, -20.6f)
                lineTo(352.2f, 422.0f)
                curveToRelative(-20.0f, 6.4f, -41.4f, 10.0f, -64.2f, 10.0f)
                curveToRelative(-65.2f, 0.0f, -118.8f, -29.6f, -159.9f, -67.7f)
                curveToRelative(-38.5f, -35.7f, -65.1f, -78.3f, -78.6f, -108.3f)
                curveToRelative(10.4f, -23.1f, 28.6f, -53.6f, 54.0f, -82.8f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
