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

public val SolidGroup.Rotate: ImageVector
    get() {
        if (_rotate != null) {
            return _rotate!!
        }
        _rotate = Builder(name = "Rotate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.1f, 192.0f)
                lineToRelative(7.9f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -144.0f)
                curveToRelative(0.0f, -9.7f, -5.8f, -18.5f, -14.8f, -22.2f)
                reflectiveCurveTo(477.9f, 0.2f, 471.0f, 7.0f)
                lineTo(419.3f, 58.8f)
                curveTo(375.0f, 22.1f, 318.0f, 0.0f, 256.0f, 0.0f)
                curveTo(127.0f, 0.0f, 20.3f, 95.4f, 2.6f, 219.5f)
                curveTo(0.1f, 237.0f, 12.2f, 253.2f, 29.7f, 255.7f)
                reflectiveCurveToRelative(33.7f, -9.7f, 36.2f, -27.1f)
                curveTo(79.2f, 135.5f, 159.3f, 64.0f, 256.0f, 64.0f)
                curveTo(300.4f, 64.0f, 341.2f, 79.0f, 373.7f, 104.3f)
                lineTo(327.0f, 151.0f)
                curveToRelative(-6.9f, 6.9f, -8.9f, 17.2f, -5.2f, 26.2f)
                reflectiveCurveTo(334.3f, 192.0f, 344.0f, 192.0f)
                lineToRelative(136.1f, 0.0f)
                close()
                moveTo(509.5f, 292.5f)
                curveToRelative(2.5f, -17.5f, -9.7f, -33.7f, -27.1f, -36.2f)
                reflectiveCurveToRelative(-33.7f, 9.7f, -36.2f, 27.1f)
                curveToRelative(-13.3f, 93.0f, -93.4f, 164.5f, -190.1f, 164.5f)
                curveToRelative(-44.4f, 0.0f, -85.2f, -15.0f, -117.7f, -40.3f)
                lineTo(185.0f, 361.0f)
                curveToRelative(6.9f, -6.9f, 8.9f, -17.2f, 5.2f, -26.2f)
                reflectiveCurveTo(177.7f, 320.0f, 168.0f, 320.0f)
                lineTo(24.0f, 320.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineTo(0.0f, 488.0f)
                curveToRelative(0.0f, 9.7f, 5.8f, 18.5f, 14.8f, 22.2f)
                reflectiveCurveTo(34.1f, 511.8f, 41.0f, 505.0f)
                lineToRelative(51.8f, -51.8f)
                curveTo(137.0f, 489.9f, 194.0f, 512.0f, 256.0f, 512.0f)
                curveTo(385.0f, 512.0f, 491.7f, 416.6f, 509.4f, 292.5f)
                close()
            }
        }
        .build()
        return _rotate!!
    }

private var _rotate: ImageVector? = null
