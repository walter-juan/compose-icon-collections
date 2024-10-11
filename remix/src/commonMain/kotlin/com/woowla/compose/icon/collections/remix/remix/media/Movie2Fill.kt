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

public val MediaGroup.Movie2Fill: ImageVector
    get() {
        if (_movie2Fill != null) {
            return _movie2Fill!!
        }
        _movie2Fill = Builder(name = "Movie2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.001f, 20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 15.271f, 20.429f, 18.176f, 18.001f, 20.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 9.105f, 14.0f, 8.0f)
                curveTo(14.0f, 6.895f, 13.105f, 6.0f, 12.0f, 6.0f)
                curveTo(10.895f, 6.0f, 10.0f, 6.895f, 10.0f, 8.0f)
                curveTo(10.0f, 9.105f, 10.895f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(9.105f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 9.105f, 10.0f, 8.0f, 10.0f)
                curveTo(6.895f, 10.0f, 6.0f, 10.895f, 6.0f, 12.0f)
                curveTo(6.0f, 13.105f, 6.895f, 14.0f, 8.0f, 14.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(17.105f, 14.0f, 18.0f, 13.105f, 18.0f, 12.0f)
                curveTo(18.0f, 10.895f, 17.105f, 10.0f, 16.0f, 10.0f)
                curveTo(14.895f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 14.895f, 14.0f, 16.0f, 14.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(13.105f, 18.0f, 14.0f, 17.105f, 14.0f, 16.0f)
                curveTo(14.0f, 14.895f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 14.895f, 10.0f, 16.0f)
                curveTo(10.0f, 17.105f, 10.895f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _movie2Fill!!
    }

private var _movie2Fill: ImageVector? = null
