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

public val MediaGroup.PlayLargeLine: ImageVector
    get() {
        if (_playLargeLine != null) {
            return _playLargeLine!!
        }
        _playLargeLine = Builder(name = "PlayLargeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.392f)
                verticalLineTo(5.608f)
                lineTo(18.226f, 12.0f)
                lineTo(8.0f, 18.392f)
                close()
                moveTo(6.0f, 3.804f)
                verticalLineTo(20.196f)
                curveTo(6.0f, 20.981f, 6.864f, 21.46f, 7.53f, 21.044f)
                lineTo(20.643f, 12.848f)
                curveTo(21.27f, 12.456f, 21.27f, 11.544f, 20.643f, 11.152f)
                lineTo(7.53f, 2.956f)
                curveTo(6.864f, 2.54f, 6.0f, 3.019f, 6.0f, 3.804f)
                close()
            }
        }
        .build()
        return _playLargeLine!!
    }

private var _playLargeLine: ImageVector? = null
