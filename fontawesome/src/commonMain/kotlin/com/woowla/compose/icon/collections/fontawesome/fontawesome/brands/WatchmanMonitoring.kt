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

public val BrandsGroup.WatchmanMonitoring: ImageVector
    get() {
        if (_watchmanMonitoring != null) {
            return _watchmanMonitoring!!
        }
        _watchmanMonitoring = Builder(name = "WatchmanMonitoring", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 16.0f)
                arcToRelative(240.0f, 240.0f, 0.0f, true, false, 0.0f, 480.0f)
                arcToRelative(240.0f, 240.0f, 0.0f, true, false, 0.0f, -480.0f)
                close()
                moveTo(121.7f, 429.1f)
                curveToRelative(-51.6f, -40.2f, -84.9f, -102.8f, -84.9f, -173.1f)
                curveToRelative(0.0f, -21.7f, 3.2f, -43.3f, 9.6f, -64.1f)
                lineToRelative(102.9f, -17.9f)
                lineToRelative(-0.1f, 11.0f)
                lineToRelative(-13.9f, 2.0f)
                reflectiveCurveToRelative(-0.1f, 12.5f, -0.1f, 19.5f)
                curveToRelative(0.0f, 2.0f, 0.4f, 4.0f, 1.2f, 5.8f)
                reflectiveCurveToRelative(2.1f, 3.4f, 3.7f, 4.6f)
                lineToRelative(9.5f, 7.4f)
                lineToRelative(-27.7f, 204.9f)
                close()
                moveTo(227.4f, 145.9f)
                lineToRelative(8.5f, -7.6f)
                reflectiveCurveToRelative(6.9f, -5.4f, -0.1f, -9.3f)
                curveToRelative(-7.2f, -4.0f, -39.5f, -34.5f, -39.5f, -34.5f)
                curveToRelative(-5.3f, -5.5f, -8.3f, -7.3f, -15.5f, 0.0f)
                curveToRelative(0.0f, 0.0f, -32.3f, 30.5f, -39.5f, 34.5f)
                curveToRelative(-7.1f, 4.0f, -0.1f, 9.3f, -0.1f, 9.3f)
                lineToRelative(8.5f, 7.6f)
                lineToRelative(0.0f, 4.4f)
                lineToRelative(-73.5f, -19.2f)
                curveToRelative(39.6f, -56.9f, 105.5f, -94.3f, 180.0f, -94.3f)
                curveToRelative(31.3f, 0.0f, 62.2f, 6.7f, 90.6f, 19.6f)
                reflectiveCurveToRelative(53.8f, 31.8f, 74.3f, 55.4f)
                lineToRelative(-193.5f, 37.7f)
                lineToRelative(0.0f, -3.6f)
                close()
                moveTo(261.5f, 475.2f)
                lineToRelative(-33.9f, -250.9f)
                lineToRelative(9.5f, -7.4f)
                curveToRelative(1.6f, -1.2f, 2.8f, -2.8f, 3.7f, -4.6f)
                reflectiveCurveToRelative(1.3f, -3.8f, 1.2f, -5.8f)
                curveToRelative(0.0f, -7.0f, -0.1f, -19.5f, -0.1f, -19.5f)
                lineToRelative(-13.9f, -2.0f)
                lineToRelative(-0.1f, -10.5f)
                lineToRelative(241.7f, 31.4f)
                curveToRelative(3.9f, 16.4f, 5.8f, 33.3f, 5.8f, 50.1f)
                curveToRelative(0.0f, 119.1f, -95.4f, 216.2f, -213.8f, 219.1f)
                close()
            }
        }
        .build()
        return _watchmanMonitoring!!
    }

private var _watchmanMonitoring: ImageVector? = null
