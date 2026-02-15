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

public val SolidGroup.Pisces: ImageVector
    get() {
        if (_pisces != null) {
            return _pisces!!
        }
        _pisces = Builder(name = "Pisces", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.4f, 10.4f)
                curveToRelative(11.9f, -13.0f, 32.2f, -13.9f, 45.2f, -2.0f)
                curveToRelative(2.9f, 2.7f, 28.3f, 26.7f, 53.6f, 67.8f)
                curveToRelative(22.3f, 36.2f, 45.0f, 86.6f, 51.1f, 147.8f)
                lineToRelative(67.3f, 0.0f)
                curveToRelative(6.1f, -61.1f, 28.8f, -111.6f, 51.1f, -147.8f)
                curveToRelative(25.3f, -41.1f, 50.7f, -65.1f, 53.6f, -67.8f)
                curveToRelative(13.0f, -11.9f, 33.3f, -11.1f, 45.2f, 2.0f)
                curveToRelative(11.9f, 13.0f, 11.0f, 33.3f, -2.0f, 45.2f)
                curveToRelative(-1.4f, 1.3f, -22.0f, 21.1f, -42.4f, 54.2f)
                curveToRelative(-17.9f, 29.1f, -35.4f, 68.0f, -41.2f, 114.2f)
                lineToRelative(94.0f, 0.0f)
                lineToRelative(3.3f, 0.2f)
                curveToRelative(16.1f, 1.6f, 28.7f, 15.3f, 28.7f, 31.8f)
                reflectiveCurveToRelative(-12.6f, 30.2f, -28.7f, 31.8f)
                lineToRelative(-3.3f, 0.2f)
                lineToRelative(-94.0f, 0.0f)
                curveToRelative(5.8f, 46.2f, 23.3f, 85.1f, 41.2f, 114.2f)
                curveToRelative(20.4f, 33.1f, 41.0f, 52.9f, 42.4f, 54.2f)
                curveToRelative(13.0f, 11.9f, 13.9f, 32.2f, 2.0f, 45.2f)
                curveToRelative(-11.9f, 13.0f, -32.2f, 13.9f, -45.2f, 2.0f)
                curveToRelative(-2.9f, -2.7f, -28.3f, -26.7f, -53.6f, -67.8f)
                curveToRelative(-22.3f, -36.2f, -45.0f, -86.6f, -51.1f, -147.8f)
                lineToRelative(-67.3f, 0.0f)
                curveToRelative(-6.1f, 61.1f, -28.8f, 111.6f, -51.1f, 147.8f)
                curveToRelative(-25.3f, 41.1f, -50.7f, 65.1f, -53.6f, 67.8f)
                curveToRelative(-13.0f, 11.9f, -33.3f, 11.1f, -45.2f, -2.0f)
                curveToRelative(-11.9f, -13.0f, -11.0f, -33.3f, 2.0f, -45.2f)
                curveToRelative(1.4f, -1.3f, 22.0f, -21.1f, 42.4f, -54.2f)
                curveToRelative(17.9f, -29.1f, 35.4f, -68.0f, 41.2f, -114.2f)
                lineToRelative(-94.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(94.0f, 0.0f)
                curveToRelative(-5.8f, -46.2f, -23.3f, -85.1f, -41.2f, -114.2f)
                curveToRelative(-20.4f, -33.1f, -41.0f, -52.9f, -42.4f, -54.2f)
                curveToRelative(-13.0f, -11.9f, -13.9f, -32.2f, -2.0f, -45.2f)
                close()
            }
        }
        .build()
        return _pisces!!
    }

private var _pisces: ImageVector? = null
