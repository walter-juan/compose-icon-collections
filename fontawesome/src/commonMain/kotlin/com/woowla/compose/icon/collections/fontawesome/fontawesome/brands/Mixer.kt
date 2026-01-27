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

public val BrandsGroup.Mixer: ImageVector
    get() {
        if (_mixer != null) {
            return _mixer!!
        }
        _mixer = Builder(name = "Mixer", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.6f, 76.1f)
                curveToRelative(-3.8f, -5.1f, -8.7f, -9.4f, -14.2f, -12.5f)
                reflectiveCurveToRelative(-11.7f, -5.1f, -18.1f, -5.7f)
                reflectiveCurveToRelative(-12.8f, 0.1f, -18.8f, 2.2f)
                reflectiveCurveToRelative(-11.6f, 5.3f, -16.3f, 9.6f)
                curveToRelative(-17.6f, 16.2f, -19.0f, 43.5f, -4.8f, 62.8f)
                lineToRelative(91.8f, 123.0f)
                lineToRelative(-92.3f, 124.1f)
                curveToRelative(-14.2f, 19.3f, -13.1f, 46.6f, 4.7f, 62.8f)
                curveToRelative(4.7f, 4.3f, 10.3f, 7.6f, 16.3f, 9.6f)
                reflectiveCurveToRelative(12.5f, 2.8f, 18.8f, 2.2f)
                reflectiveCurveToRelative(12.5f, -2.5f, 18.1f, -5.7f)
                reflectiveCurveToRelative(10.4f, -7.4f, 14.2f, -12.5f)
                lineTo(210.9f, 262.7f)
                curveToRelative(1.5f, -2.1f, 2.3f, -4.6f, 2.3f, -7.1f)
                reflectiveCurveToRelative(-0.8f, -5.0f, -2.3f, -7.1f)
                lineTo(82.6f, 76.1f)
                close()
                moveTo(438.2f, 379.6f)
                lineToRelative(-92.3f, -124.1f)
                lineToRelative(91.8f, -123.0f)
                curveToRelative(14.2f, -19.2f, 12.8f, -46.6f, -4.7f, -62.8f)
                curveToRelative(-4.7f, -4.3f, -10.3f, -7.6f, -16.3f, -9.6f)
                reflectiveCurveToRelative(-12.5f, -2.8f, -18.8f, -2.2f)
                reflectiveCurveToRelative(-12.5f, 2.5f, -18.1f, 5.7f)
                reflectiveCurveToRelative(-10.4f, 7.4f, -14.2f, 12.5f)
                lineToRelative(-128.0f, 172.1f)
                curveToRelative(-1.5f, 2.1f, -2.3f, 4.6f, -2.3f, 7.1f)
                reflectiveCurveToRelative(0.8f, 5.0f, 2.3f, 7.1f)
                lineTo(366.0f, 435.9f)
                curveToRelative(3.8f, 5.1f, 8.7f, 9.4f, 14.2f, 12.5f)
                reflectiveCurveToRelative(11.7f, 5.1f, 18.1f, 5.7f)
                reflectiveCurveToRelative(12.8f, -0.1f, 18.8f, -2.2f)
                reflectiveCurveToRelative(11.6f, -5.3f, 16.3f, -9.6f)
                curveToRelative(17.8f, -16.2f, 19.0f, -43.5f, 4.7f, -62.8f)
                close()
            }
        }
        .build()
        return _mixer!!
    }

private var _mixer: ImageVector? = null
