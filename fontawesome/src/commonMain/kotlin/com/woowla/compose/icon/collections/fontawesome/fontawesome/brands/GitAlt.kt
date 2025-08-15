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

public val BrandsGroup.GitAlt: ImageVector
    get() {
        if (_gitAlt != null) {
            return _gitAlt!!
        }
        _gitAlt = Builder(name = "GitAlt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.6f, 236.1f)
                lineTo(244.0f, 40.5f)
                curveTo(238.6f, 35.0f, 231.2f, 32.0f, 223.6f, 32.0f)
                reflectiveCurveToRelative(-15.0f, 3.0f, -20.4f, 8.4f)
                lineToRelative(-40.7f, 40.6f)
                lineToRelative(51.5f, 51.5f)
                curveToRelative(27.1f, -9.1f, 52.7f, 16.8f, 43.4f, 43.7f)
                lineToRelative(49.7f, 49.7f)
                curveToRelative(34.2f, -11.8f, 61.2f, 31.0f, 35.5f, 56.7f)
                curveToRelative(-26.5f, 26.5f, -70.2f, -2.9f, -56.0f, -37.3f)
                lineToRelative(-46.3f, -46.3f)
                lineToRelative(0.0f, 121.9f)
                curveToRelative(25.3f, 12.5f, 22.3f, 41.8f, 9.1f, 55.0f)
                curveToRelative(-6.4f, 6.4f, -15.2f, 10.1f, -24.3f, 10.1f)
                reflectiveCurveToRelative(-17.8f, -3.6f, -24.3f, -10.1f)
                curveToRelative(-17.6f, -17.6f, -11.1f, -46.9f, 11.2f, -56.0f)
                lineToRelative(0.0f, -123.0f)
                curveToRelative(-20.8f, -8.5f, -24.6f, -30.7f, -18.6f, -45.0f)
                lineTo(142.6f, 101.0f)
                lineTo(8.5f, 235.1f)
                curveTo(3.0f, 240.6f, 0.0f, 247.9f, 0.0f, 255.5f)
                reflectiveCurveToRelative(3.0f, 15.0f, 8.5f, 20.4f)
                lineTo(204.1f, 471.6f)
                curveToRelative(5.4f, 5.4f, 12.7f, 8.4f, 20.4f, 8.4f)
                reflectiveCurveToRelative(15.0f, -3.0f, 20.4f, -8.4f)
                lineTo(439.6f, 276.9f)
                curveToRelative(5.4f, -5.4f, 8.4f, -12.8f, 8.4f, -20.4f)
                reflectiveCurveToRelative(-3.0f, -15.0f, -8.4f, -20.4f)
                close()
            }
        }
        .build()
        return _gitAlt!!
    }

private var _gitAlt: ImageVector? = null
