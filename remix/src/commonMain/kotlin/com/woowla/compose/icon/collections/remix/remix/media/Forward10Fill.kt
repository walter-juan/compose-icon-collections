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

public val MediaGroup.Forward10Fill: ImageVector
    get() {
        if (_forward10Fill != null) {
            return _forward10Fill!!
        }
        _forward10Fill = Builder(name = "Forward10Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(14.464f, 4.0f, 16.668f, 5.114f, 18.135f, 6.865f)
                lineTo(16.138f, 8.862f)
                curveTo(15.7f, 8.481f, 15.127f, 8.25f, 14.5f, 8.25f)
                curveTo(13.119f, 8.25f, 12.0f, 9.369f, 12.0f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(12.0f, 14.631f, 13.119f, 15.75f, 14.5f, 15.75f)
                curveTo(15.881f, 15.75f, 17.0f, 14.631f, 17.0f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(17.0f, 10.069f, 16.727f, 9.451f, 16.285f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.0f)
                lineTo(19.553f, 5.446f)
                curveTo(17.72f, 3.335f, 15.016f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(15.5f, 13.802f, 15.052f, 14.25f, 14.5f, 14.25f)
                curveTo(13.948f, 14.25f, 13.5f, 13.802f, 13.5f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(13.5f, 10.198f, 13.948f, 9.75f, 14.5f, 9.75f)
                curveTo(15.052f, 9.75f, 15.5f, 10.198f, 15.5f, 10.75f)
                close()
                moveTo(10.0f, 8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _forward10Fill!!
    }

private var _forward10Fill: ImageVector? = null
