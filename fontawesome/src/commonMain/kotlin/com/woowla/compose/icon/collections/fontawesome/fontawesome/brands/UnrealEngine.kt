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

public val BrandsGroup.UnrealEngine: ImageVector
    get() {
        if (_unrealEngine != null) {
            return _unrealEngine!!
        }
        _unrealEngine = Builder(name = "UnrealEngine", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(321.5f, 398.3f)
                lineToRelative(-25.1f, -28.3f)
                lineToRelative(-42.4f, 42.6f)
                curveToRelative(-24.1f, -0.3f, -47.9f, -6.2f, -69.3f, -17.2f)
                reflectiveCurveToRelative(-40.1f, -26.9f, -54.5f, -46.3f)
                curveToRelative(4.5f, 1.4f, 9.2f, 2.3f, 13.9f, 2.6f)
                curveToRelative(6.9f, 0.1f, 14.5f, -2.4f, 14.5f, -14.1f)
                lineToRelative(0.0f, -115.1f)
                curveToRelative(0.1f, -3.0f, -0.5f, -5.9f, -1.7f, -8.6f)
                reflectiveCurveToRelative(-3.1f, -5.0f, -5.4f, -6.9f)
                reflectiveCurveToRelative(-5.0f, -3.1f, -7.9f, -3.7f)
                reflectiveCurveToRelative(-5.9f, -0.5f, -8.8f, 0.2f)
                curveToRelative(-19.6f, 4.5f, -35.3f, 53.5f, -35.3f, 53.5f)
                curveToRelative(-0.2f, -22.6f, 4.5f, -45.0f, 13.8f, -65.6f)
                reflectiveCurveToRelative(23.0f, -39.0f, 40.1f, -53.8f)
                curveToRelative(22.5f, -19.5f, 50.1f, -32.2f, 79.6f, -36.7f)
                curveToRelative(-21.4f, 12.2f, -33.5f, 32.1f, -33.5f, 48.9f)
                curveToRelative(0.0f, 26.9f, 16.2f, 23.6f, 21.0f, 19.7f)
                lineToRelative(0.0f, 155.3f)
                curveToRelative(0.8f, 1.9f, 1.9f, 3.8f, 3.2f, 5.5f)
                curveToRelative(2.1f, 3.0f, 5.0f, 5.4f, 8.2f, 7.0f)
                reflectiveCurveToRelative(6.9f, 2.5f, 10.5f, 2.5f)
                curveToRelative(16.2f, 0.0f, 37.3f, -18.5f, 37.3f, -18.5f)
                lineToRelative(0.0f, -125.7f)
                curveToRelative(0.0f, -12.8f, -9.6f, -28.2f, -19.3f, -33.5f)
                curveToRelative(0.0f, 0.0f, 17.9f, -3.2f, 31.7f, 7.4f)
                curveToRelative(2.6f, -3.2f, 5.3f, -6.2f, 8.2f, -9.1f)
                curveToRelative(32.2f, -31.6f, 62.5f, -40.6f, 87.7f, -45.1f)
                curveToRelative(0.0f, 0.0f, -45.9f, 36.1f, -45.9f, 84.5f)
                curveToRelative(0.0f, 36.0f, 0.9f, 123.8f, 0.9f, 123.8f)
                curveToRelative(17.0f, 16.4f, 42.4f, -7.3f, 65.2f, -30.8f)
                curveToRelative(-4.4f, 21.3f, -24.0f, 75.9f, -86.6f, 105.4f)
                close()
            }
        }
        .build()
        return _unrealEngine!!
    }

private var _unrealEngine: ImageVector? = null
