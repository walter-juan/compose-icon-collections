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

public val BrandsGroup.Microblog: ImageVector
    get() {
        if (_microblog != null) {
            return _microblog!!
        }
        _microblog = Builder(name = "Microblog", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(399.8f, 362.2f)
                curveToRelative(29.5f, -34.7f, 47.1f, -78.3f, 47.1f, -125.8f)
                curveToRelative(0.0f, -113.0f, -99.6f, -204.4f, -222.5f, -204.4f)
                reflectiveCurveTo(2.0f, 123.5f, 2.0f, 236.4f)
                reflectiveCurveTo(101.6f, 440.9f, 224.5f, 440.9f)
                curveToRelative(27.0f, 0.0f, 53.9f, -4.5f, 79.4f, -13.4f)
                curveToRelative(1.4f, -0.5f, 3.0f, -0.5f, 4.5f, -0.1f)
                reflectiveCurveToRelative(2.7f, 1.4f, 3.6f, 2.6f)
                curveToRelative(18.6f, 25.1f, 47.6f, 42.7f, 79.9f, 49.9f)
                curveToRelative(1.1f, 0.2f, 2.3f, 0.0f, 3.3f, -0.6f)
                reflectiveCurveToRelative(1.7f, -1.6f, 1.9f, -2.8f)
                curveToRelative(0.1f, -0.6f, 0.1f, -1.3f, 0.0f, -1.9f)
                reflectiveCurveToRelative(-0.4f, -1.2f, -0.8f, -1.7f)
                curveToRelative(-12.3f, -16.0f, -18.7f, -35.8f, -18.0f, -56.0f)
                reflectiveCurveToRelative(8.4f, -39.5f, 21.7f, -54.7f)
                lineToRelative(-0.2f, 0.1f)
                close()
                moveTo(330.0f, 212.4f)
                lineToRelative(-57.3f, 43.5f)
                lineToRelative(20.8f, 68.9f)
                curveToRelative(0.4f, 1.3f, 0.4f, 2.7f, -0.1f, 4.0f)
                reflectiveCurveToRelative(-1.2f, 2.4f, -2.3f, 3.2f)
                reflectiveCurveToRelative(-2.4f, 1.2f, -3.8f, 1.2f)
                reflectiveCurveToRelative(-2.7f, -0.4f, -3.8f, -1.2f)
                lineToRelative(-59.1f, -41.0f)
                lineToRelative(-59.1f, 41.1f)
                curveToRelative(-1.1f, 0.8f, -2.4f, 1.2f, -3.8f, 1.2f)
                reflectiveCurveToRelative(-2.7f, -0.4f, -3.8f, -1.2f)
                reflectiveCurveToRelative(-1.9f, -1.9f, -2.3f, -3.2f)
                reflectiveCurveToRelative(-0.5f, -2.7f, -0.1f, -4.0f)
                lineToRelative(20.8f, -68.9f)
                lineToRelative(-57.3f, -43.5f)
                curveToRelative(-1.1f, -0.8f, -1.9f, -1.9f, -2.3f, -3.2f)
                reflectiveCurveToRelative(-0.4f, -2.7f, 0.0f, -4.0f)
                reflectiveCurveToRelative(1.2f, -2.4f, 2.3f, -3.2f)
                reflectiveCurveToRelative(2.4f, -1.3f, 3.7f, -1.3f)
                lineToRelative(71.9f, -1.5f)
                lineToRelative(23.7f, -67.9f)
                curveToRelative(0.4f, -1.3f, 1.3f, -2.4f, 2.4f, -3.2f)
                reflectiveCurveToRelative(2.4f, -1.2f, 3.8f, -1.2f)
                reflectiveCurveToRelative(2.7f, 0.4f, 3.8f, 1.2f)
                reflectiveCurveToRelative(1.9f, 1.9f, 2.4f, 3.2f)
                lineToRelative(23.7f, 67.9f)
                lineToRelative(71.9f, 1.5f)
                curveToRelative(1.4f, 0.0f, 2.7f, 0.4f, 3.8f, 1.2f)
                reflectiveCurveToRelative(1.9f, 1.9f, 2.3f, 3.2f)
                reflectiveCurveToRelative(0.4f, 2.7f, 0.0f, 4.0f)
                reflectiveCurveToRelative(-1.2f, 2.4f, -2.3f, 3.3f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _microblog!!
    }

private var _microblog: ImageVector? = null
