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

public val BrandsGroup.Scaleway: ImageVector
    get() {
        if (_scaleway != null) {
            return _scaleway!!
        }
        _scaleway = Builder(name = "Scaleway", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.4f, 117.3f)
                lineToRelative(-84.3f, 0.0f)
                curveToRelative(-18.5f, 2.1f, -32.7f, 17.5f, -33.4f, 36.0f)
                lineToRelative(0.0f, 121.9f)
                curveToRelative(0.0f, 8.2f, 3.2f, 15.3f, 8.5f, 20.7f)
                reflectiveCurveToRelative(12.5f, 8.6f, 20.6f, 8.6f)
                curveToRelative(16.0f, 0.0f, 29.2f, -13.2f, 29.2f, -29.2f)
                lineToRelative(0.0f, -77.4f)
                curveToRelative(0.0f, -12.1f, 10.0f, -22.1f, 22.1f, -22.1f)
                lineToRelative(38.1f, 0.0f)
                curveToRelative(8.2f, 0.0f, 15.3f, -3.2f, 20.6f, -8.6f)
                reflectiveCurveToRelative(8.5f, -12.8f, 8.5f, -21.0f)
                curveToRelative(0.0f, -16.0f, -13.9f, -28.9f, -29.9f, -28.9f)
                close()
                moveTo(205.3f, 395.4f)
                lineToRelative(84.3f, 0.0f)
                curveToRelative(18.5f, -2.1f, 32.7f, -17.5f, 33.4f, -36.0f)
                lineToRelative(0.0f, -121.9f)
                curveToRelative(0.0f, -8.2f, -3.2f, -15.3f, -8.5f, -20.7f)
                reflectiveCurveToRelative(-12.5f, -8.6f, -20.6f, -8.6f)
                curveToRelative(-16.0f, 0.0f, -29.2f, 13.2f, -29.2f, 29.2f)
                lineToRelative(0.0f, 77.4f)
                curveToRelative(0.0f, 12.1f, -10.0f, 22.1f, -22.1f, 22.1f)
                lineToRelative(-38.1f, 0.0f)
                curveToRelative(-8.2f, 0.0f, -15.3f, 3.2f, -20.6f, 8.6f)
                reflectiveCurveToRelative(-8.5f, 12.8f, -8.5f, 21.0f)
                curveToRelative(0.4f, 16.0f, 13.9f, 28.9f, 29.9f, 28.9f)
                close()
                moveTo(104.3f, 0.0f)
                lineTo(257.6f, 0.0f)
                curveToRelative(101.0f, 0.0f, 182.5f, 81.6f, 182.1f, 182.9f)
                lineToRelative(0.0f, 242.8f)
                curveToRelative(-4.6f, 46.0f, -42.0f, 82.4f, -88.2f, 86.3f)
                lineTo(190.0f, 512.0f)
                curveTo(89.3f, 512.0f, 7.5f, 430.0f, 7.5f, 329.1f)
                lineTo(7.5f, 97.0f)
                curveToRelative(0.0f, -53.5f, 43.4f, -97.0f, 96.8f, -97.0f)
                close()
                moveTo(381.7f, 182.9f)
                curveToRelative(0.0f, -68.5f, -55.9f, -124.4f, -124.2f, -124.4f)
                lineToRelative(-153.0f, 0.0f)
                curveTo(83.3f, 58.5f, 66.2f, 75.6f, 66.2f, 97.0f)
                lineToRelative(0.0f, 232.1f)
                curveToRelative(0.0f, 68.8f, 55.5f, 124.4f, 124.2f, 124.4f)
                lineToRelative(158.7f, 0.0f)
                curveToRelative(16.7f, -2.1f, 29.9f, -15.0f, 32.7f, -31.4f)
                lineToRelative(0.0f, -239.2f)
                close()
            }
        }
        .build()
        return _scaleway!!
    }

private var _scaleway: ImageVector? = null
