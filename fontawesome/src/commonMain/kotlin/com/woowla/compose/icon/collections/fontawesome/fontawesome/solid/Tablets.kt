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

public val SolidGroup.Tablets: ImageVector
    get() {
        if (_tablets != null) {
            return _tablets!!
        }
        _tablets = Builder(name = "Tablets", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(495.3f, 76.6f)
                curveToRelative(-4.6f, -8.7f, -16.3f, -9.7f, -23.3f, -2.7f)
                lineTo(297.9f, 248.0f)
                curveToRelative(-7.0f, 7.0f, -6.0f, 18.7f, 2.7f, 23.3f)
                curveToRelative(20.1f, 10.7f, 43.0f, 16.7f, 67.4f, 16.7f)
                curveToRelative(79.5f, 0.0f, 144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -24.3f, -6.0f, -47.3f, -16.7f, -67.4f)
                close()
                moveTo(240.7f, 211.4f)
                curveToRelative(4.6f, 8.7f, 16.3f, 9.7f, 23.3f, 2.7f)
                lineTo(438.1f, 40.0f)
                curveToRelative(7.0f, -7.0f, 6.0f, -18.7f, -2.7f, -23.3f)
                curveToRelative(-20.1f, -10.7f, -43.0f, -16.7f, -67.4f, -16.7f)
                curveToRelative(-79.5f, 0.0f, -144.0f, 64.5f, -144.0f, 144.0f)
                curveToRelative(0.0f, 24.3f, 6.0f, 47.3f, 16.7f, 67.4f)
                close()
                moveTo(144.0f, 224.0f)
                curveTo(79.2f, 224.0f, 24.4f, 266.8f, 6.3f, 325.6f)
                curveTo(3.4f, 335.1f, 11.0f, 344.0f, 20.9f, 344.0f)
                lineToRelative(246.2f, 0.0f)
                curveToRelative(9.9f, 0.0f, 17.5f, -8.9f, 14.6f, -18.4f)
                curveToRelative(-0.9f, -3.0f, -1.9f, -5.9f, -3.0f, -8.7f)
                curveToRelative(-37.4f, -18.1f, -68.0f, -48.0f, -87.0f, -84.8f)
                curveToRelative(-14.9f, -5.2f, -30.9f, -8.1f, -47.6f, -8.1f)
                close()
                moveTo(281.7f, 410.4f)
                curveToRelative(2.9f, -9.5f, -4.7f, -18.4f, -14.6f, -18.4f)
                lineTo(20.9f, 392.0f)
                curveTo(11.0f, 392.0f, 3.4f, 400.9f, 6.3f, 410.4f)
                curveTo(24.4f, 469.2f, 79.2f, 512.0f, 144.0f, 512.0f)
                reflectiveCurveToRelative(119.6f, -42.8f, 137.7f, -101.6f)
                close()
            }
        }
        .build()
        return _tablets!!
    }

private var _tablets: ImageVector? = null
