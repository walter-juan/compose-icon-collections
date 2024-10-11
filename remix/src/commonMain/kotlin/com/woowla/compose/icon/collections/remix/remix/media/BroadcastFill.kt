package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.BroadcastFill: ImageVector
    get() {
        if (_broadcastFill != null) {
            return _broadcastFill!!
        }
        _broadcastFill = Builder(name = "BroadcastFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 2.929f)
                lineTo(6.343f, 4.343f)
                curveTo(4.895f, 5.791f, 4.0f, 7.791f, 4.0f, 10.0f)
                curveTo(4.0f, 12.209f, 4.895f, 14.209f, 6.343f, 15.657f)
                lineTo(4.929f, 17.071f)
                curveTo(3.119f, 15.261f, 2.0f, 12.761f, 2.0f, 10.0f)
                curveTo(2.0f, 7.239f, 3.119f, 4.739f, 4.929f, 2.929f)
                close()
                moveTo(19.071f, 2.929f)
                curveTo(20.881f, 4.739f, 22.0f, 7.239f, 22.0f, 10.0f)
                curveTo(22.0f, 12.761f, 20.881f, 15.261f, 19.071f, 17.071f)
                lineTo(17.657f, 15.657f)
                curveTo(19.105f, 14.209f, 20.0f, 12.209f, 20.0f, 10.0f)
                curveTo(20.0f, 7.791f, 19.105f, 5.791f, 17.657f, 4.343f)
                lineTo(19.071f, 2.929f)
                close()
                moveTo(7.757f, 5.757f)
                lineTo(9.172f, 7.172f)
                curveTo(8.448f, 7.895f, 8.0f, 8.895f, 8.0f, 10.0f)
                curveTo(8.0f, 11.105f, 8.448f, 12.105f, 9.172f, 12.828f)
                lineTo(7.757f, 14.243f)
                curveTo(6.672f, 13.157f, 6.0f, 11.657f, 6.0f, 10.0f)
                curveTo(6.0f, 8.343f, 6.672f, 6.843f, 7.757f, 5.757f)
                close()
                moveTo(16.243f, 5.757f)
                curveTo(17.328f, 6.843f, 18.0f, 8.343f, 18.0f, 10.0f)
                curveTo(18.0f, 11.657f, 17.328f, 13.157f, 16.243f, 14.243f)
                lineTo(14.828f, 12.828f)
                curveTo(15.552f, 12.105f, 16.0f, 11.105f, 16.0f, 10.0f)
                curveTo(16.0f, 8.895f, 15.552f, 7.895f, 14.828f, 7.172f)
                lineTo(16.243f, 5.757f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(10.895f, 12.0f, 10.0f, 11.105f, 10.0f, 10.0f)
                curveTo(10.0f, 8.895f, 10.895f, 8.0f, 12.0f, 8.0f)
                curveTo(13.105f, 8.0f, 14.0f, 8.895f, 14.0f, 10.0f)
                curveTo(14.0f, 11.105f, 13.105f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(12.58f, 14.0f, 13.077f, 14.413f, 13.184f, 14.983f)
                lineTo(14.5f, 22.0f)
                horizontalLineTo(9.5f)
                lineTo(10.816f, 14.983f)
                curveTo(10.923f, 14.413f, 11.42f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _broadcastFill!!
    }

private var _broadcastFill: ImageVector? = null
