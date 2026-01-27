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

public val BrandsGroup.Opera: ImageVector
    get() {
        if (_opera != null) {
            return _opera!!
        }
        _opera = Builder(name = "Opera", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(321.9f, 32.7f)
                curveToRelative(-170.2f, 0.0f, -252.6f, 223.8f, -147.5f, 355.1f)
                curveToRelative(36.5f, 45.4f, 88.6f, 75.6f, 147.5f, 75.6f)
                curveToRelative(36.3f, 0.0f, 70.3f, -11.1f, 99.4f, -30.4f)
                curveToRelative(-43.8f, 39.2f, -101.9f, 63.0f, -165.3f, 63.0f)
                curveToRelative(-3.9f, 0.0f, -8.0f, 0.0f, -11.9f, -0.3f)
                curveToRelative(-131.5f, -6.1f, -236.1f, -114.6f, -236.1f, -247.7f)
                curveToRelative(0.0f, -137.0f, 111.0f, -248.0f, 248.0f, -248.0f)
                lineToRelative(0.8f, 0.0f)
                curveToRelative(63.1f, 0.3f, 120.7f, 24.1f, 164.4f, 63.1f)
                curveToRelative(-29.0f, -19.4f, -63.1f, -30.4f, -99.3f, -30.4f)
                close()
                moveTo(423.7f, 430.4f)
                curveToRelative(-40.9f, 24.7f, -90.7f, 23.6f, -132.0f, -5.8f)
                curveToRelative(56.2f, -20.5f, 97.7f, -91.6f, 97.7f, -176.6f)
                curveToRelative(0.0f, -84.7f, -41.2f, -155.8f, -97.4f, -176.6f)
                curveToRelative(41.8f, -29.2f, 91.2f, -30.3f, 132.9f, -5.0f)
                curveToRelative(105.9f, 98.7f, 105.5f, 265.7f, -1.2f, 364.0f)
                close()
            }
        }
        .build()
        return _opera!!
    }

private var _opera: ImageVector? = null
