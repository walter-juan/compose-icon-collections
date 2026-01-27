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

public val BrandsGroup.Bitcoin: ImageVector
    get() {
        if (_bitcoin != null) {
            return _bitcoin!!
        }
        _bitcoin = Builder(name = "Bitcoin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 256.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, true, 496.0f, 0.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, true, -496.0f, 0.0f)
                close()
                moveTo(362.3f, 220.7f)
                curveToRelative(4.9f, -33.0f, -20.2f, -50.7f, -54.6f, -62.6f)
                lineToRelative(11.1f, -44.7f)
                lineToRelative(-27.2f, -6.8f)
                lineToRelative(-10.9f, 43.5f)
                curveToRelative(-7.2f, -1.8f, -14.5f, -3.5f, -21.8f, -5.1f)
                lineToRelative(10.9f, -43.8f)
                lineToRelative(-27.2f, -6.8f)
                lineToRelative(-11.2f, 44.7f)
                curveToRelative(-5.9f, -1.3f, -11.7f, -2.7f, -17.4f, -4.1f)
                lineToRelative(0.0f, -0.1f)
                lineToRelative(-37.5f, -9.4f)
                lineToRelative(-7.2f, 29.1f)
                reflectiveCurveToRelative(20.2f, 4.6f, 19.8f, 4.9f)
                curveToRelative(11.0f, 2.8f, 13.0f, 10.0f, 12.7f, 15.8f)
                lineToRelative(-12.7f, 50.9f)
                curveToRelative(0.8f, 0.2f, 1.7f, 0.5f, 2.8f, 0.9f)
                curveToRelative(-0.9f, -0.2f, -1.9f, -0.5f, -2.9f, -0.7f)
                lineToRelative(-17.8f, 71.3f)
                curveToRelative(-1.3f, 3.3f, -4.8f, 8.4f, -12.5f, 6.5f)
                curveToRelative(0.3f, 0.4f, -19.8f, -4.9f, -19.8f, -4.9f)
                lineToRelative(-13.5f, 31.1f)
                lineToRelative(35.4f, 8.8f)
                curveToRelative(6.6f, 1.7f, 13.0f, 3.4f, 19.4f, 5.0f)
                lineToRelative(-11.3f, 45.2f)
                lineToRelative(27.2f, 6.8f)
                lineToRelative(11.2f, -44.7f)
                curveToRelative(7.2f, 2.0f, 14.4f, 3.8f, 21.7f, 5.6f)
                lineToRelative(-11.1f, 44.5f)
                lineToRelative(27.2f, 6.8f)
                lineToRelative(11.3f, -45.1f)
                curveToRelative(46.4f, 8.8f, 81.3f, 5.2f, 96.0f, -36.7f)
                curveToRelative(11.8f, -33.8f, -0.6f, -53.3f, -25.0f, -66.0f)
                curveToRelative(17.8f, -4.1f, 31.2f, -15.8f, 34.7f, -39.9f)
                close()
                moveTo(300.1f, 307.9f)
                curveToRelative(-8.4f, 33.8f, -65.3f, 15.5f, -83.8f, 10.9f)
                lineToRelative(14.9f, -59.9f)
                curveToRelative(18.4f, 4.6f, 77.6f, 13.7f, 68.8f, 49.0f)
                close()
                moveTo(308.5f, 220.2f)
                curveToRelative(-7.7f, 30.7f, -55.0f, 15.1f, -70.4f, 11.3f)
                lineToRelative(13.5f, -54.3f)
                curveToRelative(15.4f, 3.8f, 64.8f, 11.0f, 56.8f, 43.0f)
                close()
            }
        }
        .build()
        return _bitcoin!!
    }

private var _bitcoin: ImageVector? = null
