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

public val BrandsGroup.Vk: ImageVector
    get() {
        if (_vk != null) {
            return _vk!!
        }
        _vk = Builder(name = "Vk", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.5f, 63.5f)
                curveTo(0.0f, 95.0f, 0.0f, 145.7f, 0.0f, 247.0f)
                lineTo(0.0f, 265.0f)
                curveTo(0.0f, 366.3f, 0.0f, 417.0f, 31.5f, 448.5f)
                reflectiveCurveTo(113.7f, 480.0f, 215.0f, 480.0f)
                lineToRelative(17.9f, 0.0f)
                curveToRelative(101.4f, 0.0f, 152.1f, 0.0f, 183.5f, -31.5f)
                reflectiveCurveTo(448.0f, 366.3f, 448.0f, 265.0f)
                lineToRelative(0.0f, -17.9f)
                curveToRelative(0.0f, -101.4f, 0.0f, -152.1f, -31.5f, -183.5f)
                reflectiveCurveTo(334.3f, 32.0f, 233.0f, 32.0f)
                lineTo(215.0f, 32.0f)
                curveTo(113.7f, 32.0f, 63.0f, 32.0f, 31.5f, 63.5f)
                close()
                moveTo(75.6f, 168.3f)
                lineToRelative(51.1f, 0.0f)
                curveToRelative(1.7f, 85.5f, 39.4f, 121.7f, 69.3f, 129.2f)
                lineToRelative(0.0f, -129.2f)
                lineToRelative(48.2f, 0.0f)
                lineToRelative(0.0f, 73.7f)
                curveToRelative(29.5f, -3.2f, 60.5f, -36.8f, 70.9f, -73.7f)
                lineToRelative(48.2f, 0.0f)
                curveToRelative(-3.9f, 19.2f, -11.8f, 37.3f, -23.1f, 53.3f)
                reflectiveCurveToRelative(-25.7f, 29.5f, -42.5f, 39.6f)
                curveToRelative(18.7f, 9.3f, 35.2f, 22.4f, 48.4f, 38.5f)
                reflectiveCurveToRelative(22.9f, 34.9f, 28.3f, 55.0f)
                lineToRelative(-53.0f, 0.0f)
                curveToRelative(-4.9f, -17.5f, -14.8f, -33.1f, -28.6f, -45.0f)
                reflectiveCurveToRelative(-30.7f, -19.4f, -48.7f, -21.6f)
                lineToRelative(0.0f, 66.6f)
                lineToRelative(-5.8f, 0.0f)
                curveToRelative(-102.1f, 0.0f, -160.3f, -70.0f, -162.8f, -186.5f)
                close()
            }
        }
        .build()
        return _vk!!
    }

private var _vk: ImageVector? = null
