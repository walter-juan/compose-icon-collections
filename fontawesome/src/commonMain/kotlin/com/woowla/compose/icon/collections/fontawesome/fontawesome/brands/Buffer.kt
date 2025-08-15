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

public val BrandsGroup.Buffer: ImageVector
    get() {
        if (_buffer != null) {
            return _buffer!!
        }
        _buffer = Builder(name = "Buffer", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(428.2f, 380.7f)
                lineTo(231.7f, 478.5f)
                curveToRelative(-2.3f, 1.0f, -4.8f, 1.5f, -7.3f, 1.5f)
                reflectiveCurveToRelative(-5.0f, -0.5f, -7.3f, -1.5f)
                lineTo(20.5f, 380.7f)
                curveToRelative(-4.0f, -2.0f, -4.0f, -5.3f, 0.0f, -7.3f)
                lineTo(67.6f, 350.0f)
                curveToRelative(2.3f, -1.0f, 4.8f, -1.5f, 7.3f, -1.5f)
                reflectiveCurveToRelative(5.0f, 0.5f, 7.3f, 1.5f)
                lineToRelative(134.8f, 67.0f)
                curveToRelative(2.3f, 1.0f, 4.8f, 1.5f, 7.3f, 1.5f)
                reflectiveCurveToRelative(5.0f, -0.5f, 7.3f, -1.5f)
                lineToRelative(134.8f, -67.0f)
                curveToRelative(2.3f, -1.0f, 4.8f, -1.5f, 7.3f, -1.5f)
                reflectiveCurveToRelative(5.0f, 0.5f, 7.3f, 1.5f)
                lineToRelative(47.1f, 23.4f)
                curveToRelative(4.0f, 2.0f, 4.0f, 5.2f, 0.0f, 7.2f)
                close()
                moveTo(428.2f, 244.2f)
                lineToRelative(-47.1f, -23.4f)
                curveToRelative(-2.3f, -1.0f, -4.8f, -1.5f, -7.3f, -1.5f)
                reflectiveCurveToRelative(-5.0f, 0.5f, -7.3f, 1.5f)
                lineTo(231.7f, 287.8f)
                curveToRelative(-2.3f, 1.0f, -4.8f, 1.5f, -7.3f, 1.5f)
                reflectiveCurveToRelative(-5.0f, -0.5f, -7.3f, -1.5f)
                lineTo(82.3f, 220.7f)
                curveToRelative(-2.3f, -1.0f, -4.8f, -1.5f, -7.3f, -1.5f)
                reflectiveCurveToRelative(-5.0f, 0.5f, -7.3f, 1.5f)
                lineTo(20.5f, 244.1f)
                curveToRelative(-4.0f, 2.0f, -4.0f, 5.3f, 0.0f, 7.3f)
                lineToRelative(196.5f, 97.8f)
                curveToRelative(2.3f, 1.0f, 4.8f, 1.5f, 7.3f, 1.5f)
                reflectiveCurveToRelative(5.0f, -0.5f, 7.3f, -1.5f)
                lineToRelative(196.5f, -97.8f)
                curveToRelative(4.0f, -2.0f, 4.0f, -5.3f, 0.0f, -7.3f)
                close()
                moveTo(20.5f, 130.4f)
                lineTo(217.0f, 220.7f)
                curveToRelative(4.7f, 1.9f, 10.0f, 1.9f, 14.7f, 0.0f)
                lineToRelative(196.5f, -90.3f)
                curveToRelative(4.0f, -1.9f, 4.0f, -4.9f, 0.0f, -6.7f)
                lineTo(231.7f, 33.4f)
                curveToRelative(-4.7f, -1.9f, -10.0f, -1.9f, -14.7f, 0.0f)
                lineTo(20.5f, 123.7f)
                curveToRelative(-4.0f, 1.8f, -4.0f, 4.9f, 0.0f, 6.7f)
                close()
            }
        }
        .build()
        return _buffer!!
    }

private var _buffer: ImageVector? = null
