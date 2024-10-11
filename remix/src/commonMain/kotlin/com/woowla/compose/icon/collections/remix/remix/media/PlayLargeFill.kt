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

public val MediaGroup.PlayLargeFill: ImageVector
    get() {
        if (_playLargeFill != null) {
            return _playLargeFill!!
        }
        _playLargeFill = Builder(name = "PlayLargeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 20.196f)
                verticalLineTo(3.804f)
                curveTo(6.0f, 3.019f, 6.864f, 2.54f, 7.53f, 2.956f)
                lineTo(20.643f, 11.152f)
                curveTo(21.27f, 11.544f, 21.27f, 12.456f, 20.643f, 12.848f)
                lineTo(7.53f, 21.044f)
                curveTo(6.864f, 21.46f, 6.0f, 20.981f, 6.0f, 20.196f)
                close()
            }
        }
        .build()
        return _playLargeFill!!
    }

private var _playLargeFill: ImageVector? = null
