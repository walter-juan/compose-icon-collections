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

public val BrandsGroup.Steam: ImageVector
    get() {
        if (_steam != null) {
            return _steam!!
        }
        _steam = Builder(name = "Steam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, -111.2f, 248.0f, -248.4f, 248.0f)
                curveToRelative(-113.8f, 0.0f, -209.6f, -76.3f, -239.0f, -180.4f)
                lineToRelative(95.2f, 39.3f)
                curveToRelative(6.4f, 32.1f, 34.9f, 56.4f, 68.9f, 56.4f)
                curveToRelative(39.2f, 0.0f, 71.9f, -32.4f, 70.2f, -73.5f)
                lineToRelative(84.5f, -60.2f)
                curveToRelative(52.1f, 1.3f, 95.8f, -40.9f, 95.8f, -93.5f)
                curveToRelative(0.0f, -51.6f, -42.0f, -93.5f, -93.7f, -93.5f)
                reflectiveCurveToRelative(-93.7f, 42.0f, -93.7f, 93.5f)
                lineToRelative(0.0f, 1.2f)
                lineToRelative(-59.2f, 85.7f)
                curveToRelative(-15.5f, -0.9f, -30.7f, 3.4f, -43.5f, 12.1f)
                lineTo(8.0f, 236.1f)
                curveTo(18.2f, 108.4f, 125.1f, 8.0f, 255.6f, 8.0f)
                curveTo(392.8f, 8.0f, 504.0f, 119.0f, 504.0f, 256.0f)
                close()
                moveTo(163.7f, 384.3f)
                lineToRelative(-30.5f, -12.6f)
                curveToRelative(5.6f, 11.6f, 15.3f, 20.8f, 27.2f, 25.8f)
                curveToRelative(26.9f, 11.2f, 57.8f, -1.6f, 69.0f, -28.4f)
                curveToRelative(5.4f, -13.0f, 5.5f, -27.3f, 0.1f, -40.3f)
                reflectiveCurveTo(214.0f, 305.6f, 201.0f, 300.2f)
                curveToRelative(-12.9f, -5.4f, -26.7f, -5.2f, -38.9f, -0.6f)
                lineToRelative(31.5f, 13.0f)
                curveToRelative(19.8f, 8.2f, 29.2f, 30.9f, 20.9f, 50.7f)
                curveToRelative(-8.3f, 19.9f, -31.0f, 29.2f, -50.8f, 21.0f)
                close()
                moveTo(337.5f, 129.8f)
                arcToRelative(62.3f, 62.3f, 0.0f, true, true, 0.0f, 124.6f)
                arcToRelative(62.3f, 62.3f, 0.0f, true, true, 0.0f, -124.6f)
                close()
                moveTo(337.6f, 238.8f)
                arcToRelative(46.8f, 46.8f, 0.0f, true, false, 0.0f, -93.6f)
                arcToRelative(46.8f, 46.8f, 0.0f, true, false, 0.0f, 93.6f)
                close()
            }
        }
        .build()
        return _steam!!
    }

private var _steam: ImageVector? = null
