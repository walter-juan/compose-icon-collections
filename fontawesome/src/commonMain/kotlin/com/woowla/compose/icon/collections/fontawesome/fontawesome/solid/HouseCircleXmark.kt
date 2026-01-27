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

public val SolidGroup.HouseCircleXmark: ImageVector
    get() {
        if (_houseCircleXmark != null) {
            return _houseCircleXmark!!
        }
        _houseCircleXmark = Builder(name = "HouseCircleXmark", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 544.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, -288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, 288.0f)
                close()
                moveTo(268.6f, 6.5f)
                curveToRelative(12.2f, -9.3f, 29.7f, -8.7f, 41.2f, 2.0f)
                lineToRelative(217.6f, 202.0f)
                curveToRelative(-10.2f, -1.7f, -20.7f, -2.6f, -31.3f, -2.6f)
                curveToRelative(-78.6f, 0.0f, -146.2f, 47.2f, -175.9f, 114.8f)
                curveToRelative(-5.0f, -1.8f, -10.5f, -2.8f, -16.1f, -2.8f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(90.9f, 0.0f)
                curveToRelative(6.1f, 17.3f, 14.6f, 33.4f, 25.2f, 48.0f)
                lineTo(144.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -176.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-13.2f, 0.0f, -25.0f, -8.1f, -29.8f, -20.3f)
                reflectiveCurveToRelative(-1.6f, -26.2f, 8.0f, -35.1f)
                lineToRelative(224.0f, -208.0f)
                lineToRelative(2.4f, -2.0f)
                close()
                moveTo(555.3f, 340.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                lineToRelative(-36.7f, 36.7f)
                lineToRelative(-36.7f, -36.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(36.7f, 36.7f)
                lineToRelative(-36.7f, 36.7f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(16.4f, 6.2f, 22.6f, 0.0f)
                lineToRelative(36.7f, -36.7f)
                lineToRelative(36.7f, 36.7f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(-36.7f, -36.7f)
                lineToRelative(36.7f, -36.7f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                close()
            }
        }
        .build()
        return _houseCircleXmark!!
    }

private var _houseCircleXmark: ImageVector? = null
