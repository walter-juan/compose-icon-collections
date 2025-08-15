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

public val BrandsGroup.Waze: ImageVector
    get() {
        if (_waze != null) {
            return _waze!!
        }
        _waze = Builder(name = "Waze", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.6f, 201.7f)
                curveToRelative(14.5f, 85.9f, -30.9f, 167.9f, -113.2f, 208.1f)
                curveToRelative(13.0f, 34.1f, -12.4f, 70.2f, -48.3f, 70.2f)
                curveToRelative(-13.2f, 0.0f, -26.0f, -5.1f, -35.6f, -14.2f)
                reflectiveCurveToRelative(-15.3f, -21.6f, -16.0f, -34.8f)
                curveToRelative(-6.4f, 0.2f, -64.2f, 0.0f, -76.3f, -0.6f)
                curveToRelative(-0.3f, 6.8f, -1.9f, 13.5f, -4.7f, 19.6f)
                reflectiveCurveToRelative(-6.9f, 11.7f, -11.9f, 16.3f)
                reflectiveCurveToRelative(-10.8f, 8.2f, -17.2f, 10.5f)
                reflectiveCurveToRelative(-13.2f, 3.4f, -19.9f, 3.1f)
                curveToRelative(-33.9f, -1.4f, -58.0f, -34.8f, -47.0f, -67.9f)
                curveToRelative(-37.2f, -13.1f, -72.5f, -34.9f, -99.6f, -70.8f)
                curveToRelative(-13.0f, -17.3f, -0.5f, -41.8f, 20.8f, -41.8f)
                curveToRelative(46.3f, 0.0f, 32.2f, -54.2f, 43.2f, -110.3f)
                curveToRelative(18.4f, -93.9f, 116.8f, -157.1f, 211.7f, -157.1f)
                curveToRelative(102.5f, 0.0f, 197.2f, 70.7f, 214.1f, 169.7f)
                close()
                moveTo(373.9f, 388.3f)
                curveToRelative(42.0f, -19.2f, 81.3f, -56.7f, 96.3f, -102.1f)
                curveToRelative(40.5f, -123.1f, -64.2f, -228.0f, -181.7f, -228.0f)
                curveToRelative(-83.4f, 0.0f, -170.3f, 55.4f, -186.1f, 136.0f)
                curveToRelative(-9.5f, 48.9f, 5.0f, 131.4f, -68.7f, 131.4f)
                curveToRelative(24.9f, 33.1f, 58.3f, 52.6f, 93.7f, 64.0f)
                curveToRelative(24.7f, -21.8f, 63.9f, -15.5f, 79.8f, 14.3f)
                curveToRelative(14.2f, 1.0f, 79.2f, 1.2f, 87.9f, 0.8f)
                curveToRelative(3.5f, -6.9f, 8.5f, -12.9f, 14.7f, -17.5f)
                reflectiveCurveToRelative(13.2f, -7.9f, 20.8f, -9.5f)
                reflectiveCurveToRelative(15.4f, -1.4f, 22.9f, 0.4f)
                reflectiveCurveToRelative(14.5f, 5.3f, 20.5f, 10.2f)
                close()
                moveTo(205.5f, 187.1f)
                curveToRelative(0.0f, -34.7f, 50.8f, -34.7f, 50.8f, 0.0f)
                reflectiveCurveToRelative(-50.8f, 34.7f, -50.8f, 0.0f)
                close()
                moveTo(322.1f, 187.1f)
                curveToRelative(0.0f, -34.7f, 50.9f, -34.7f, 50.9f, 0.0f)
                reflectiveCurveToRelative(-50.9f, 34.8f, -50.9f, 0.0f)
                close()
                moveTo(199.5f, 257.8f)
                curveToRelative(-3.4f, -16.9f, 22.2f, -22.2f, 25.6f, -5.2f)
                lineToRelative(0.1f, 0.3f)
                curveToRelative(4.1f, 21.4f, 29.8f, 44.0f, 64.1f, 43.1f)
                curveToRelative(35.7f, -0.9f, 59.3f, -22.2f, 64.1f, -42.8f)
                curveToRelative(4.5f, -16.1f, 28.6f, -10.4f, 25.5f, 6.0f)
                curveToRelative(-5.2f, 22.2f, -31.2f, 62.0f, -91.5f, 62.9f)
                curveToRelative(-42.6f, 0.0f, -80.9f, -27.8f, -87.9f, -64.2f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _waze!!
    }

private var _waze: ImageVector? = null
