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

public val MediaGroup.Music2Line: ImageVector
    get() {
        if (_music2Line != null) {
            return _music2Line!!
        }
        _music2Line = Builder(name = "Music2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 19.209f, 18.209f, 21.0f, 16.0f, 21.0f)
                curveTo(13.791f, 21.0f, 12.0f, 19.209f, 12.0f, 17.0f)
                curveTo(12.0f, 14.791f, 13.791f, 13.0f, 16.0f, 13.0f)
                curveTo(16.729f, 13.0f, 17.412f, 13.195f, 18.0f, 13.535f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 19.209f, 7.209f, 21.0f, 5.0f, 21.0f)
                curveTo(2.791f, 21.0f, 1.0f, 19.209f, 1.0f, 17.0f)
                curveTo(1.0f, 14.791f, 2.791f, 13.0f, 5.0f, 13.0f)
                curveTo(5.729f, 13.0f, 6.412f, 13.195f, 7.0f, 13.535f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(5.0f, 19.0f)
                curveTo(6.105f, 19.0f, 7.0f, 18.105f, 7.0f, 17.0f)
                curveTo(7.0f, 15.895f, 6.105f, 15.0f, 5.0f, 15.0f)
                curveTo(3.895f, 15.0f, 3.0f, 15.895f, 3.0f, 17.0f)
                curveTo(3.0f, 18.105f, 3.895f, 19.0f, 5.0f, 19.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(17.105f, 19.0f, 18.0f, 18.105f, 18.0f, 17.0f)
                curveTo(18.0f, 15.895f, 17.105f, 15.0f, 16.0f, 15.0f)
                curveTo(14.895f, 15.0f, 14.0f, 15.895f, 14.0f, 17.0f)
                curveTo(14.0f, 18.105f, 14.895f, 19.0f, 16.0f, 19.0f)
                close()
            }
        }
        .build()
        return _music2Line!!
    }

private var _music2Line: ImageVector? = null
