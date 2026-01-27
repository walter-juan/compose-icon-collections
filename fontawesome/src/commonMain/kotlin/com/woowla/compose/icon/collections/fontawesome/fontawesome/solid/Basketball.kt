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

public val SolidGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.7f, 58.8f)
                lineToRelative(78.4f, 78.4f)
                curveToRelative(18.2f, -25.0f, 28.9f, -55.9f, 28.9f, -89.2f)
                curveToRelative(0.0f, -14.1f, -1.9f, -27.7f, -5.5f, -40.6f)
                curveToRelative(-38.0f, 9.4f, -72.6f, 27.2f, -101.8f, 51.4f)
                close()
                moveTo(58.8f, 92.7f)
                curveToRelative(-24.2f, 29.2f, -42.0f, 63.8f, -51.4f, 101.8f)
                curveToRelative(12.9f, 3.6f, 26.5f, 5.5f, 40.6f, 5.5f)
                curveToRelative(33.3f, 0.0f, 64.1f, -10.7f, 89.2f, -28.9f)
                lineTo(58.8f, 92.7f)
                close()
                moveTo(256.0f, 0.0f)
                curveToRelative(-4.6f, 0.0f, -9.2f, 0.1f, -13.7f, 0.4f)
                curveToRelative(3.7f, 15.3f, 5.7f, 31.2f, 5.7f, 47.6f)
                curveToRelative(0.0f, 46.6f, -15.9f, 89.4f, -42.6f, 123.4f)
                lineTo(256.0f, 222.1f)
                lineTo(419.3f, 58.8f)
                curveTo(374.9f, 22.1f, 318.1f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(48.0f, 248.0f)
                curveToRelative(-16.4f, 0.0f, -32.4f, -2.0f, -47.6f, -5.7f)
                curveToRelative(-0.2f, 4.5f, -0.4f, 9.1f, -0.4f, 13.7f)
                curveToRelative(0.0f, 62.1f, 22.1f, 118.9f, 58.8f, 163.3f)
                lineTo(222.1f, 256.0f)
                lineTo(171.4f, 205.4f)
                curveTo(137.4f, 232.1f, 94.6f, 248.0f, 48.0f, 248.0f)
                close()
                moveTo(511.6f, 269.7f)
                curveToRelative(0.2f, -4.5f, 0.4f, -9.1f, 0.4f, -13.7f)
                curveToRelative(0.0f, -62.1f, -22.1f, -118.9f, -58.8f, -163.3f)
                lineTo(289.9f, 256.0f)
                lineTo(340.6f, 306.6f)
                curveToRelative(34.0f, -26.7f, 76.9f, -42.6f, 123.4f, -42.6f)
                curveToRelative(16.4f, 0.0f, 32.4f, 2.0f, 47.6f, 5.7f)
                close()
                moveTo(504.5f, 317.5f)
                curveToRelative(-12.9f, -3.6f, -26.5f, -5.5f, -40.6f, -5.5f)
                curveToRelative(-33.3f, 0.0f, -64.1f, 10.7f, -89.2f, 28.9f)
                lineToRelative(78.4f, 78.4f)
                curveToRelative(24.2f, -29.2f, 42.0f, -63.8f, 51.4f, -101.8f)
                close()
                moveTo(340.9f, 374.8f)
                curveToRelative(-18.2f, 25.0f, -28.9f, 55.9f, -28.9f, 89.2f)
                curveToRelative(0.0f, 14.1f, 1.9f, 27.7f, 5.5f, 40.6f)
                curveToRelative(38.0f, -9.4f, 72.6f, -27.2f, 101.8f, -51.4f)
                lineToRelative(-78.4f, -78.4f)
                close()
                moveTo(306.6f, 340.5f)
                lineTo(256.0f, 289.9f)
                lineTo(92.7f, 453.2f)
                curveToRelative(44.3f, 36.7f, 101.2f, 58.8f, 163.3f, 58.8f)
                curveToRelative(4.6f, 0.0f, 9.2f, -0.1f, 13.7f, -0.4f)
                curveToRelative(-3.7f, -15.3f, -5.7f, -31.2f, -5.7f, -47.6f)
                curveToRelative(0.0f, -46.6f, 15.9f, -89.4f, 42.6f, -123.4f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
