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

public val BrandsGroup.Fedora: ImageVector
    get() {
        if (_fedora != null) {
            return _fedora!!
        }
        _fedora = Builder(name = "Fedora", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 255.8f)
                curveTo(0.1f, 132.2f, 100.3f, 32.0f, 224.0f, 32.0f)
                reflectiveCurveTo(448.0f, 132.3f, 448.0f, 256.0f)
                reflectiveCurveTo(347.8f, 479.9f, 224.1f, 480.0f)
                lineTo(50.9f, 480.0f)
                curveTo(22.8f, 480.0f, 0.1f, 457.3f, 0.0f, 429.2f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, -173.4f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(342.6f, 192.7f)
                curveToRelative(0.0f, -39.7f, -35.6f, -68.5f, -73.2f, -68.5f)
                curveToRelative(-34.9f, 0.0f, -65.8f, 26.3f, -70.1f, 59.9f)
                curveToRelative(-0.2f, 3.8f, -0.4f, 5.0f, -0.4f, 8.5f)
                curveToRelative(-0.1f, 21.1f, 0.0f, 42.8f, -0.8f, 64.4f)
                curveToRelative(0.9f, 26.1f, 1.0f, 52.1f, 0.0f, 76.6f)
                curveToRelative(0.0f, 27.1f, -19.4f, 45.5f, -44.7f, 45.5f)
                reflectiveCurveToRelative(-45.8f, -20.2f, -45.8f, -45.5f)
                curveToRelative(0.5f, -27.7f, 22.6f, -45.3f, 48.5f, -46.1f)
                lineToRelative(0.2f, 0.0f)
                lineToRelative(26.3f, -0.2f)
                lineToRelative(0.0f, -37.3f)
                lineToRelative(-26.3f, 0.2f)
                curveToRelative(-47.1f, -0.4f, -84.6f, 36.5f, -85.9f, 83.4f)
                curveToRelative(0.0f, 45.6f, 37.5f, 82.9f, 83.0f, 82.9f)
                curveToRelative(43.0f, 0.0f, 78.7f, -33.6f, 82.6f, -75.6f)
                lineToRelative(0.2f, -53.5f)
                lineToRelative(32.6f, -0.3f)
                curveToRelative(25.3f, 0.2f, 25.0f, -37.8f, -0.2f, -37.3f)
                lineToRelative(-32.4f, 0.3f)
                curveToRelative(0.0f, -6.4f, 0.1f, -12.8f, 0.1f, -19.2f)
                curveToRelative(0.1f, -12.7f, 0.1f, -25.4f, -0.1f, -38.2f)
                curveToRelative(0.1f, -16.5f, 15.8f, -31.2f, 33.2f, -31.2f)
                curveToRelative(17.5f, 0.0f, 35.9f, 8.7f, 35.9f, 31.2f)
                curveToRelative(0.0f, 3.2f, -0.1f, 5.1f, -0.3f, 6.3f)
                curveToRelative(-1.9f, 10.5f, 5.2f, 20.4f, 15.7f, 21.9f)
                curveToRelative(10.6f, 1.5f, 20.2f, -6.1f, 21.2f, -16.6f)
                curveToRelative(0.6f, -4.2f, 0.7f, -7.9f, 0.7f, -11.6f)
                close()
            }
        }
        .build()
        return _fedora!!
    }

private var _fedora: ImageVector? = null
