package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.FindReplaceLine: ImageVector
    get() {
        if (_findReplaceLine != null) {
            return _findReplaceLine!!
        }
        _findReplaceLine = Builder(name = "FindReplaceLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.033f, 16.618f)
                lineTo(22.314f, 20.899f)
                lineTo(20.899f, 22.314f)
                lineTo(16.618f, 18.033f)
                curveTo(15.079f, 19.264f, 13.126f, 20.0f, 11.0f, 20.0f)
                curveTo(7.465f, 20.0f, 4.407f, 17.964f, 2.935f, 15.0f)
                horizontalLineTo(6.0f)
                horizontalLineTo(9.0f)
                lineTo(7.696f, 17.173f)
                curveTo(8.68f, 17.701f, 9.805f, 18.0f, 11.0f, 18.0f)
                curveTo(12.896f, 18.0f, 14.615f, 17.247f, 15.875f, 16.025f)
                lineTo(16.025f, 15.875f)
                curveTo(17.247f, 14.615f, 18.0f, 12.896f, 18.0f, 11.0f)
                curveTo(18.0f, 10.305f, 17.899f, 9.634f, 17.71f, 9.0f)
                horizontalLineTo(19.777f)
                curveTo(19.923f, 9.643f, 20.0f, 10.313f, 20.0f, 11.0f)
                curveTo(20.0f, 13.126f, 19.264f, 15.079f, 18.033f, 16.618f)
                close()
                moveTo(19.065f, 7.0f)
                horizontalLineTo(13.0f)
                lineTo(14.304f, 4.827f)
                curveTo(13.32f, 4.299f, 12.195f, 4.0f, 11.0f, 4.0f)
                curveTo(7.133f, 4.0f, 4.0f, 7.133f, 4.0f, 11.0f)
                curveTo(4.0f, 11.695f, 4.101f, 12.366f, 4.29f, 13.0f)
                horizontalLineTo(2.223f)
                curveTo(2.077f, 12.357f, 2.0f, 11.687f, 2.0f, 11.0f)
                curveTo(2.0f, 6.028f, 6.028f, 2.0f, 11.0f, 2.0f)
                curveTo(14.535f, 2.0f, 17.593f, 4.036f, 19.065f, 7.0f)
                close()
            }
        }
        .build()
        return _findReplaceLine!!
    }

private var _findReplaceLine: ImageVector? = null
