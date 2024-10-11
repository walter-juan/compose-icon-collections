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

public val SystemGroup.ThumbUpFill: ImageVector
    get() {
        if (_thumbUpFill != null) {
            return _thumbUpFill!!
        }
        _thumbUpFill = Builder(name = "ThumbUpFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                curveTo(1.448f, 21.0f, 1.0f, 20.552f, 1.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 9.448f, 1.448f, 9.0f, 2.0f, 9.0f)
                close()
                moveTo(7.293f, 7.707f)
                lineTo(13.693f, 1.307f)
                curveTo(13.869f, 1.131f, 14.148f, 1.111f, 14.347f, 1.26f)
                lineTo(15.2f, 1.9f)
                curveTo(15.684f, 2.263f, 15.903f, 2.883f, 15.753f, 3.47f)
                lineTo(14.6f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(22.105f, 8.0f, 23.0f, 8.895f, 23.0f, 10.0f)
                verticalLineTo(12.104f)
                curveTo(23.0f, 12.366f, 22.949f, 12.624f, 22.849f, 12.866f)
                lineTo(19.755f, 20.381f)
                curveTo(19.601f, 20.755f, 19.236f, 21.0f, 18.83f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(7.448f, 21.0f, 7.0f, 20.552f, 7.0f, 20.0f)
                verticalLineTo(8.414f)
                curveTo(7.0f, 8.149f, 7.105f, 7.895f, 7.293f, 7.707f)
                close()
            }
        }
        .build()
        return _thumbUpFill!!
    }

private var _thumbUpFill: ImageVector? = null
