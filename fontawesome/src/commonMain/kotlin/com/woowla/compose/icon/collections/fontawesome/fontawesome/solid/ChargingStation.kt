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

public val SolidGroup.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) {
            return _chargingStation!!
        }
        _chargingStation = Builder(name = "ChargingStation", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                curveTo(64.0f, 28.7f, 92.7f, 0.0f, 128.0f, 0.0f)
                lineTo(288.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 224.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                lineToRelative(0.0f, 12.0f)
                curveToRelative(0.0f, 11.0f, 9.0f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -9.0f, 20.0f, -20.0f)
                lineToRelative(0.0f, -127.7f)
                curveToRelative(-32.5f, -10.2f, -56.0f, -40.5f, -56.0f, -76.3f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 35.8f, -23.5f, 66.1f, -56.0f, 76.3f)
                lineTo(520.0f, 380.0f)
                curveToRelative(0.0f, 37.6f, -30.4f, 68.0f, -68.0f, 68.0f)
                reflectiveCurveToRelative(-68.0f, -30.4f, -68.0f, -68.0f)
                lineToRelative(0.0f, -12.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(0.0f, 129.4f)
                curveToRelative(9.3f, 3.3f, 16.0f, 12.2f, 16.0f, 22.6f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(72.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -10.5f, 6.7f, -19.3f, 16.0f, -22.6f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(146.7f, 189.7f)
                lineToRelative(39.0f, 0.0f)
                lineToRelative(-20.9f, 66.9f)
                curveToRelative(-2.4f, 7.6f, 3.3f, 15.4f, 11.3f, 15.4f)
                curveToRelative(2.9f, 0.0f, 5.6f, -1.0f, 7.8f, -2.9f)
                lineToRelative(94.6f, -82.0f)
                curveToRelative(3.1f, -2.7f, 4.9f, -6.6f, 4.9f, -10.7f)
                curveToRelative(0.0f, -7.8f, -6.3f, -14.1f, -14.1f, -14.1f)
                lineToRelative(-39.0f, 0.0f)
                lineToRelative(20.9f, -66.9f)
                curveToRelative(2.4f, -7.6f, -3.3f, -15.4f, -11.3f, -15.4f)
                curveToRelative(-2.9f, 0.0f, -5.6f, 1.0f, -7.8f, 2.9f)
                lineToRelative(-94.6f, 82.0f)
                curveToRelative(-3.1f, 2.7f, -4.9f, 6.6f, -4.9f, 10.7f)
                curveToRelative(0.0f, 7.8f, 6.3f, 14.1f, 14.1f, 14.1f)
                close()
            }
        }
        .build()
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
