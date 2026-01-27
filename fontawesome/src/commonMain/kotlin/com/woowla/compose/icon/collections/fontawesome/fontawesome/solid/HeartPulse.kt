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

public val SolidGroup.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = Builder(name = "HeartPulse", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 107.9f)
                lineTo(241.0f, 87.1f)
                curveTo(216.0f, 52.5f, 175.9f, 32.0f, 133.1f, 32.0f)
                curveTo(59.6f, 32.0f, 0.0f, 91.6f, 0.0f, 165.1f)
                lineToRelative(0.0f, 2.6f)
                curveToRelative(0.0f, 23.6f, 6.2f, 48.0f, 16.6f, 72.3f)
                lineToRelative(106.0f, 0.0f)
                curveToRelative(3.2f, 0.0f, 6.1f, -1.9f, 7.4f, -4.9f)
                lineToRelative(31.8f, -76.3f)
                curveToRelative(3.7f, -8.8f, 12.3f, -14.6f, 21.8f, -14.8f)
                reflectiveCurveToRelative(18.3f, 5.4f, 22.2f, 14.1f)
                lineToRelative(51.3f, 113.9f)
                lineToRelative(41.4f, -82.8f)
                curveToRelative(4.1f, -8.1f, 12.4f, -13.3f, 21.5f, -13.3f)
                reflectiveCurveToRelative(17.4f, 5.1f, 21.5f, 13.3f)
                lineToRelative(23.2f, 46.3f)
                curveToRelative(1.4f, 2.7f, 4.1f, 4.4f, 7.2f, 4.4f)
                lineToRelative(123.6f, 0.0f)
                curveToRelative(10.5f, -24.3f, 16.6f, -48.7f, 16.6f, -72.3f)
                lineToRelative(0.0f, -2.6f)
                curveTo(512.0f, 91.6f, 452.4f, 32.0f, 378.9f, 32.0f)
                curveTo(336.2f, 32.0f, 296.0f, 52.5f, 271.0f, 87.1f)
                lineToRelative(-15.0f, 20.7f)
                close()
                moveTo(469.6f, 288.0f)
                lineToRelative(-97.8f, 0.0f)
                curveToRelative(-21.2f, 0.0f, -40.6f, -12.0f, -50.1f, -31.0f)
                lineToRelative(-1.7f, -3.4f)
                lineToRelative(-42.5f, 85.1f)
                curveToRelative(-4.1f, 8.3f, -12.7f, 13.5f, -22.0f, 13.3f)
                reflectiveCurveToRelative(-17.6f, -5.7f, -21.4f, -14.1f)
                lineToRelative(-49.3f, -109.5f)
                lineToRelative(-10.5f, 25.2f)
                curveToRelative(-8.7f, 20.9f, -29.1f, 34.5f, -51.7f, 34.5f)
                lineToRelative(-80.2f, 0.0f)
                curveToRelative(47.2f, 73.8f, 123.0f, 141.7f, 170.4f, 177.9f)
                curveToRelative(12.4f, 9.4f, 27.6f, 14.1f, 43.1f, 14.1f)
                reflectiveCurveToRelative(30.8f, -4.6f, 43.1f, -14.1f)
                curveTo(346.6f, 429.7f, 422.4f, 361.8f, 469.6f, 288.0f)
                close()
            }
        }
        .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
