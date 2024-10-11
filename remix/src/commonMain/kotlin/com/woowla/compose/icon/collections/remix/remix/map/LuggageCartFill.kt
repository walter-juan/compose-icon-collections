package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.LuggageCartFill: ImageVector
    get() {
        if (_luggageCartFill != null) {
            return _luggageCartFill!!
        }
        _luggageCartFill = Builder(name = "LuggageCartFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 20.0f)
                curveTo(6.329f, 20.0f, 7.0f, 20.671f, 7.0f, 21.5f)
                curveTo(7.0f, 22.328f, 6.329f, 23.0f, 5.5f, 23.0f)
                curveTo(4.672f, 23.0f, 4.0f, 22.328f, 4.0f, 21.5f)
                curveTo(4.0f, 20.671f, 4.672f, 20.0f, 5.5f, 20.0f)
                close()
                moveTo(18.5f, 20.0f)
                curveTo(19.329f, 20.0f, 20.0f, 20.671f, 20.0f, 21.5f)
                curveTo(20.0f, 22.328f, 19.329f, 23.0f, 18.5f, 23.0f)
                curveTo(17.672f, 23.0f, 17.0f, 22.328f, 17.0f, 21.5f)
                curveTo(17.0f, 20.671f, 17.672f, 20.0f, 18.5f, 20.0f)
                close()
                moveTo(2.172f, 1.757f)
                lineTo(6.0f, 5.585f)
                verticalLineTo(16.999f)
                lineTo(20.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 19.0f, 4.0f, 18.552f, 4.0f, 18.0f)
                lineTo(4.0f, 6.413f)
                lineTo(0.758f, 3.172f)
                lineTo(2.172f, 1.757f)
                close()
                moveTo(16.0f, 3.0f)
                curveTo(16.553f, 3.0f, 17.0f, 3.448f, 17.0f, 4.0f)
                lineTo(17.0f, 5.999f)
                lineTo(19.994f, 6.0f)
                curveTo(20.55f, 6.0f, 21.0f, 6.456f, 21.0f, 6.995f)
                verticalLineTo(15.005f)
                curveTo(21.0f, 15.554f, 20.551f, 16.0f, 19.994f, 16.0f)
                horizontalLineTo(8.007f)
                curveTo(7.451f, 16.0f, 7.0f, 15.544f, 7.0f, 15.005f)
                verticalLineTo(6.995f)
                curveTo(7.0f, 6.446f, 7.45f, 6.0f, 8.007f, 6.0f)
                lineTo(11.0f, 5.999f)
                lineTo(11.0f, 4.0f)
                curveTo(11.0f, 3.448f, 11.448f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _luggageCartFill!!
    }

private var _luggageCartFill: ImageVector? = null
