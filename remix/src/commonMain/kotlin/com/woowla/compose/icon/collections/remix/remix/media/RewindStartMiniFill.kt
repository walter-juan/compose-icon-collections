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

public val MediaGroup.RewindStartMiniFill: ImageVector
    get() {
        if (_rewindStartMiniFill != null) {
            return _rewindStartMiniFill!!
        }
        _rewindStartMiniFill = Builder(name = "RewindStartMiniFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(2.448f, 6.0f, 2.0f, 6.448f, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 17.552f, 2.448f, 18.0f, 3.0f, 18.0f)
                curveTo(3.552f, 18.0f, 4.0f, 17.552f, 4.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 6.448f, 3.552f, 6.0f, 3.0f, 6.0f)
                close()
                moveTo(12.909f, 17.323f)
                curveTo(12.968f, 17.239f, 13.0f, 17.138f, 13.0f, 17.035f)
                verticalLineTo(6.965f)
                curveTo(13.0f, 6.689f, 12.776f, 6.465f, 12.5f, 6.465f)
                curveTo(12.397f, 6.465f, 12.296f, 6.497f, 12.212f, 6.556f)
                lineTo(5.079f, 11.591f)
                curveTo(4.853f, 11.751f, 4.799f, 12.063f, 4.959f, 12.288f)
                curveTo(4.992f, 12.335f, 5.032f, 12.375f, 5.079f, 12.408f)
                lineTo(12.212f, 17.443f)
                curveTo(12.438f, 17.603f, 12.749f, 17.549f, 12.909f, 17.323f)
                close()
                moveTo(13.959f, 12.288f)
                curveTo(13.992f, 12.335f, 14.032f, 12.375f, 14.079f, 12.408f)
                lineTo(21.212f, 17.443f)
                curveTo(21.438f, 17.603f, 21.749f, 17.549f, 21.909f, 17.323f)
                curveTo(21.968f, 17.239f, 22.0f, 17.138f, 22.0f, 17.035f)
                verticalLineTo(6.965f)
                curveTo(22.0f, 6.689f, 21.776f, 6.465f, 21.5f, 6.465f)
                curveTo(21.397f, 6.465f, 21.296f, 6.497f, 21.212f, 6.556f)
                lineTo(14.079f, 11.591f)
                curveTo(13.853f, 11.751f, 13.8f, 12.063f, 13.959f, 12.288f)
                close()
            }
        }
        .build()
        return _rewindStartMiniFill!!
    }

private var _rewindStartMiniFill: ImageVector? = null
