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

public val MediaGroup.MusicLine: ImageVector
    get() {
        if (_musicLine != null) {
            return _musicLine!!
        }
        _musicLine = Builder(name = "MusicLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.535f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                curveTo(14.0f, 19.209f, 12.209f, 21.0f, 10.0f, 21.0f)
                curveTo(7.791f, 21.0f, 6.0f, 19.209f, 6.0f, 17.0f)
                curveTo(6.0f, 14.791f, 7.791f, 13.0f, 10.0f, 13.0f)
                curveTo(10.729f, 13.0f, 11.412f, 13.195f, 12.0f, 13.535f)
                close()
                moveTo(10.0f, 19.0f)
                curveTo(11.105f, 19.0f, 12.0f, 18.105f, 12.0f, 17.0f)
                curveTo(12.0f, 15.895f, 11.105f, 15.0f, 10.0f, 15.0f)
                curveTo(8.895f, 15.0f, 8.0f, 15.895f, 8.0f, 17.0f)
                curveTo(8.0f, 18.105f, 8.895f, 19.0f, 10.0f, 19.0f)
                close()
            }
        }
        .build()
        return _musicLine!!
    }

private var _musicLine: ImageVector? = null
