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

public val SolidGroup.CarOn: ImageVector
    get() {
        if (_carOn != null) {
            return _carOn!!
        }
        _carOn = Builder(name = "CarOn", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, -8.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveTo(200.0f, -21.3f, 200.0f, -8.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(145.3f, 208.0f)
                lineToRelative(157.5f, 0.0f)
                curveToRelative(6.7f, 0.0f, 12.6f, 4.1f, 15.0f, 10.4f)
                lineToRelative(26.1f, 69.6f)
                lineToRelative(-239.6f, 0.0f)
                lineToRelative(26.1f, -69.6f)
                curveToRelative(2.3f, -6.2f, 8.3f, -10.4f, 15.0f, -10.4f)
                close()
                moveTo(34.0f, 292.8f)
                lineToRelative(-1.3f, 3.4f)
                curveTo(13.2f, 307.1f, 0.0f, 328.0f, 0.0f, 352.0f)
                lineTo(0.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(288.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -24.0f, -13.2f, -44.9f, -32.8f, -55.9f)
                lineToRelative(-1.3f, -3.4f)
                lineToRelative(-36.3f, -96.9f)
                curveToRelative(-11.7f, -31.2f, -41.6f, -51.9f, -74.9f, -51.9f)
                lineToRelative(-157.5f, 0.0f)
                curveToRelative(-33.3f, 0.0f, -63.2f, 20.7f, -74.9f, 51.9f)
                lineTo(34.0f, 292.8f)
                close()
                moveTo(96.0f, 336.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(320.0f, 368.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(7.0f, 7.0f)
                curveTo(-2.3f, 16.4f, -2.3f, 31.6f, 7.0f, 41.0f)
                lineTo(55.0f, 89.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveTo(98.3f, 64.4f, 89.0f, 55.0f)
                lineTo(41.0f, 7.0f)
                curveTo(31.6f, -2.3f, 16.4f, -2.3f, 7.0f, 7.0f)
                close()
                moveTo(407.0f, 7.0f)
                lineTo(359.0f, 55.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveTo(416.4f, -2.3f, 407.0f, 7.0f)
                close()
            }
        }
        .build()
        return _carOn!!
    }

private var _carOn: ImageVector? = null
