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

public val BrandsGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(549.7f, 124.1f)
                curveTo(543.5f, 100.4f, 524.9f, 81.8f, 501.4f, 75.5f)
                curveTo(458.9f, 64.0f, 288.1f, 64.0f, 288.1f, 64.0f)
                reflectiveCurveTo(117.3f, 64.0f, 74.7f, 75.5f)
                curveTo(51.2f, 81.8f, 32.7f, 100.4f, 26.4f, 124.1f)
                curveTo(15.0f, 167.0f, 15.0f, 256.4f, 15.0f, 256.4f)
                reflectiveCurveToRelative(0.0f, 89.4f, 11.4f, 132.3f)
                curveToRelative(6.3f, 23.6f, 24.8f, 41.5f, 48.3f, 47.8f)
                curveToRelative(42.6f, 11.5f, 213.4f, 11.5f, 213.4f, 11.5f)
                reflectiveCurveToRelative(170.8f, 0.0f, 213.4f, -11.5f)
                curveToRelative(23.5f, -6.3f, 42.0f, -24.2f, 48.3f, -47.8f)
                curveToRelative(11.4f, -42.9f, 11.4f, -132.3f, 11.4f, -132.3f)
                reflectiveCurveToRelative(0.0f, -89.4f, -11.4f, -132.3f)
                close()
                moveTo(232.2f, 337.6f)
                lineToRelative(0.0f, -162.4f)
                lineToRelative(142.7f, 81.2f)
                lineToRelative(-142.7f, 81.2f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
