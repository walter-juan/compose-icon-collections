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

public val BrandsGroup.Dribbble: ImageVector
    get() {
        if (_dribbble != null) {
            return _dribbble!!
        }
        _dribbble = Builder(name = "Dribbble", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(420.0f, 122.4f)
                curveToRelative(29.5f, 36.0f, 47.4f, 82.0f, 47.8f, 132.0f)
                curveToRelative(-7.0f, -1.5f, -77.0f, -15.7f, -147.5f, -6.8f)
                curveToRelative(-5.8f, -14.0f, -11.2f, -26.4f, -18.6f, -41.6f)
                curveToRelative(78.3f, -32.0f, 113.8f, -77.5f, 118.3f, -83.5f)
                close()
                moveTo(396.4f, 97.9f)
                curveToRelative(-3.8f, 5.4f, -35.7f, 48.3f, -111.0f, 76.5f)
                curveToRelative(-34.7f, -63.8f, -73.2f, -116.2f, -79.0f, -124.0f)
                curveToRelative(67.2f, -16.2f, 138.0f, 1.3f, 190.1f, 47.5f)
                close()
                moveTo(165.9f, 64.6f)
                curveToRelative(5.6f, 7.7f, 43.4f, 60.1f, 78.5f, 122.5f)
                curveToRelative(-99.1f, 26.3f, -186.4f, 25.9f, -195.8f, 25.8f)
                curveToRelative(13.7f, -65.7f, 58.0f, -120.4f, 117.3f, -148.3f)
                close()
                moveTo(44.2f, 256.3f)
                curveToRelative(0.0f, -2.2f, 0.0f, -4.3f, 0.1f, -6.5f)
                curveToRelative(9.3f, 0.2f, 111.9f, 1.5f, 217.7f, -30.1f)
                curveToRelative(6.1f, 11.9f, 11.9f, 23.9f, 17.2f, 35.9f)
                curveToRelative(-76.6f, 21.6f, -146.2f, 83.5f, -180.5f, 142.3f)
                curveToRelative(-33.8f, -37.6f, -54.5f, -87.2f, -54.5f, -141.6f)
                close()
                moveTo(126.0f, 423.4f)
                curveToRelative(22.1f, -45.2f, 82.2f, -103.6f, 167.6f, -132.8f)
                curveToRelative(29.7f, 77.3f, 42.0f, 142.1f, 45.2f, 160.6f)
                curveToRelative(-68.1f, 29.0f, -150.0f, 21.1f, -212.8f, -27.9f)
                close()
                moveTo(374.4f, 431.9f)
                curveToRelative(-2.2f, -12.9f, -13.4f, -74.9f, -41.2f, -151.0f)
                curveToRelative(66.4f, -10.6f, 124.7f, 6.8f, 131.9f, 9.1f)
                curveToRelative(-9.4f, 58.9f, -43.3f, 109.8f, -90.8f, 142.0f)
                close()
            }
        }
        .build()
        return _dribbble!!
    }

private var _dribbble: ImageVector? = null
