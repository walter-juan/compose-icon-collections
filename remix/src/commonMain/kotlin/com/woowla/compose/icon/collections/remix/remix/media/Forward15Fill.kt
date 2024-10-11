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

public val MediaGroup.Forward15Fill: ImageVector
    get() {
        if (_forward15Fill != null) {
            return _forward15Fill!!
        }
        _forward15Fill = Builder(name = "Forward15Fill", defaultWidth = 24.0.dp, defaultHeight =
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
                lineTo(16.5f, 8.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(14.875f)
                curveTo(15.22f, 12.75f, 15.5f, 13.03f, 15.5f, 13.375f)
                curveTo(15.5f, 13.72f, 15.22f, 14.0f, 14.875f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(14.875f)
                curveTo(16.049f, 15.5f, 17.0f, 14.549f, 17.0f, 13.375f)
                curveTo(17.0f, 12.201f, 16.049f, 11.25f, 14.875f, 11.25f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.75f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.0f)
                lineTo(19.553f, 5.446f)
                curveTo(17.72f, 3.335f, 15.016f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.5f, 8.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _forward15Fill!!
    }

private var _forward15Fill: ImageVector? = null
