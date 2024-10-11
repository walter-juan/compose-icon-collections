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

public val MediaGroup.Replay15Fill: ImageVector
    get() {
        if (_replay15Fill != null) {
            return _replay15Fill!!
        }
        _replay15Fill = Builder(name = "Replay15Fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(8.5f, 8.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(16.75f, 8.5f)
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
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _replay15Fill!!
    }

private var _replay15Fill: ImageVector? = null
