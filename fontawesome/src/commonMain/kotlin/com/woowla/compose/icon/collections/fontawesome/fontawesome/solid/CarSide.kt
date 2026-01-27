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

public val SolidGroup.CarSide: ImageVector
    get() {
        if (_carSide != null) {
            return _carSide!!
        }
        _carSide = Builder(name = "CarSide", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.0f, 106.7f)
                lineToRelative(-29.8f, 85.3f)
                lineToRelative(122.9f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-77.9f, 0.0f)
                curveToRelative(-6.8f, 0.0f, -12.9f, 4.3f, -15.1f, 10.7f)
                close()
                moveTo(48.6f, 193.9f)
                lineTo(86.5f, 85.6f)
                curveTo(97.8f, 53.5f, 128.1f, 32.0f, 162.1f, 32.0f)
                lineTo(360.0f, 32.0f)
                curveToRelative(25.2f, 0.0f, 48.9f, 11.9f, 64.0f, 32.0f)
                lineToRelative(96.2f, 128.3f)
                curveTo(587.1f, 196.5f, 640.0f, 252.1f, 640.0f, 320.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-16.4f, 0.0f)
                curveToRelative(-4.0f, 44.9f, -41.7f, 80.0f, -87.6f, 80.0f)
                reflectiveCurveToRelative(-83.6f, -35.1f, -87.6f, -80.0f)
                lineToRelative(-144.7f, 0.0f)
                curveToRelative(-4.0f, 44.9f, -41.7f, 80.0f, -87.6f, 80.0f)
                reflectiveCurveToRelative(-83.6f, -35.1f, -87.6f, -80.0f)
                lineToRelative(-0.4f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -30.1f, 20.7f, -55.3f, 48.6f, -62.1f)
                close()
                moveTo(440.0f, 192.0f)
                lineToRelative(-67.2f, -89.6f)
                curveToRelative(-3.0f, -4.0f, -7.8f, -6.4f, -12.8f, -6.4f)
                lineToRelative(-72.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(152.0f, 0.0f)
                close()
                moveTo(152.0f, 432.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
                moveTo(512.0f, 392.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 80.0f, 0.0f)
                close()
            }
        }
        .build()
        return _carSide!!
    }

private var _carSide: ImageVector? = null
