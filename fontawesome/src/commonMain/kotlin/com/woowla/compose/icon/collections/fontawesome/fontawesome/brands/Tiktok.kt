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

public val BrandsGroup.Tiktok: ImageVector
    get() {
        if (_tiktok != null) {
            return _tiktok!!
        }
        _tiktok = Builder(name = "Tiktok", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.5f, 209.9f)
                curveToRelative(-44.0f, 0.1f, -87.0f, -13.6f, -122.8f, -39.2f)
                lineToRelative(0.0f, 178.7f)
                curveToRelative(0.0f, 33.1f, -10.1f, 65.4f, -29.0f, 92.6f)
                reflectiveCurveToRelative(-45.6f, 48.0f, -76.6f, 59.6f)
                reflectiveCurveToRelative(-64.8f, 13.5f, -96.9f, 5.3f)
                reflectiveCurveToRelative(-60.9f, -25.9f, -82.7f, -50.8f)
                reflectiveCurveToRelative(-35.3f, -56.0f, -39.0f, -88.9f)
                reflectiveCurveToRelative(2.9f, -66.1f, 18.6f, -95.2f)
                reflectiveCurveToRelative(40.0f, -52.7f, 69.6f, -67.7f)
                reflectiveCurveToRelative(62.9f, -20.5f, 95.7f, -16.0f)
                lineToRelative(0.0f, 89.9f)
                curveToRelative(-15.0f, -4.7f, -31.1f, -4.6f, -46.0f, 0.4f)
                reflectiveCurveToRelative(-27.9f, 14.6f, -37.0f, 27.3f)
                reflectiveCurveToRelative(-14.0f, 28.1f, -13.9f, 43.9f)
                reflectiveCurveToRelative(5.2f, 31.0f, 14.5f, 43.7f)
                reflectiveCurveToRelative(22.4f, 22.1f, 37.4f, 26.9f)
                reflectiveCurveToRelative(31.1f, 4.8f, 46.0f, -0.1f)
                reflectiveCurveToRelative(28.0f, -14.4f, 37.2f, -27.1f)
                reflectiveCurveToRelative(14.2f, -28.1f, 14.2f, -43.8f)
                lineToRelative(0.0f, -349.4f)
                lineToRelative(88.0f, 0.0f)
                curveToRelative(-0.1f, 7.4f, 0.6f, 14.9f, 1.9f, 22.2f)
                curveToRelative(3.1f, 16.3f, 9.4f, 31.9f, 18.7f, 45.7f)
                reflectiveCurveToRelative(21.3f, 25.6f, 35.2f, 34.6f)
                curveToRelative(19.9f, 13.1f, 43.2f, 20.1f, 67.0f, 20.1f)
                lineToRelative(0.0f, 87.4f)
                close()
            }
        }
        .build()
        return _tiktok!!
    }

private var _tiktok: ImageVector? = null
