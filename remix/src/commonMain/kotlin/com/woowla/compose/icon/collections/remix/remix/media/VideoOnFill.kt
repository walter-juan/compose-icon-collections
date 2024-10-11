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

public val MediaGroup.VideoOnFill: ImageVector
    get() {
        if (_videoOnFill != null) {
            return _videoOnFill!!
        }
        _videoOnFill = Builder(name = "VideoOnFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.2f)
                lineTo(22.213f, 5.551f)
                curveTo(22.44f, 5.392f, 22.751f, 5.447f, 22.91f, 5.674f)
                curveTo(22.968f, 5.758f, 23.0f, 5.858f, 23.0f, 5.96f)
                verticalLineTo(18.04f)
                curveTo(23.0f, 18.316f, 22.776f, 18.54f, 22.5f, 18.54f)
                curveTo(22.397f, 18.54f, 22.297f, 18.508f, 22.213f, 18.449f)
                lineTo(17.0f, 14.8f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.552f, 16.552f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(2.0f)
                curveTo(1.448f, 20.0f, 1.0f, 19.552f, 1.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 4.448f, 1.448f, 4.0f, 2.0f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 4.0f, 17.0f, 4.448f, 17.0f, 5.0f)
                verticalLineTo(9.2f)
                close()
            }
        }
        .build()
        return _videoOnFill!!
    }

private var _videoOnFill: ImageVector? = null
