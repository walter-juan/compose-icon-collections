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

public val MediaGroup.Music2Fill: ImageVector
    get() {
        if (_music2Fill != null) {
            return _music2Fill!!
        }
        _music2Fill = Builder(name = "Music2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 19.209f, 7.209f, 21.0f, 5.0f, 21.0f)
                curveTo(2.791f, 21.0f, 1.0f, 19.209f, 1.0f, 17.0f)
                curveTo(1.0f, 14.791f, 2.791f, 13.0f, 5.0f, 13.0f)
                curveTo(5.729f, 13.0f, 6.412f, 13.195f, 7.0f, 13.535f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _music2Fill!!
    }

private var _music2Fill: ImageVector? = null
