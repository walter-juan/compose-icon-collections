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

public val BrandsGroup.Quinscape: ImageVector
    get() {
        if (_quinscape != null) {
            return _quinscape!!
        }
        _quinscape = Builder(name = "Quinscape", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.7f, 474.6f)
                lineToRelative(-1.0f, 0.0f)
                curveToRelative(-41.9f, 0.0f, -82.1f, -16.7f, -111.8f, -46.3f)
                reflectiveCurveToRelative(-46.3f, -69.9f, -46.3f, -111.8f)
                reflectiveCurveToRelative(16.7f, -82.1f, 46.3f, -111.8f)
                reflectiveCurveToRelative(69.9f, -46.3f, 111.8f, -46.3f)
                curveToRelative(94.9f, 0.0f, 168.2f, 83.1f, 157.0f, 176.6f)
                curveToRelative(4.0f, 5.1f, 8.2f, 9.6f, 11.2f, 15.3f)
                curveToRelative(13.4f, -30.3f, 20.3f, -62.4f, 20.3f, -97.7f)
                curveToRelative(0.0f, -135.1f, -109.5f, -244.6f, -244.6f, -244.6f)
                reflectiveCurveTo(12.1f, 117.5f, 12.1f, 252.6f)
                reflectiveCurveTo(121.6f, 497.2f, 256.6f, 497.2f)
                curveToRelative(23.8f, 0.2f, 47.6f, -3.2f, 70.4f, -10.1f)
                curveToRelative(-5.2f, -3.5f, -8.9f, -8.1f, -13.3f, -12.5f)
                close()
                moveTo(392.0f, 305.6f)
                arcToRelative(99.2f, 99.2f, 0.0f, true, false, 0.0f, 198.4f)
                arcToRelative(99.2f, 99.2f, 0.0f, true, false, 0.0f, -198.4f)
                close()
            }
        }
        .build()
        return _quinscape!!
    }

private var _quinscape: ImageVector? = null
