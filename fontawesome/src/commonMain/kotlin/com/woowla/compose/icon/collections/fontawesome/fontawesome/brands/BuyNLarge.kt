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

public val BrandsGroup.BuyNLarge: ImageVector
    get() {
        if (_buyNLarge != null) {
            return _buyNLarge!!
        }
        _buyNLarge = Builder(name = "BuyNLarge", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.2f, 32.0f)
                curveTo(133.5f, 32.0f, 8.0f, 132.3f, 8.0f, 256.0f)
                reflectiveCurveTo(133.5f, 480.0f, 288.2f, 480.0f)
                reflectiveCurveTo(568.4f, 379.7f, 568.4f, 256.0f)
                reflectiveCurveTo(442.9f, 32.0f, 288.2f, 32.0f)
                close()
                moveTo(202.8f, 389.2f)
                lineToRelative(-138.5f, 1.4f)
                lineToRelative(77.2f, -290.7f)
                lineToRelative(133.4f, 0.0f)
                curveToRelative(63.2f, 0.0f, 84.9f, 28.6f, 78.0f, 72.8f)
                curveToRelative(-0.4f, 2.3f, -0.9f, 4.6f, -1.5f, 6.9f)
                curveToRelative(-5.6f, -1.3f, -11.4f, -1.9f, -17.2f, -1.9f)
                curveToRelative(-42.3f, 0.0f, -76.7f, 33.9f, -76.7f, 75.7f)
                curveToRelative(0.0f, 37.1f, 27.1f, 68.0f, 62.9f, 74.5f)
                curveToRelative(-18.2f, 37.2f, -56.2f, 60.9f, -117.7f, 61.5f)
                close()
                moveTo(358.2f, 207.1f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(-22.2f, 90.3f)
                lineToRelative(-35.4f, 0.0f)
                lineToRelative(-11.2f, -35.6f)
                lineToRelative(-7.8f, 35.6f)
                lineToRelative(-37.8f, 0.0f)
                lineToRelative(26.6f, -90.3f)
                lineToRelative(31.3f, 0.0f)
                lineToRelative(15.0f, 36.8f)
                lineToRelative(9.4f, -36.8f)
                close()
                moveTo(504.1f, 389.2f)
                lineToRelative(-197.1f, 0.0f)
                lineToRelative(15.8f, -61.2f)
                curveToRelative(3.8f, 0.6f, 7.6f, 0.8f, 11.5f, 0.8f)
                curveToRelative(42.3f, 0.0f, 76.7f, -33.9f, 76.7f, -75.6f)
                curveToRelative(0.0f, -32.6f, -21.0f, -60.5f, -50.4f, -71.1f)
                lineToRelative(21.3f, -82.4f)
                lineToRelative(92.5f, 0.0f)
                lineToRelative(-53.0f, 205.4f)
                lineToRelative(103.9f, 0.0f)
                lineToRelative(-21.2f, 84.1f)
                close()
                moveTo(211.9f, 269.4f)
                lineToRelative(-24.7f, 0.0f)
                lineToRelative(-13.8f, 56.5f)
                lineToRelative(24.7f, 0.0f)
                curveToRelative(16.1f, 0.0f, 32.1f, -3.2f, 37.9f, -26.6f)
                curveToRelative(5.6f, -22.3f, -8.0f, -29.8f, -24.1f, -29.8f)
                close()
                moveTo(233.2f, 170.0f)
                lineToRelative(-21.3f, 0.0f)
                lineToRelative(-11.7f, 47.7f)
                lineToRelative(21.4f, 0.0f)
                curveToRelative(18.0f, 0.0f, 35.4f, -14.6f, 39.2f, -30.1f)
                curveToRelative(4.6f, -18.9f, -9.5f, -17.6f, -27.6f, -17.6f)
                close()
            }
        }
        .build()
        return _buyNLarge!!
    }

private var _buyNLarge: ImageVector? = null
