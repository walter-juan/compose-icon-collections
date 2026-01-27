package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.GrinStars: ImageVector
    get() {
        if (_grinStars != null) {
            return _grinStars!!
        }
        _grinStars = Builder(name = "GrinStars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -114.6f, 256.0f, -256.0f)
                curveToRelative(0.0f, -24.4f, -3.4f, -48.1f, -9.8f, -70.5f)
                curveToRelative(18.6f, -36.1f, -2.7f, -83.6f, -46.7f, -90.0f)
                curveToRelative(-46.9f, -58.3f, -118.9f, -95.5f, -199.5f, -95.5f)
                reflectiveCurveTo(103.4f, 37.3f, 56.5f, 95.5f)
                curveToRelative(-44.0f, 6.4f, -65.3f, 53.9f, -46.7f, 90.0f)
                curveToRelative(-6.4f, 22.4f, -9.8f, 46.0f, -9.8f, 70.5f)
                curveToRelative(0.0f, 141.4f, 114.6f, 256.0f, 256.0f, 256.0f)
                close()
                moveTo(386.7f, 324.9f)
                curveToRelative(11.9f, -3.7f, 23.9f, 6.3f, 19.6f, 18.1f)
                curveToRelative(-22.4f, 61.3f, -81.3f, 105.1f, -150.3f, 105.1f)
                reflectiveCurveTo(128.1f, 404.2f, 105.7f, 342.9f)
                curveToRelative(-4.3f, -11.8f, 7.7f, -21.8f, 19.6f, -18.1f)
                curveToRelative(39.2f, 12.2f, 83.7f, 19.1f, 130.7f, 19.1f)
                reflectiveCurveToRelative(91.5f, -6.9f, 130.7f, -19.1f)
                close()
                moveTo(355.1f, 93.9f)
                curveToRelative(5.3f, -10.7f, 20.5f, -10.7f, 25.8f, 0.0f)
                lineToRelative(20.9f, 42.4f)
                lineToRelative(46.7f, 6.8f)
                curveToRelative(11.8f, 1.7f, 16.5f, 16.2f, 8.0f, 24.5f)
                lineToRelative(-33.8f, 33.0f)
                lineToRelative(8.0f, 46.6f)
                curveToRelative(2.0f, 11.7f, -10.3f, 20.7f, -20.9f, 15.2f)
                lineToRelative(-41.8f, -22.0f)
                lineToRelative(-41.8f, 22.0f)
                curveToRelative(-10.5f, 5.5f, -22.9f, -3.4f, -20.9f, -15.2f)
                lineToRelative(8.0f, -46.6f)
                lineToRelative(-33.8f, -33.0f)
                curveToRelative(-8.5f, -8.3f, -3.8f, -22.8f, 8.0f, -24.5f)
                lineToRelative(46.7f, -6.8f)
                lineToRelative(20.9f, -42.4f)
                close()
                moveTo(156.9f, 93.9f)
                lineToRelative(20.9f, 42.4f)
                lineToRelative(46.7f, 6.8f)
                curveToRelative(11.8f, 1.7f, 16.5f, 16.2f, 8.0f, 24.5f)
                lineToRelative(-33.8f, 33.0f)
                lineToRelative(8.0f, 46.6f)
                curveToRelative(2.0f, 11.7f, -10.3f, 20.7f, -20.9f, 15.2f)
                lineToRelative(-41.8f, -22.0f)
                lineToRelative(-41.8f, 22.0f)
                curveToRelative(-10.5f, 5.5f, -22.9f, -3.4f, -20.9f, -15.2f)
                lineToRelative(8.0f, -46.6f)
                lineToRelative(-33.8f, -33.0f)
                curveToRelative(-8.5f, -8.3f, -3.8f, -22.8f, 8.0f, -24.5f)
                lineToRelative(46.7f, -6.8f)
                lineToRelative(20.9f, -42.4f)
                curveToRelative(5.3f, -10.7f, 20.5f, -10.7f, 25.8f, 0.0f)
                close()
            }
        }
        .build()
        return _grinStars!!
    }

private var _grinStars: ImageVector? = null
