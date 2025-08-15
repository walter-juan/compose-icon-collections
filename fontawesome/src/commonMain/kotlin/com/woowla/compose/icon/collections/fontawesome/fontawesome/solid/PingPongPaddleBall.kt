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

public val SolidGroup.PingPongPaddleBall: ImageVector
    get() {
        if (_pingPongPaddleBall != null) {
            return _pingPongPaddleBall!!
        }
        _pingPongPaddleBall = Builder(name = "PingPongPaddleBall", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.0f, 127.0f)
                lineToRelative(67.4f, -67.4f)
                curveToRelative(38.2f, -38.2f, 90.0f, -59.6f, 144.0f, -59.6f)
                curveToRelative(112.5f, 0.0f, 203.7f, 91.2f, 203.7f, 203.6f)
                curveToRelative(0.0f, 46.4f, -15.8f, 91.1f, -44.5f, 127.0f)
                curveToRelative(-23.6f, -16.8f, -52.4f, -26.7f, -83.5f, -26.7f)
                curveToRelative(-31.1f, 0.0f, -59.9f, 9.9f, -83.4f, 26.6f)
                lineTo(97.0f, 127.0f)
                close()
                moveTo(240.0f, 448.0f)
                curveToRelative(0.0f, 9.7f, 1.0f, 19.1f, 2.8f, 28.2f)
                curveToRelative(-19.8f, -5.2f, -38.0f, -15.5f, -52.7f, -30.2f)
                curveToRelative(-12.2f, -12.2f, -31.9f, -12.2f, -44.1f, 0.0f)
                lineTo(96.6f, 495.4f)
                curveToRelative(-10.6f, 10.6f, -25.0f, 16.6f, -40.0f, 16.6f)
                curveToRelative(-31.2f, 0.0f, -56.6f, -25.3f, -56.6f, -56.6f)
                curveToRelative(0.0f, -15.0f, 6.0f, -29.4f, 16.6f, -40.0f)
                lineToRelative(49.4f, -49.4f)
                curveToRelative(12.2f, -12.2f, 12.2f, -31.9f, 0.0f, -44.1f)
                curveToRelative(-21.7f, -21.7f, -33.9f, -51.2f, -33.9f, -81.9f)
                curveToRelative(0.0f, -29.4f, 11.1f, -57.6f, 31.1f, -79.0f)
                lineTo(266.6f, 364.6f)
                curveTo(249.9f, 388.1f, 240.0f, 416.9f, 240.0f, 448.0f)
                close()
                moveTo(384.0f, 352.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, 192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, -192.0f)
                close()
            }
        }
        .build()
        return _pingPongPaddleBall!!
    }

private var _pingPongPaddleBall: ImageVector? = null
