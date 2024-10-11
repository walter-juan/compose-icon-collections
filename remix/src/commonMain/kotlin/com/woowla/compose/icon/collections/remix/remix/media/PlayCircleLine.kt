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

public val MediaGroup.PlayCircleLine: ImageVector
    get() {
        if (_playCircleLine != null) {
            return _playCircleLine!!
        }
        _playCircleLine = Builder(name = "PlayCircleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(10.622f, 8.415f)
                lineTo(15.501f, 11.667f)
                curveTo(15.685f, 11.79f, 15.734f, 12.038f, 15.612f, 12.222f)
                curveTo(15.582f, 12.266f, 15.545f, 12.304f, 15.501f, 12.333f)
                lineTo(10.622f, 15.585f)
                curveTo(10.438f, 15.708f, 10.19f, 15.658f, 10.067f, 15.474f)
                curveTo(10.023f, 15.409f, 10.0f, 15.332f, 10.0f, 15.253f)
                verticalLineTo(8.747f)
                curveTo(10.0f, 8.526f, 10.179f, 8.347f, 10.4f, 8.347f)
                curveTo(10.479f, 8.347f, 10.556f, 8.371f, 10.622f, 8.415f)
                close()
            }
        }
        .build()
        return _playCircleLine!!
    }

private var _playCircleLine: ImageVector? = null
