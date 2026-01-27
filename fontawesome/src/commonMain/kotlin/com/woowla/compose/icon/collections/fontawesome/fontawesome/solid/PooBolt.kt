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

public val SolidGroup.PooBolt: ImageVector
    get() {
        if (_pooBolt != null) {
            return _pooBolt!!
        }
        _pooBolt = Builder(name = "PooBolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.9f, -31.8f)
                curveToRelative(-5.5f, -0.7f, -11.0f, 1.4f, -14.5f, 5.7f)
                reflectiveCurveToRelative(-4.6f, 10.1f, -2.8f, 15.3f)
                curveToRelative(2.8f, 8.2f, 4.3f, 16.9f, 4.3f, 26.1f)
                curveToRelative(0.0f, 21.7f, -8.5f, 37.2f, -21.9f, 47.6f)
                curveToRelative(-13.9f, 10.8f, -34.1f, 17.0f, -58.1f, 17.0f)
                lineToRelative(-24.0f, 0.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, 39.4f, -88.0f, 88.0f)
                curveToRelative(0.0f, 14.8f, 3.7f, 28.8f, 10.2f, 41.1f)
                curveToRelative(-42.0f, 6.6f, -74.2f, 43.0f, -74.2f, 86.9f)
                curveToRelative(0.0f, 46.6f, 36.2f, 84.7f, 81.9f, 87.8f)
                curveToRelative(3.1f, -12.4f, 9.9f, -23.8f, 19.6f, -32.5f)
                lineTo(242.7f, 225.0f)
                curveToRelative(12.2f, -10.9f, 28.0f, -17.0f, 44.4f, -17.0f)
                curveToRelative(44.6f, 0.0f, 76.5f, 43.0f, 63.7f, 85.7f)
                lineToRelative(-12.7f, 42.4f)
                curveToRelative(28.8f, 1.2f, 52.7f, 21.1f, 59.8f, 47.9f)
                lineToRelative(26.2f, 0.0f)
                curveToRelative(48.6f, 0.0f, 88.0f, -39.4f, 88.0f, -88.0f)
                curveToRelative(0.0f, -43.9f, -32.1f, -80.3f, -74.2f, -86.9f)
                curveToRelative(6.5f, -12.3f, 10.2f, -26.2f, 10.2f, -41.1f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                lineToRelative(-9.4f, 0.0f)
                curveToRelative(0.9f, -5.4f, 1.4f, -10.9f, 1.4f, -16.6f)
                curveToRelative(0.0f, -48.7f, -36.1f, -88.9f, -83.1f, -95.2f)
                close()
                moveTo(144.6f, 416.0f)
                lineToRelative(61.8f, 0.0f)
                lineToRelative(-31.2f, 104.1f)
                curveToRelative(-3.6f, 11.9f, 5.3f, 23.9f, 17.8f, 23.9f)
                curveToRelative(4.6f, 0.0f, 9.0f, -1.7f, 12.4f, -4.7f)
                lineTo(346.5f, 412.9f)
                curveToRelative(3.5f, -3.1f, 5.5f, -7.6f, 5.5f, -12.4f)
                curveToRelative(0.0f, -9.2f, -7.4f, -16.6f, -16.6f, -16.6f)
                lineToRelative(-61.8f, 0.0f)
                lineToRelative(31.2f, -104.1f)
                curveToRelative(3.6f, -11.9f, -5.3f, -23.9f, -17.8f, -23.9f)
                curveToRelative(-4.6f, 0.0f, -9.0f, 1.7f, -12.4f, 4.7f)
                lineTo(133.5f, 387.1f)
                curveToRelative(-3.5f, 3.1f, -5.5f, 7.6f, -5.5f, 12.4f)
                curveToRelative(0.0f, 9.2f, 7.4f, 16.6f, 16.6f, 16.6f)
                close()
            }
        }
        .build()
        return _pooBolt!!
    }

private var _pooBolt: ImageVector? = null
