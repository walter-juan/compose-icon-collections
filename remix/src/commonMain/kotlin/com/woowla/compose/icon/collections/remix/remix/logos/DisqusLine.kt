package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.DisqusLine: ImageVector
    get() {
        if (_disqusLine != null) {
            return _disqusLine!!
        }
        _disqusLine = Builder(name = "DisqusLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 2.0f)
                curveTo(17.52f, 2.0f, 21.997f, 6.477f, 21.997f, 12.0f)
                curveTo(21.997f, 17.523f, 17.52f, 22.0f, 11.997f, 22.0f)
                curveTo(9.691f, 22.0f, 7.505f, 21.216f, 5.748f, 19.808f)
                lineTo(1.03f, 20.397f)
                lineTo(2.749f, 15.812f)
                curveTo(2.255f, 14.614f, 1.997f, 13.325f, 1.997f, 12.0f)
                curveTo(1.997f, 6.477f, 6.474f, 2.0f, 11.997f, 2.0f)
                close()
                moveTo(11.997f, 4.0f)
                curveTo(7.579f, 4.0f, 3.997f, 7.582f, 3.997f, 12.0f)
                curveTo(3.997f, 13.178f, 4.251f, 14.318f, 4.735f, 15.362f)
                lineTo(4.912f, 15.742f)
                lineTo(4.064f, 18.003f)
                lineTo(6.379f, 17.713f)
                lineTo(6.717f, 18.01f)
                curveTo(8.168f, 19.285f, 10.026f, 20.0f, 11.997f, 20.0f)
                curveTo(16.415f, 20.0f, 19.997f, 16.418f, 19.997f, 12.0f)
                curveTo(19.997f, 7.582f, 16.415f, 4.0f, 11.997f, 4.0f)
                close()
                moveTo(8.047f, 7.0f)
                horizontalLineTo(11.837f)
                curveTo(15.258f, 7.0f, 17.278f, 8.956f, 17.377f, 11.729f)
                lineTo(17.381f, 11.944f)
                verticalLineTo(11.971f)
                curveTo(17.381f, 14.785f, 15.418f, 16.893f, 12.043f, 16.996f)
                lineTo(11.781f, 17.0f)
                horizontalLineTo(8.047f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.837f)
                horizontalLineTo(8.047f)
                close()
                moveTo(11.878f, 9.458f)
                horizontalLineTo(10.77f)
                verticalLineTo(14.543f)
                horizontalLineTo(11.878f)
                curveTo(13.444f, 14.543f, 14.503f, 13.698f, 14.582f, 12.198f)
                lineTo(14.587f, 12.015f)
                verticalLineTo(11.987f)
                curveTo(14.587f, 10.386f, 13.507f, 9.458f, 11.878f, 9.458f)
                close()
            }
        }
        .build()
        return _disqusLine!!
    }

private var _disqusLine: ImageVector? = null
