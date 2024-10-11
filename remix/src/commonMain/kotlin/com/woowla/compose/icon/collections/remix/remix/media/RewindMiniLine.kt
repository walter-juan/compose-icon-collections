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

public val MediaGroup.RewindMiniLine: ImageVector
    get() {
        if (_rewindMiniLine != null) {
            return _rewindMiniLine!!
        }
        _rewindMiniLine = Builder(name = "RewindMiniLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.86f)
                lineTo(5.968f, 12.0f)
                lineTo(9.0f, 14.14f)
                verticalLineTo(9.86f)
                close()
                moveTo(10.909f, 17.323f)
                curveTo(10.749f, 17.549f, 10.438f, 17.603f, 10.212f, 17.444f)
                lineTo(3.079f, 12.408f)
                curveTo(3.032f, 12.376f, 2.992f, 12.335f, 2.959f, 12.288f)
                curveTo(2.799f, 12.063f, 2.853f, 11.751f, 3.079f, 11.592f)
                lineTo(10.212f, 6.556f)
                curveTo(10.296f, 6.497f, 10.397f, 6.465f, 10.5f, 6.465f)
                curveTo(10.776f, 6.465f, 11.0f, 6.689f, 11.0f, 6.965f)
                verticalLineTo(17.035f)
                curveTo(11.0f, 17.138f, 10.968f, 17.239f, 10.909f, 17.323f)
                close()
                moveTo(18.0f, 14.14f)
                verticalLineTo(9.86f)
                lineTo(14.968f, 12.0f)
                lineTo(18.0f, 14.14f)
                close()
                moveTo(12.079f, 12.408f)
                curveTo(12.032f, 12.376f, 11.992f, 12.335f, 11.959f, 12.288f)
                curveTo(11.8f, 12.063f, 11.853f, 11.751f, 12.079f, 11.592f)
                lineTo(19.212f, 6.556f)
                curveTo(19.296f, 6.497f, 19.397f, 6.465f, 19.5f, 6.465f)
                curveTo(19.776f, 6.465f, 20.0f, 6.689f, 20.0f, 6.965f)
                verticalLineTo(17.035f)
                curveTo(20.0f, 17.138f, 19.968f, 17.239f, 19.909f, 17.323f)
                curveTo(19.749f, 17.549f, 19.438f, 17.603f, 19.212f, 17.444f)
                lineTo(12.079f, 12.408f)
                close()
            }
        }
        .build()
        return _rewindMiniLine!!
    }

private var _rewindMiniLine: ImageVector? = null
