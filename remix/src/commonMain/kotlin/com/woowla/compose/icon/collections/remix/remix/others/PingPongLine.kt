package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.PingPongLine: ImageVector
    get() {
        if (_pingPongLine != null) {
            return _pingPongLine!!
        }
        _pingPongLine = Builder(name = "PingPongLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 2.0f)
                curveTo(16.747f, 2.0f, 21.0f, 6.253f, 21.0f, 11.5f)
                curveTo(21.0f, 13.029f, 20.639f, 14.474f, 19.997f, 15.754f)
                lineTo(22.46f, 18.218f)
                curveTo(22.851f, 18.608f, 22.851f, 19.241f, 22.46f, 19.632f)
                lineTo(19.632f, 22.46f)
                curveTo(19.241f, 22.851f, 18.608f, 22.851f, 18.218f, 22.46f)
                lineTo(15.754f, 19.997f)
                curveTo(14.474f, 20.639f, 13.029f, 21.0f, 11.5f, 21.0f)
                curveTo(6.253f, 21.0f, 2.0f, 16.747f, 2.0f, 11.5f)
                curveTo(2.0f, 6.253f, 6.253f, 2.0f, 11.5f, 2.0f)
                close()
                moveTo(16.803f, 15.388f)
                lineTo(15.389f, 16.802f)
                lineTo(18.925f, 20.337f)
                lineTo(20.339f, 18.923f)
                lineTo(16.803f, 15.388f)
                close()
                moveTo(18.667f, 9.283f)
                lineTo(9.283f, 18.667f)
                curveTo(9.984f, 18.883f, 10.728f, 19.0f, 11.5f, 19.0f)
                curveTo(12.467f, 19.0f, 13.391f, 18.817f, 14.24f, 18.484f)
                lineTo(13.268f, 17.51f)
                curveTo(12.877f, 17.12f, 12.877f, 16.487f, 13.268f, 16.096f)
                lineTo(16.096f, 13.268f)
                curveTo(16.487f, 12.877f, 17.12f, 12.877f, 17.51f, 13.268f)
                lineTo(18.484f, 14.24f)
                curveTo(18.817f, 13.391f, 19.0f, 12.467f, 19.0f, 11.5f)
                curveTo(19.0f, 10.728f, 18.883f, 9.984f, 18.667f, 9.283f)
                close()
                moveTo(11.5f, 4.0f)
                curveTo(7.358f, 4.0f, 4.0f, 7.358f, 4.0f, 11.5f)
                curveTo(4.0f, 14.113f, 5.337f, 16.415f, 7.364f, 17.757f)
                lineTo(17.757f, 7.364f)
                curveTo(16.415f, 5.337f, 14.113f, 4.0f, 11.5f, 4.0f)
                close()
            }
        }
        .build()
        return _pingPongLine!!
    }

private var _pingPongLine: ImageVector? = null
