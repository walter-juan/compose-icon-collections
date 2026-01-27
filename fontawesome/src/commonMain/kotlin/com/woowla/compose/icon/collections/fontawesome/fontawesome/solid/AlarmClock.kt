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

public val SolidGroup.AlarmClock: ImageVector
    get() {
        if (_alarmClock != null) {
            return _alarmClock!!
        }
        _alarmClock = Builder(name = "AlarmClock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.4f, 132.5f)
                curveToRelative(-4.5f, 10.5f, -18.4f, 9.8f, -24.9f, 0.4f)
                curveToRelative(-27.8f, -40.0f, -66.1f, -72.2f, -111.0f, -92.6f)
                curveToRelative(-10.4f, -4.7f, -13.7f, -18.3f, -4.1f, -24.6f)
                curveToRelative(15.0f, -9.9f, 33.0f, -15.7f, 52.3f, -15.7f)
                curveToRelative(52.6f, 0.0f, 95.2f, 42.6f, 95.2f, 95.2f)
                curveToRelative(0.0f, 13.2f, -2.7f, 25.8f, -7.6f, 37.3f)
                close()
                moveTo(32.5f, 132.9f)
                curveToRelative(-6.5f, 9.4f, -20.5f, 10.1f, -24.9f, -0.4f)
                curveToRelative(-4.9f, -11.5f, -7.6f, -24.1f, -7.6f, -37.3f)
                curveToRelative(0.0f, -52.6f, 42.6f, -95.2f, 95.2f, -95.2f)
                curveToRelative(19.3f, 0.0f, 37.3f, 5.8f, 52.3f, 15.7f)
                curveToRelative(9.6f, 6.3f, 6.3f, 19.9f, -4.1f, 24.6f)
                curveToRelative(-44.8f, 20.4f, -83.1f, 52.6f, -111.0f, 92.6f)
                close()
                moveTo(390.2f, 467.4f)
                curveTo(352.8f, 495.4f, 306.3f, 512.0f, 256.0f, 512.0f)
                reflectiveCurveToRelative(-96.8f, -16.6f, -134.1f, -44.6f)
                lineTo(86.6f, 502.6f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(35.2f, -35.2f)
                curveTo(48.6f, 384.8f, 32.0f, 338.3f, 32.0f, 288.0f)
                curveTo(32.0f, 164.3f, 132.3f, 64.0f, 256.0f, 64.0f)
                reflectiveCurveTo(480.0f, 164.3f, 480.0f, 288.0f)
                curveToRelative(0.0f, 50.3f, -16.6f, 96.8f, -44.6f, 134.2f)
                lineToRelative(35.2f, 35.2f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-35.2f, -35.2f)
                close()
                moveTo(280.0f, 184.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 104.0f)
                curveToRelative(0.0f, 6.4f, 2.5f, 12.5f, 7.0f, 17.0f)
                lineToRelative(56.0f, 56.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-49.0f, -49.0f)
                lineToRelative(0.0f, -94.1f)
                close()
            }
        }
        .build()
        return _alarmClock!!
    }

private var _alarmClock: ImageVector? = null
