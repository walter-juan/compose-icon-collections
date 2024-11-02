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
        _telegram = Builder(name = "Telegram", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.03f, 8.0f, 0.0f, 119.03f, 0.0f, 256.0f)
                reflectiveCurveTo(111.03f, 504.0f, 248.0f, 504.0f)
                reflectiveCurveTo(496.0f, 392.97f, 496.0f, 256.0f)
                reflectiveCurveTo(384.97f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(362.95f, 176.66f)
                curveToRelative(-3.73f, 39.22f, -19.88f, 134.38f, -28.1f, 178.3f)
                curveToRelative(-3.48f, 18.58f, -10.32f, 24.82f, -16.95f, 25.42f)
                curveToRelative(-14.4f, 1.33f, -25.34f, -9.52f, -39.29f, -18.66f)
                curveToRelative(-21.83f, -14.31f, -34.16f, -23.22f, -55.35f, -37.18f)
                curveToRelative(-24.49f, -16.14f, -8.61f, -25.0f, 5.34f, -39.5f)
                curveToRelative(3.65f, -3.79f, 67.11f, -61.51f, 68.33f, -66.75f)
                curveToRelative(0.15f, -0.65f, 0.3f, -3.1f, -1.15f, -4.38f)
                reflectiveCurveToRelative(-3.59f, -0.85f, -5.14f, -0.5f)
                quadToRelative(-3.28f, 0.75f, -104.61f, 69.14f)
                quadToRelative(-14.85f, 10.19f, -26.89f, 9.93f)
                curveToRelative(-8.85f, -0.19f, -25.89f, -5.01f, -38.55f, -9.12f)
                curveToRelative(-15.53f, -5.05f, -27.88f, -7.72f, -26.8f, -16.29f)
                quadToRelative(0.84f, -6.7f, 18.45f, -13.7f)
                quadToRelative(108.45f, -47.25f, 144.63f, -62.3f)
                curveToRelative(68.87f, -28.65f, 83.18f, -33.62f, 92.51f, -33.79f)
                curveToRelative(2.05f, -0.03f, 6.64f, 0.47f, 9.61f, 2.88f)
                arcToRelative(10.45f, 10.45f, 0.0f, false, true, 3.53f, 6.72f)
                arcTo(43.76f, 43.76f, 0.0f, false, true, 362.95f, 176.66f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
