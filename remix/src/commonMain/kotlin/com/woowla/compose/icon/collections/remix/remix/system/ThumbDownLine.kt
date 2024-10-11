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

public val SystemGroup.ThumbDownLine: ImageVector
    get() {
        if (_thumbDownLine != null) {
            return _thumbDownLine!!
        }
        _thumbDownLine = Builder(name = "ThumbDownLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(1.895f, 16.0f, 1.0f, 15.105f, 1.0f, 14.0f)
                verticalLineTo(11.896f)
                curveTo(1.0f, 11.634f, 1.051f, 11.376f, 1.151f, 11.134f)
                lineTo(4.245f, 3.619f)
                curveTo(4.399f, 3.245f, 4.764f, 3.0f, 5.17f, 3.0f)
                horizontalLineTo(22.0f)
                curveTo(22.552f, 3.0f, 23.0f, 3.448f, 23.0f, 4.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 14.552f, 22.552f, 15.0f, 22.0f, 15.0f)
                horizontalLineTo(18.518f)
                curveTo(18.193f, 15.0f, 17.889f, 15.158f, 17.701f, 15.423f)
                lineTo(12.248f, 23.149f)
                curveTo(12.105f, 23.351f, 11.837f, 23.418f, 11.616f, 23.308f)
                lineTo(9.802f, 22.401f)
                curveTo(8.75f, 21.875f, 8.207f, 20.687f, 8.497f, 19.548f)
                lineTo(9.4f, 16.0f)
                close()
                moveTo(17.0f, 13.413f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.839f)
                lineTo(3.0f, 11.896f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.4f)
                curveTo(10.705f, 14.0f, 11.66f, 15.229f, 11.338f, 16.493f)
                lineTo(10.435f, 20.041f)
                curveTo(10.377f, 20.269f, 10.486f, 20.507f, 10.696f, 20.612f)
                lineTo(11.357f, 20.942f)
                lineTo(16.067f, 14.27f)
                curveTo(16.317f, 13.916f, 16.637f, 13.626f, 17.0f, 13.413f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _thumbDownLine!!
    }

private var _thumbDownLine: ImageVector? = null
