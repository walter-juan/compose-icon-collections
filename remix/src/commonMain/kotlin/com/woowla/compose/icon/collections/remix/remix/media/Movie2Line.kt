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

public val MediaGroup.Movie2Line: ImageVector
    get() {
        if (_movie2Line != null) {
            return _movie2Line!!
        }
        _movie2Line = Builder(name = "Movie2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 14.251f, 21.256f, 16.329f, 20.001f, 18.0f)
                horizontalLineTo(17.292f)
                curveTo(18.952f, 16.534f, 20.0f, 14.389f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.895f, 10.0f, 10.0f, 9.105f, 10.0f, 8.0f)
                curveTo(10.0f, 6.895f, 10.895f, 6.0f, 12.0f, 6.0f)
                curveTo(13.105f, 6.0f, 14.0f, 6.895f, 14.0f, 8.0f)
                curveTo(14.0f, 9.105f, 13.105f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(6.895f, 14.0f, 6.0f, 13.105f, 6.0f, 12.0f)
                curveTo(6.0f, 10.895f, 6.895f, 10.0f, 8.0f, 10.0f)
                curveTo(9.105f, 10.0f, 10.0f, 10.895f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 9.105f, 14.0f, 8.0f, 14.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(14.895f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.895f, 14.895f, 10.0f, 16.0f, 10.0f)
                curveTo(17.105f, 10.0f, 18.0f, 10.895f, 18.0f, 12.0f)
                curveTo(18.0f, 13.105f, 17.105f, 14.0f, 16.0f, 14.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(10.895f, 18.0f, 10.0f, 17.105f, 10.0f, 16.0f)
                curveTo(10.0f, 14.895f, 10.895f, 14.0f, 12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 14.895f, 14.0f, 16.0f)
                curveTo(14.0f, 17.105f, 13.105f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _movie2Line!!
    }

private var _movie2Line: ImageVector? = null
