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

public val BrandsGroup.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(name = "Telegram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(371.0f, 176.7f)
                curveToRelative(-3.7f, 39.2f, -19.9f, 134.4f, -28.1f, 178.3f)
                curveToRelative(-3.5f, 18.6f, -10.3f, 24.8f, -16.9f, 25.4f)
                curveToRelative(-14.4f, 1.3f, -25.3f, -9.5f, -39.3f, -18.7f)
                curveToRelative(-21.8f, -14.3f, -34.2f, -23.2f, -55.3f, -37.2f)
                curveToRelative(-24.5f, -16.1f, -8.6f, -25.0f, 5.3f, -39.5f)
                curveToRelative(3.7f, -3.8f, 67.1f, -61.5f, 68.3f, -66.7f)
                curveToRelative(0.2f, -0.7f, 0.3f, -3.1f, -1.2f, -4.4f)
                reflectiveCurveToRelative(-3.6f, -0.8f, -5.1f, -0.5f)
                curveToRelative(-2.2f, 0.5f, -37.1f, 23.5f, -104.6f, 69.1f)
                curveToRelative(-9.9f, 6.8f, -18.9f, 10.1f, -26.9f, 9.9f)
                curveToRelative(-8.9f, -0.2f, -25.9f, -5.0f, -38.6f, -9.1f)
                curveToRelative(-15.5f, -5.0f, -27.9f, -7.7f, -26.8f, -16.3f)
                curveToRelative(0.6f, -4.5f, 6.7f, -9.0f, 18.4f, -13.7f)
                curveToRelative(72.3f, -31.5f, 120.5f, -52.3f, 144.6f, -62.3f)
                curveToRelative(68.9f, -28.6f, 83.2f, -33.6f, 92.5f, -33.8f)
                curveToRelative(2.1f, 0.0f, 6.6f, 0.5f, 9.6f, 2.9f)
                curveToRelative(2.0f, 1.7f, 3.2f, 4.1f, 3.5f, 6.7f)
                curveToRelative(0.5f, 3.2f, 0.6f, 6.5f, 0.4f, 9.8f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
