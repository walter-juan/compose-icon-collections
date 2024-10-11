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

public val MediaGroup.VideoOffFill: ImageVector
    get() {
        if (_videoOffFill != null) {
            return _videoOffFill!!
        }
        _videoOffFill = Builder(name = "VideoOffFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(16.0f, 4.0f)
                horizontalLineTo(8.214f)
                lineTo(22.708f, 18.494f)
                curveTo(22.881f, 18.415f, 23.0f, 18.242f, 23.0f, 18.04f)
                verticalLineTo(5.96f)
                curveTo(23.0f, 5.858f, 22.968f, 5.758f, 22.91f, 5.674f)
                curveTo(22.751f, 5.447f, 22.44f, 5.392f, 22.213f, 5.551f)
                lineTo(17.0f, 9.2f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 4.448f, 16.552f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _videoOffFill!!
    }

private var _videoOffFill: ImageVector? = null
