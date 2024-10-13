package com.woowla.compose.icon.collections.devicons.devicons.shopware

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ShopwareGroup

public val ShopwareGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF179EFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.85f, 115.41f)
                curveToRelative(-9.96f, 6.89f, -21.99f, 10.97f, -34.98f, 11.11f)
                curveToRelative(-34.14f, 0.37f, -62.64f, -27.08f, -63.49f, -61.22f)
                curveTo(0.5f, 29.87f, 28.95f, 0.88f, 64.18f, 0.88f)
                curveToRelative(15.81f, 0.0f, 30.25f, 5.84f, 41.28f, 15.47f)
                curveToRelative(1.0f, 0.87f, 0.27f, 2.5f, -1.04f, 2.35f)
                curveToRelative(-22.07f, -2.59f, -43.67f, -0.18f, -57.34f, 10.43f)
                curveTo(31.3f, 41.38f, 29.8f, 59.97f, 38.9f, 76.34f)
                curveToRelative(12.84f, 23.1f, 41.28f, 23.33f, 60.95f, 36.82f)
                curveToRelative(0.79f, 0.54f, 0.79f, 1.71f, 0.0f, 2.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF179EFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(127.0f, 63.7f)
                curveToRelative(0.0f, 8.54f, -1.7f, 16.68f, -4.79f, 24.1f)
                curveToRelative(-15.81f, -8.45f, -32.64f, -14.21f, -40.19f, -17.03f)
                curveToRelative(-8.92f, -3.35f, -16.73f, -12.65f, -11.52f, -20.82f)
                reflectiveCurveToRelative(18.21f, -9.66f, 34.2f, -5.58f)
                curveToRelative(6.82f, 1.75f, 13.13f, 6.22f, 18.88f, 11.55f)
                curveToRelative(2.15f, 2.0f, 3.42f, 4.79f, 3.43f, 7.73f)
                curveToRelative(-0.01f, 0.02f, -0.01f, 0.03f, -0.01f, 0.05f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
