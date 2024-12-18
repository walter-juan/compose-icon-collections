package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Socket: ImageVector
    get() {
        if (_socket != null) {
            return _socket!!
        }
        _socket = Builder(name = "Socket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.93f, 11.171f)
                curveToRelative(0.0f, 5.92f, 3.778f, 10.957f, 9.063f, 12.829f)
                arcToRelative(13.652f, 13.652f, 0.0f, false, false, 6.513f, -4.89f)
                arcToRelative(13.497f, 13.497f, 0.0f, false, false, 2.564f, -7.939f)
                lineTo(21.07f, 3.274f)
                lineTo(11.997f, 0.0f)
                lineTo(2.933f, 3.274f)
                verticalLineToRelative(7.897f)
                close()
                moveTo(10.421f, 5.081f)
                horizontalLineToRelative(4.208f)
                lineTo(13.34f, 9.47f)
                horizontalLineToRelative(2.292f)
                lineToRelative(-6.264f, 9.446f)
                lineToRelative(1.486f, -6.858f)
                lineTo(8.365f, 12.058f)
                close()
            }
        }
        .build()
        return _socket!!
    }

private var _socket: ImageVector? = null
