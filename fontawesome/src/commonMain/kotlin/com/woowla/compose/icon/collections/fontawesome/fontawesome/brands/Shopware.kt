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

public val BrandsGroup.Shopware: ImageVector
    get() {
        if (_shopware != null) {
            return _shopware!!
        }
        _shopware = Builder(name = "Shopware", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.5f, 455.4f)
                curveToRelative(-42.6f, 31.7f, -94.4f, 48.7f, -147.5f, 48.6f)
                curveToRelative(-137.2f, 0.0f, -248.0f, -111.0f, -248.0f, -248.0f)
                curveToRelative(0.0f, -137.2f, 111.0f, -248.0f, 248.0f, -248.0f)
                curveToRelative(61.2f, -0.1f, 120.2f, 22.6f, 165.7f, 63.5f)
                curveToRelative(0.6f, 0.5f, 0.9f, 1.2f, 1.1f, 1.9f)
                reflectiveCurveToRelative(0.1f, 1.5f, -0.3f, 2.2f)
                reflectiveCurveToRelative(-0.8f, 1.3f, -1.5f, 1.6f)
                reflectiveCurveToRelative(-1.4f, 0.5f, -2.2f, 0.4f)
                curveToRelative(-18.8f, -2.5f, -37.7f, -3.7f, -56.7f, -3.7f)
                curveToRelative(-129.4f, 0.0f, -222.4f, 53.5f, -222.4f, 155.4f)
                curveToRelative(0.0f, 109.0f, 92.1f, 145.9f, 176.8f, 178.7f)
                curveToRelative(33.6f, 13.0f, 65.4f, 25.4f, 87.0f, 41.6f)
                curveToRelative(0.4f, 0.3f, 0.8f, 0.8f, 1.1f, 1.3f)
                reflectiveCurveToRelative(0.4f, 1.0f, 0.4f, 1.6f)
                reflectiveCurveToRelative(-0.1f, 1.1f, -0.4f, 1.6f)
                reflectiveCurveToRelative(-0.6f, 0.9f, -1.1f, 1.3f)
                lineToRelative(-0.1f, 0.0f)
                close()
                moveTo(503.0f, 233.1f)
                curveToRelative(-0.1f, -0.9f, -0.5f, -1.8f, -1.3f, -2.4f)
                curveToRelative(-51.8f, -43.0f, -93.6f, -60.5f, -144.5f, -60.5f)
                curveToRelative(-84.1f, 0.0f, -80.3f, 52.2f, -80.3f, 53.6f)
                curveToRelative(0.0f, 42.6f, 52.1f, 62.0f, 112.3f, 84.5f)
                curveToRelative(31.1f, 11.6f, 63.2f, 23.6f, 92.7f, 39.9f)
                curveToRelative(0.4f, 0.2f, 0.9f, 0.4f, 1.4f, 0.4f)
                reflectiveCurveToRelative(1.0f, 0.0f, 1.5f, -0.2f)
                reflectiveCurveToRelative(0.9f, -0.4f, 1.3f, -0.8f)
                reflectiveCurveToRelative(0.6f, -0.8f, 0.8f, -1.2f)
                curveToRelative(14.1f, -36.0f, 19.5f, -74.8f, 16.0f, -113.3f)
                close()
            }
        }
        .build()
        return _shopware!!
    }

private var _shopware: ImageVector? = null
