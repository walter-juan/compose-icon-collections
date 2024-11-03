package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(8.543f, 3.948f)
                lineToRelative(1.316f, 1.316f)
                lineTo(8.543f, 6.58f)
                close()
                moveTo(8.543f, 12.052f)
                lineTo(9.859f, 10.736f)
                lineTo(8.543f, 9.42f)
                close()
                moveTo(7.133f, 8.009f)
                lineTo(4.275f, 5.133f)
                lineToRelative(0.827f, -0.827f)
                lineTo(7.377f, 6.58f)
                lineTo(7.377f, 1.128f)
                lineToRelative(4.137f, 4.136f)
                lineTo(8.787f, 8.01f)
                lineToRelative(2.745f, 2.745f)
                lineToRelative(-4.136f, 4.137f)
                lineTo(7.396f, 9.42f)
                lineToRelative(-2.294f, 2.274f)
                lineToRelative(-0.827f, -0.827f)
                close()
                moveTo(7.903f, 16.0f)
                curveToRelative(3.498f, 0.0f, 5.904f, -1.655f, 5.904f, -8.01f)
                curveToRelative(0.0f, -6.335f, -2.406f, -7.99f, -5.903f, -7.99f)
                reflectiveCurveTo(2.0f, 1.655f, 2.0f, 8.01f)
                curveTo(2.0f, 14.344f, 4.407f, 16.0f, 7.904f, 16.0f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
