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

public val MediaGroup.VideoOffLine: ImageVector
    get() {
        if (_videoOffLine != null) {
            return _videoOffLine!!
        }
        _videoOffLine = Builder(name = "VideoOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.414f)
                lineTo(21.192f, 22.607f)
                lineTo(22.607f, 21.192f)
                lineTo(2.808f, 1.393f)
                lineTo(1.393f, 2.808f)
                lineTo(2.586f, 4.0f)
                horizontalLineTo(2.0f)
                curveTo(1.448f, 4.0f, 1.0f, 4.448f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 19.552f, 1.448f, 20.0f, 2.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 20.0f, 17.0f, 19.552f, 17.0f, 19.0f)
                verticalLineTo(18.414f)
                close()
                moveTo(15.0f, 16.414f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.586f)
                lineTo(15.0f, 16.414f)
                close()
                moveTo(23.0f, 18.04f)
                curveTo(23.0f, 18.252f, 22.875f, 18.418f, 22.708f, 18.494f)
                lineTo(21.0f, 16.786f)
                verticalLineTo(8.841f)
                lineTo(17.0f, 11.641f)
                verticalLineTo(12.786f)
                lineTo(15.0f, 10.786f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.214f)
                lineTo(8.214f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 4.0f, 17.0f, 4.448f, 17.0f, 5.0f)
                verticalLineTo(9.2f)
                lineTo(22.213f, 5.551f)
                curveTo(22.545f, 5.319f, 23.0f, 5.556f, 23.0f, 5.96f)
                verticalLineTo(18.04f)
                close()
            }
        }
        .build()
        return _videoOffLine!!
    }

private var _videoOffLine: ImageVector? = null
