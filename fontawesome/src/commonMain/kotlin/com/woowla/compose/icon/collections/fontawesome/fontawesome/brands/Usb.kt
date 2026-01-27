package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(name = "Usb", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.5f, 256.0f)
                curveToRelative(0.0f, 3.1f, -1.7f, 6.1f, -4.5f, 7.5f)
                lineTo(539.9f, 317.0f)
                curveToRelative(-1.4f, 0.8f, -2.8f, 1.4f, -4.5f, 1.4f)
                curveToRelative(-1.4f, 0.0f, -3.1f, -0.3f, -4.5f, -1.1f)
                curveToRelative(-2.8f, -1.7f, -4.5f, -4.5f, -4.5f, -7.8f)
                lineToRelative(0.0f, -35.6f)
                lineToRelative(-230.7f, 0.0f)
                curveToRelative(25.3f, 39.6f, 40.5f, 106.9f, 69.6f, 106.9f)
                lineToRelative(26.7f, 0.0f)
                lineToRelative(0.0f, -26.8f)
                curveToRelative(0.0f, -5.0f, 3.9f, -8.9f, 8.9f, -8.9f)
                lineToRelative(89.1f, 0.0f)
                curveToRelative(5.0f, 0.0f, 8.9f, 3.9f, 8.9f, 8.9f)
                lineToRelative(0.0f, 89.1f)
                curveToRelative(0.0f, 5.0f, -3.9f, 8.9f, -8.9f, 8.9f)
                lineToRelative(-89.1f, 0.0f)
                curveToRelative(-5.0f, 0.0f, -8.9f, -3.9f, -8.9f, -8.9f)
                lineToRelative(0.0f, -26.7f)
                lineToRelative(-26.7f, 0.0f)
                curveToRelative(-75.4f, 0.0f, -81.1f, -142.5f, -124.7f, -142.5f)
                lineToRelative(-100.3f, 0.0f)
                curveToRelative(-8.1f, 30.6f, -35.9f, 53.5f, -69.0f, 53.5f)
                curveToRelative(-39.3f, -0.1f, -71.3f, -32.1f, -71.3f, -71.4f)
                reflectiveCurveToRelative(32.0f, -71.3f, 71.3f, -71.3f)
                curveToRelative(33.1f, 0.0f, 61.0f, 22.8f, 69.0f, 53.5f)
                curveToRelative(39.1f, 0.0f, 43.9f, 9.5f, 74.6f, -60.4f)
                curveToRelative(40.1f, -89.1f, 58.1f, -82.1f, 108.9f, -82.1f)
                curveToRelative(7.5f, -20.9f, 27.0f, -35.6f, 50.4f, -35.6f)
                curveToRelative(29.5f, 0.0f, 53.5f, 23.9f, 53.5f, 53.5f)
                reflectiveCurveToRelative(-23.9f, 53.5f, -53.5f, 53.5f)
                curveToRelative(-23.4f, 0.0f, -42.9f, -14.8f, -50.4f, -35.6f)
                lineToRelative(-29.8f, 0.0f)
                curveToRelative(-29.1f, 0.0f, -44.3f, 67.4f, -69.6f, 106.9f)
                lineToRelative(302.1f, 0.0f)
                lineToRelative(0.0f, -35.6f)
                curveToRelative(0.0f, -3.3f, 1.7f, -6.1f, 4.5f, -7.8f)
                reflectiveCurveToRelative(6.4f, -1.4f, 8.9f, 0.3f)
                lineTo(629.0f, 248.8f)
                curveToRelative(2.8f, 1.1f, 4.5f, 4.1f, 4.5f, 7.2f)
                close()
            }
        }
        .build()
        return _usb!!
    }

private var _usb: ImageVector? = null
