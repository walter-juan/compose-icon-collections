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

public val SolidGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.3f, 128.0f)
                lineTo(139.7f, -12.9f)
                curveToRelative(-6.5f, -10.8f, -20.1f, -14.7f, -31.3f, -9.1f)
                lineTo(21.8f, 21.3f)
                curveTo(9.9f, 27.2f, 5.1f, 41.6f, 11.0f, 53.5f)
                lineTo(80.6f, 192.6f)
                curveToRelative(-30.1f, 33.9f, -48.3f, 78.5f, -48.3f, 127.4f)
                curveToRelative(0.0f, 106.0f, 86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.0f, 192.0f, -192.0f)
                curveToRelative(0.0f, -48.9f, -18.3f, -93.5f, -48.3f, -127.4f)
                lineTo(437.6f, 53.5f)
                curveToRelative(5.9f, -11.9f, 1.1f, -26.3f, -10.7f, -32.2f)
                lineTo(340.2f, -22.1f)
                curveToRelative(-11.2f, -5.6f, -24.9f, -1.6f, -31.3f, 9.1f)
                lineTo(224.3f, 128.0f)
                close()
                moveTo(255.1f, 270.5f)
                curveToRelative(1.4f, 2.8f, 4.0f, 4.7f, 7.0f, 5.1f)
                lineToRelative(50.1f, 7.3f)
                curveToRelative(7.7f, 1.1f, 10.7f, 10.5f, 5.2f, 16.0f)
                lineToRelative(-36.3f, 35.4f)
                curveToRelative(-2.2f, 2.2f, -3.2f, 5.2f, -2.7f, 8.3f)
                lineToRelative(8.6f, 49.9f)
                curveToRelative(1.3f, 7.6f, -6.7f, 13.5f, -13.6f, 9.9f)
                lineToRelative(-44.8f, -23.6f)
                curveToRelative(-2.7f, -1.4f, -6.0f, -1.4f, -8.7f, 0.0f)
                lineToRelative(-44.8f, 23.6f)
                curveToRelative(-6.9f, 3.6f, -14.9f, -2.2f, -13.6f, -9.9f)
                lineToRelative(8.6f, -49.9f)
                curveToRelative(0.5f, -3.0f, -0.5f, -6.1f, -2.7f, -8.3f)
                lineToRelative(-36.3f, -35.4f)
                curveToRelative(-5.6f, -5.4f, -2.5f, -14.8f, 5.2f, -16.0f)
                lineToRelative(50.1f, -7.3f)
                curveToRelative(3.0f, -0.4f, 5.7f, -2.4f, 7.0f, -5.1f)
                lineToRelative(22.4f, -45.4f)
                curveToRelative(3.4f, -7.0f, 13.3f, -7.0f, 16.8f, 0.0f)
                lineToRelative(22.4f, 45.4f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
