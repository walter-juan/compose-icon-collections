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

public val SolidGroup.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.9f, 18.3f)
                lineTo(271.0f, 3.8f)
                curveToRelative(21.6f, -13.0f, 46.3f, -19.8f, 71.5f, -19.8f)
                curveToRelative(36.8f, 0.0f, 72.2f, 14.6f, 98.2f, 40.7f)
                lineToRelative(63.9f, 63.9f)
                curveToRelative(15.0f, 15.0f, 23.4f, 35.4f, 23.4f, 56.6f)
                lineToRelative(0.0f, 30.9f)
                lineToRelative(19.7f, 19.7f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(15.6f, -15.6f, 40.9f, -15.6f, 56.6f, 0.0f)
                reflectiveCurveToRelative(15.6f, 40.9f, 0.0f, 56.6f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-15.6f, 15.6f, -40.9f, 15.6f, -56.6f, 0.0f)
                reflectiveCurveToRelative(-15.6f, -40.9f, 0.0f, -56.6f)
                lineTo(464.0f, 240.0f)
                lineTo(433.1f, 240.0f)
                curveToRelative(-21.2f, 0.0f, -41.6f, -8.4f, -56.6f, -23.4f)
                lineToRelative(-49.1f, -49.1f)
                curveToRelative(-15.0f, -15.0f, -23.4f, -35.4f, -23.4f, -56.6f)
                lineToRelative(0.0f, -12.7f)
                curveToRelative(0.0f, -11.2f, -5.9f, -21.7f, -15.5f, -27.4f)
                lineToRelative(-41.6f, -25.0f)
                curveToRelative(-10.4f, -6.2f, -10.4f, -21.2f, 0.0f, -27.4f)
                close()
                moveTo(50.7f, 402.7f)
                lineToRelative(222.1f, -222.1f)
                lineToRelative(90.5f, 90.5f)
                lineToRelative(-222.1f, 222.1f)
                curveToRelative(-25.0f, 25.0f, -65.5f, 25.0f, -90.5f, 0.0f)
                reflectiveCurveToRelative(-25.0f, -65.5f, 0.0f, -90.5f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
