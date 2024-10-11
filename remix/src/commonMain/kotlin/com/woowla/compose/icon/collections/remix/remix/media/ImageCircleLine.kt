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

public val MediaGroup.ImageCircleLine: ImageVector
    get() {
        if (_imageCircleLine != null) {
            return _imageCircleLine!!
        }
        _imageCircleLine = Builder(name = "ImageCircleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.576f, 14.576f)
                lineTo(15.707f, 10.707f)
                curveTo(15.316f, 10.316f, 14.683f, 10.316f, 14.292f, 10.707f)
                lineTo(6.865f, 18.135f)
                curveTo(5.114f, 16.667f, 4.0f, 14.464f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                curveTo(20.0f, 12.901f, 19.851f, 13.768f, 19.576f, 14.576f)
                close()
                moveTo(8.589f, 19.239f)
                lineTo(15.0f, 12.828f)
                lineTo(18.638f, 16.467f)
                curveTo(17.199f, 18.6f, 14.761f, 20.0f, 12.0f, 20.0f)
                curveTo(10.778f, 20.0f, 9.623f, 19.727f, 8.589f, 19.239f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(11.0f, 10.0f)
                curveTo(11.0f, 11.105f, 10.105f, 12.0f, 9.0f, 12.0f)
                curveTo(7.895f, 12.0f, 7.0f, 11.105f, 7.0f, 10.0f)
                curveTo(7.0f, 8.895f, 7.895f, 8.0f, 9.0f, 8.0f)
                curveTo(10.105f, 8.0f, 11.0f, 8.895f, 11.0f, 10.0f)
                close()
            }
        }
        .build()
        return _imageCircleLine!!
    }

private var _imageCircleLine: ImageVector? = null
