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

public val MediaGroup.Replay10Fill: ImageVector
    get() {
        if (_replay10Fill != null) {
            return _replay10Fill!!
        }
        _replay10Fill = Builder(name = "Replay10Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(9.536f, 4.0f, 7.332f, 5.114f, 5.865f, 6.865f)
                lineTo(8.0f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                lineTo(4.447f, 5.446f)
                curveTo(6.28f, 3.335f, 8.984f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.5f, 8.25f)
                curveTo(13.119f, 8.25f, 12.0f, 9.369f, 12.0f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(12.0f, 14.631f, 13.119f, 15.75f, 14.5f, 15.75f)
                curveTo(15.881f, 15.75f, 17.0f, 14.631f, 17.0f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(17.0f, 9.369f, 15.881f, 8.25f, 14.5f, 8.25f)
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
        return _replay10Fill!!
    }

private var _replay10Fill: ImageVector? = null
