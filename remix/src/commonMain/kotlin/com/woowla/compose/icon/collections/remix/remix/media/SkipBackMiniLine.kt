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

public val MediaGroup.SkipBackMiniLine: ImageVector
    get() {
        if (_skipBackMiniLine != null) {
            return _skipBackMiniLine!!
        }
        _skipBackMiniLine = Builder(name = "SkipBackMiniLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                curveTo(7.552f, 6.0f, 8.0f, 6.448f, 8.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(8.0f, 17.552f, 7.552f, 18.0f, 7.0f, 18.0f)
                curveTo(6.448f, 18.0f, 6.0f, 17.552f, 6.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 6.448f, 6.448f, 6.0f, 7.0f, 6.0f)
                close()
                moveTo(15.0f, 14.14f)
                verticalLineTo(9.86f)
                lineTo(11.968f, 12.0f)
                lineTo(15.0f, 14.14f)
                close()
                moveTo(9.079f, 12.408f)
                curveTo(9.032f, 12.376f, 8.991f, 12.335f, 8.959f, 12.288f)
                curveTo(8.799f, 12.063f, 8.853f, 11.751f, 9.079f, 11.592f)
                lineTo(16.212f, 6.556f)
                curveTo(16.296f, 6.497f, 16.397f, 6.465f, 16.5f, 6.465f)
                curveTo(16.776f, 6.465f, 17.0f, 6.689f, 17.0f, 6.965f)
                verticalLineTo(17.035f)
                curveTo(17.0f, 17.138f, 16.968f, 17.239f, 16.909f, 17.323f)
                curveTo(16.749f, 17.549f, 16.437f, 17.603f, 16.212f, 17.444f)
                lineTo(9.079f, 12.408f)
                close()
            }
        }
        .build()
        return _skipBackMiniLine!!
    }

private var _skipBackMiniLine: ImageVector? = null
