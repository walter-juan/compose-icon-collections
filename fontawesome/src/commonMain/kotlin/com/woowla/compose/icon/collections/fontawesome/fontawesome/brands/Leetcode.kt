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

public val BrandsGroup.Leetcode: ImageVector
    get() {
        if (_leetcode != null) {
            return _leetcode!!
        }
        _leetcode = Builder(name = "Leetcode", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.4f, 9.3f)
                curveTo(246.5f, -2.5f, 265.1f, -3.2f, 277.0f, 7.9f)
                reflectiveCurveToRelative(12.5f, 29.8f, 1.4f, 41.6f)
                lineToRelative(-43.0f, 46.0f)
                curveToRelative(21.5f, 3.3f, 42.1f, 11.8f, 59.1f, 25.6f)
                lineToRelative(74.6f, 60.3f)
                curveToRelative(12.6f, 10.2f, 14.6f, 28.8f, 4.4f, 41.4f)
                reflectiveCurveToRelative(-28.7f, 14.6f, -41.4f, 4.4f)
                lineToRelative(-74.6f, -60.3f)
                curveToRelative(-26.2f, -21.1f, -71.9f, -18.2f, -94.5f, 5.9f)
                lineTo(81.0f, 261.0f)
                curveToRelative(-21.5f, 23.0f, -19.1f, 60.0f, 5.6f, 84.2f)
                lineToRelative(91.2f, 89.4f)
                curveToRelative(24.9f, 24.0f, 65.6f, 24.0f, 90.1f, -0.4f)
                lineToRelative(51.1f, -51.0f)
                curveToRelative(11.5f, -11.5f, 30.1f, -11.5f, 41.6f, 0.1f)
                reflectiveCurveToRelative(11.4f, 30.2f, -0.1f, 41.7f)
                lineToRelative(-51.1f, 51.0f)
                curveToRelative(-47.1f, 47.1f, -124.0f, 47.7f, -171.9f, 1.6f)
                lineToRelative(-92.0f, -90.2f)
                curveTo(-1.4f, 341.3f, -6.0f, 267.9f, 38.0f, 220.7f)
                lineTo(235.4f, 9.3f)
                close()
                moveTo(411.7f, 273.2f)
                curveToRelative(16.2f, 0.0f, 29.4f, 13.2f, 29.4f, 29.5f)
                reflectiveCurveToRelative(-13.2f, 29.5f, -29.4f, 29.5f)
                lineToRelative(-216.9f, 0.0f)
                curveToRelative(-16.2f, 0.0f, -29.4f, -13.2f, -29.4f, -29.5f)
                reflectiveCurveToRelative(13.2f, -29.5f, 29.4f, -29.5f)
                lineToRelative(216.9f, 0.0f)
                close()
            }
        }
        .build()
        return _leetcode!!
    }

private var _leetcode: ImageVector? = null
