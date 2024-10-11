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

public val MediaGroup.Forward10Line: ImageVector
    get() {
        if (_forward10Line != null) {
            return _forward10Line!!
        }
        _forward10Line = Builder(name = "Forward10Line", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(14.75f, 4.0f, 17.176f, 5.387f, 18.615f, 7.5f)
                lineTo(16.0f, 7.5f)
                verticalLineTo(8.75f)
                curveTo(15.582f, 8.436f, 15.063f, 8.25f, 14.5f, 8.25f)
                curveTo(13.119f, 8.25f, 12.0f, 9.369f, 12.0f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(12.0f, 14.631f, 13.119f, 15.75f, 14.5f, 15.75f)
                curveTo(15.881f, 15.75f, 17.0f, 14.631f, 17.0f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(17.0f, 10.295f, 16.878f, 9.868f, 16.666f, 9.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(20.0f)
                lineTo(20.0f, 5.999f)
                curveTo(18.176f, 3.571f, 15.271f, 2.0f, 12.0f, 2.0f)
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
        return _forward10Line!!
    }

private var _forward10Line: ImageVector? = null
