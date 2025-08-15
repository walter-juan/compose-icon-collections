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

public val SolidGroup.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(65.9f, 228.5f)
                curveToRelative(13.3f, -93.0f, 93.4f, -164.5f, 190.1f, -164.5f)
                curveToRelative(53.0f, 0.0f, 101.0f, 21.5f, 135.8f, 56.2f)
                curveToRelative(0.2f, 0.2f, 0.4f, 0.4f, 0.6f, 0.6f)
                lineToRelative(7.6f, 7.2f)
                lineToRelative(-47.9f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 53.4f)
                lineToRelative(-11.3f, -10.7f)
                curveTo(390.5f, 28.6f, 326.5f, 0.0f, 256.0f, 0.0f)
                curveTo(127.0f, 0.0f, 20.3f, 95.4f, 2.6f, 219.5f)
                curveTo(0.1f, 237.0f, 12.2f, 253.2f, 29.7f, 255.7f)
                reflectiveCurveToRelative(33.7f, -9.7f, 36.2f, -27.1f)
                close()
                moveTo(509.4f, 292.5f)
                curveToRelative(2.5f, -17.5f, -9.7f, -33.7f, -27.1f, -36.2f)
                reflectiveCurveToRelative(-33.7f, 9.7f, -36.2f, 27.1f)
                curveToRelative(-13.3f, 93.0f, -93.4f, 164.5f, -190.1f, 164.5f)
                curveToRelative(-53.0f, 0.0f, -101.0f, -21.5f, -135.8f, -56.2f)
                curveToRelative(-0.2f, -0.2f, -0.4f, -0.4f, -0.6f, -0.6f)
                lineToRelative(-7.6f, -7.2f)
                lineToRelative(47.9f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 320.0f)
                curveToRelative(-8.5f, 0.0f, -16.7f, 3.4f, -22.7f, 9.5f)
                reflectiveCurveTo(-0.1f, 343.7f, 0.0f, 352.3f)
                lineToRelative(1.0f, 127.0f)
                curveToRelative(0.1f, 17.7f, 14.6f, 31.9f, 32.3f, 31.7f)
                reflectiveCurveTo(65.2f, 496.4f, 65.0f, 478.7f)
                lineToRelative(-0.4f, -51.5f)
                lineToRelative(10.7f, 10.1f)
                curveToRelative(46.3f, 46.1f, 110.2f, 74.7f, 180.7f, 74.7f)
                curveToRelative(129.0f, 0.0f, 235.7f, -95.4f, 253.4f, -219.5f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
