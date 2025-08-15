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

public val BrandsGroup.Symfony: ImageVector
    get() {
        if (_symfony != null) {
            return _symfony!!
        }
        _symfony = Builder(name = "Symfony", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(389.7f, 151.5f)
                curveToRelative(-11.5f, 0.4f, -19.4f, -6.4f, -19.8f, -16.9f)
                curveToRelative(-0.3f, -9.2f, 6.7f, -13.4f, 6.5f, -18.9f)
                curveToRelative(-0.2f, -6.5f, -10.2f, -6.8f, -12.9f, -6.7f)
                curveToRelative(-39.8f, 1.3f, -48.6f, 57.0f, -58.9f, 113.8f)
                curveToRelative(21.4f, 3.2f, 36.6f, -0.7f, 45.1f, -6.2f)
                curveToRelative(12.0f, -7.7f, -3.3f, -15.7f, -1.4f, -24.6f)
                curveToRelative(4.0f, -18.2f, 32.6f, -19.0f, 32.0f, 5.3f)
                curveToRelative(-0.4f, 17.9f, -25.9f, 41.8f, -77.6f, 35.7f)
                curveToRelative(-10.8f, 59.5f, -18.4f, 115.0f, -58.2f, 161.7f)
                curveToRelative(-29.0f, 34.5f, -58.4f, 39.8f, -71.6f, 40.3f)
                curveToRelative(-24.6f, 0.9f, -41.0f, -12.3f, -41.6f, -29.8f)
                curveToRelative(-0.6f, -17.0f, 14.4f, -26.3f, 24.3f, -26.6f)
                curveToRelative(21.9f, -0.8f, 30.1f, 25.7f, 14.9f, 34.0f)
                curveToRelative(-12.1f, 9.7f, 0.1f, 12.6f, 2.1f, 12.6f)
                curveToRelative(10.4f, -0.4f, 17.3f, -5.5f, 22.2f, -9.0f)
                curveToRelative(24.0f, -20.0f, 33.2f, -54.9f, 45.4f, -118.3f)
                curveToRelative(8.2f, -49.7f, 17.0f, -78.0f, 18.2f, -82.0f)
                curveToRelative(-16.9f, -12.7f, -27.1f, -28.6f, -49.8f, -34.7f)
                curveToRelative(-15.6f, -4.2f, -25.1f, -0.6f, -31.8f, 7.8f)
                curveToRelative(-7.9f, 10.0f, -5.3f, 23.0f, 2.4f, 30.7f)
                lineToRelative(12.6f, 14.0f)
                curveToRelative(15.5f, 17.9f, 24.0f, 31.9f, 20.8f, 50.6f)
                curveToRelative(-5.1f, 29.9f, -40.7f, 52.9f, -82.9f, 39.9f)
                curveToRelative(-36.0f, -11.1f, -42.7f, -36.6f, -38.4f, -50.6f)
                curveToRelative(7.5f, -24.2f, 42.4f, -11.7f, 34.6f, 13.6f)
                curveToRelative(-2.8f, 8.6f, -4.9f, 8.7f, -6.3f, 13.1f)
                curveToRelative(-4.6f, 14.8f, 41.8f, 28.4f, 51.0f, -1.4f)
                curveToRelative(4.5f, -14.5f, -5.3f, -21.7f, -22.2f, -39.9f)
                curveToRelative(-28.5f, -31.7f, -16.0f, -65.5f, 2.9f, -79.7f)
                curveToRelative(52.8f, -39.4f, 100.5f, 17.5f, 110.6f, 25.8f)
                curveToRelative(37.2f, -109.0f, 100.5f, -105.5f, 102.4f, -105.5f)
                curveToRelative(25.2f, -0.8f, 44.2f, 10.6f, 44.8f, 28.6f)
                curveToRelative(0.2f, 7.7f, -4.2f, 22.6f, -19.5f, 23.1f)
                close()
            }
        }
        .build()
        return _symfony!!
    }

private var _symfony: ImageVector? = null
