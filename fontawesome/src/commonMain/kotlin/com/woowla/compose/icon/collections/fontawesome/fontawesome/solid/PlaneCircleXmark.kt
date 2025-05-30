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

public val SolidGroup.PlaneCircleXmark: ImageVector
    get() {
        if (_planeCircleXmark != null) {
            return _planeCircleXmark!!
        }
        _planeCircleXmark = Builder(name = "PlaneCircleXmark", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(-35.0f, 0.0f, -64.0f, 59.5f, -64.0f, 93.7f)
                lineToRelative(0.0f, 84.6f)
                lineTo(8.1f, 283.4f)
                curveToRelative(-5.0f, 2.8f, -8.1f, 8.2f, -8.1f, 13.9f)
                lineToRelative(0.0f, 65.5f)
                curveToRelative(0.0f, 10.6f, 10.2f, 18.3f, 20.4f, 15.4f)
                lineToRelative(171.6f, -49.0f)
                lineToRelative(0.0f, 70.9f)
                lineToRelative(-57.6f, 43.2f)
                curveToRelative(-4.0f, 3.0f, -6.4f, 7.8f, -6.4f, 12.8f)
                lineToRelative(0.0f, 42.0f)
                curveToRelative(0.0f, 7.8f, 6.3f, 14.0f, 14.0f, 14.0f)
                curveToRelative(1.3f, 0.0f, 2.6f, -0.2f, 3.9f, -0.5f)
                lineTo(256.0f, 480.0f)
                lineToRelative(110.1f, 31.5f)
                curveToRelative(1.3f, 0.4f, 2.6f, 0.5f, 3.9f, 0.5f)
                curveToRelative(6.0f, 0.0f, 11.1f, -3.7f, 13.1f, -9.0f)
                curveTo(344.5f, 470.7f, 320.0f, 422.2f, 320.0f, 368.0f)
                curveToRelative(0.0f, -60.6f, 30.6f, -114.0f, 77.1f, -145.6f)
                lineTo(320.0f, 178.3f)
                lineToRelative(0.0f, -84.6f)
                curveTo(320.0f, 59.5f, 292.0f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(496.0f, 512.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, -288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
                close()
                moveTo(555.3f, 331.3f)
                lineTo(518.6f, 368.0f)
                lineToRelative(36.7f, 36.7f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(-16.4f, 6.2f, -22.6f, 0.0f)
                lineTo(496.0f, 390.6f)
                lineToRelative(-36.7f, 36.7f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, -16.4f, 0.0f, -22.6f)
                lineTo(473.4f, 368.0f)
                lineToRelative(-36.7f, -36.7f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineTo(496.0f, 345.4f)
                lineToRelative(36.7f, -36.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, 16.4f, 0.0f, 22.6f)
                close()
            }
        }
        .build()
        return _planeCircleXmark!!
    }

private var _planeCircleXmark: ImageVector? = null
