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

public val MediaGroup.AlbumLine: ImageVector
    get() {
        if (_albumLine != null) {
            return _albumLine!!
        }
        _albumLine = Builder(name = "AlbumLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.895f, 13.105f, 10.0f, 12.0f, 10.0f)
                curveTo(10.895f, 10.0f, 10.0f, 10.895f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.895f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(9.791f, 16.0f, 8.0f, 14.209f, 8.0f, 12.0f)
                curveTo(8.0f, 9.791f, 9.791f, 8.0f, 12.0f, 8.0f)
                curveTo(14.209f, 8.0f, 16.0f, 9.791f, 16.0f, 12.0f)
                curveTo(16.0f, 14.209f, 14.209f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _albumLine!!
    }

private var _albumLine: ImageVector? = null