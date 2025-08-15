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

public val BrandsGroup.Airbnb: ImageVector
    get() {
        if (_airbnb != null) {
            return _airbnb!!
        }
        _airbnb = Builder(name = "Airbnb", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.5f, 373.1f)
                curveToRelative(-25.2f, -31.7f, -40.1f, -59.4f, -45.0f, -83.2f)
                curveToRelative(-22.5f, -88.0f, 112.6f, -88.0f, 90.1f, 0.0f)
                curveToRelative(-5.4f, 24.2f, -20.3f, 52.0f, -45.0f, 83.2f)
                lineToRelative(-0.1f, 0.0f)
                close()
                moveTo(362.7f, 446.3f)
                curveToRelative(-42.1f, 18.3f, -83.7f, -10.9f, -119.3f, -50.5f)
                curveToRelative(103.9f, -130.1f, 46.1f, -200.0f, -18.8f, -200.0f)
                curveToRelative(-54.9f, 0.0f, -85.2f, 46.5f, -73.3f, 100.5f)
                curveToRelative(6.9f, 29.2f, 25.2f, 62.4f, 54.4f, 99.5f)
                curveToRelative(-32.5f, 36.0f, -60.5f, 52.7f, -85.2f, 54.9f)
                curveToRelative(-50.0f, 7.4f, -89.1f, -41.1f, -71.3f, -91.1f)
                curveToRelative(15.1f, -39.2f, 111.7f, -231.2f, 115.9f, -241.6f)
                curveToRelative(15.8f, -30.1f, 25.6f, -57.4f, 59.4f, -57.4f)
                curveToRelative(32.3f, 0.0f, 43.4f, 25.9f, 60.4f, 59.9f)
                curveToRelative(36.0f, 70.6f, 89.4f, 177.5f, 114.8f, 239.1f)
                curveToRelative(13.2f, 33.1f, -1.4f, 71.3f, -37.0f, 86.6f)
                close()
                moveTo(409.7f, 310.2f)
                curveToRelative(-128.9f, -274.3f, -136.0f, -278.2f, -185.1f, -278.2f)
                curveToRelative(-45.5f, 0.0f, -64.9f, 31.7f, -84.7f, 72.8f)
                curveToRelative(-106.2f, 212.3f, -116.4f, 242.4f, -117.3f, 245.0f)
                curveToRelative(-25.2f, 69.3f, 26.7f, 130.2f, 89.6f, 130.2f)
                curveToRelative(21.7f, 0.0f, 60.6f, -6.1f, 112.4f, -62.4f)
                curveToRelative(58.7f, 63.8f, 101.3f, 62.4f, 112.4f, 62.4f)
                curveToRelative(62.9f, 0.1f, 114.9f, -60.9f, 89.6f, -130.2f)
                curveToRelative(0.0f, -3.9f, -16.8f, -38.9f, -16.8f, -39.6f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _airbnb!!
    }

private var _airbnb: ImageVector? = null
