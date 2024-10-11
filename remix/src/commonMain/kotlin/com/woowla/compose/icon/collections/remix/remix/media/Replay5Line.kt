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

public val MediaGroup.Replay5Line: ImageVector
    get() {
        if (_replay5Line != null) {
            return _replay5Line!!
        }
        _replay5Line = Builder(name = "Replay5Line", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(9.25f, 4.0f, 6.824f, 5.387f, 5.385f, 7.5f)
                lineTo(8.0f, 7.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 5.999f)
                curveTo(5.824f, 3.571f, 8.729f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.5f, 8.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.625f)
                curveTo(13.799f, 11.25f, 14.75f, 12.201f, 14.75f, 13.375f)
                curveTo(14.75f, 14.549f, 13.799f, 15.5f, 12.625f, 15.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.625f)
                curveTo(12.97f, 14.0f, 13.25f, 13.72f, 13.25f, 13.375f)
                curveTo(13.25f, 13.03f, 12.97f, 12.75f, 12.625f, 12.75f)
                horizontalLineTo(9.5f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _replay5Line!!
    }

private var _replay5Line: ImageVector? = null
