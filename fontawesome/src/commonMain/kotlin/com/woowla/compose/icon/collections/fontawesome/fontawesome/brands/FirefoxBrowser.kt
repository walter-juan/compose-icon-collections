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

public val BrandsGroup.FirefoxBrowser: ImageVector
    get() {
        if (_firefoxBrowser != null) {
            return _firefoxBrowser!!
        }
        _firefoxBrowser = Builder(name = "FirefoxBrowser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.2f, 127.5f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(481.6f, 172.9f)
                curveToRelative(-10.6f, -25.5f, -32.1f, -53.0f, -48.9f, -61.7f)
                curveToRelative(13.7f, 26.9f, 21.7f, 53.9f, 24.7f, 74.0f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.3f, 0.1f, 0.4f)
                curveToRelative(-27.6f, -68.8f, -74.4f, -96.5f, -112.6f, -156.8f)
                curveToRelative(-15.0f, -23.7f, -10.9f, -25.2f, -13.1f, -24.7f)
                lineToRelative(-0.1f, 0.1f)
                curveToRelative(-46.7f, 26.0f, -75.3f, 78.4f, -82.6f, 122.7f)
                curveToRelative(-16.6f, 0.9f, -32.9f, 5.0f, -47.9f, 12.1f)
                curveToRelative(-1.4f, 0.6f, -2.5f, 1.7f, -3.1f, 3.0f)
                reflectiveCurveToRelative(-0.9f, 2.8f, -0.6f, 4.3f)
                curveToRelative(0.2f, 0.8f, 0.6f, 1.6f, 1.1f, 2.3f)
                reflectiveCurveToRelative(1.2f, 1.3f, 1.9f, 1.7f)
                reflectiveCurveToRelative(1.6f, 0.7f, 2.4f, 0.8f)
                reflectiveCurveToRelative(1.7f, 0.0f, 2.5f, -0.3f)
                lineToRelative(0.5f, -0.2f)
                curveToRelative(15.5f, -7.3f, 32.4f, -11.2f, 49.5f, -11.3f)
                curveToRelative(62.8f, -0.6f, 97.2f, 44.0f, 107.6f, 62.3f)
                curveToRelative(-13.0f, -9.2f, -36.4f, -18.2f, -58.8f, -14.3f)
                curveToRelative(87.7f, 43.9f, 64.2f, 194.5f, -57.4f, 189.2f)
                curveToRelative(-59.5f, -2.6f, -97.1f, -51.0f, -100.5f, -90.8f)
                curveToRelative(0.0f, 0.0f, 11.2f, -41.9f, 80.6f, -41.9f)
                curveToRelative(7.5f, 0.0f, 28.9f, -20.9f, 29.3f, -27.0f)
                curveToRelative(-0.1f, -2.0f, -42.5f, -18.9f, -59.1f, -35.2f)
                curveToRelative(-8.8f, -8.7f, -13.1f, -12.9f, -16.8f, -16.1f)
                curveToRelative(-2.0f, -1.7f, -4.1f, -3.3f, -6.3f, -4.8f)
                curveToRelative(-5.6f, -19.5f, -5.8f, -40.0f, -0.7f, -59.6f)
                curveToRelative(-25.1f, 11.4f, -44.6f, 29.4f, -58.7f, 45.4f)
                lineToRelative(-0.1f, 0.0f)
                curveToRelative(-9.7f, -12.2f, -9.0f, -52.6f, -8.4f, -61.1f)
                curveToRelative(-0.1f, -0.5f, -7.2f, 3.7f, -8.2f, 4.3f)
                curveToRelative(-8.6f, 6.1f, -16.5f, 12.9f, -23.8f, 20.4f)
                curveToRelative(-16.3f, 16.6f, -44.1f, 50.2f, -55.5f, 101.2f)
                curveToRelative(-4.5f, 20.4f, -6.8f, 44.4f, -6.8f, 52.3f)
                curveToRelative(0.0f, 134.7f, 109.2f, 243.9f, 243.9f, 243.9f)
                curveToRelative(120.6f, 0.0f, 223.0f, -87.2f, 240.4f, -202.6f)
                curveToRelative(11.6f, -76.7f, -14.7f, -131.1f, -14.7f, -132.0f)
                close()
            }
        }
        .build()
        return _firefoxBrowser!!
    }

private var _firefoxBrowser: ImageVector? = null
