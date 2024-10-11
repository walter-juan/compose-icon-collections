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

public val SystemGroup.ThumbDownFill: ImageVector
    get() {
        if (_thumbDownFill != null) {
            return _thumbDownFill!!
        }
        _thumbDownFill = Builder(name = "ThumbDownFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                curveTo(22.552f, 3.0f, 23.0f, 3.448f, 23.0f, 4.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 14.552f, 22.552f, 15.0f, 22.0f, 15.0f)
                close()
                moveTo(16.707f, 16.293f)
                lineTo(10.307f, 22.693f)
                curveTo(10.131f, 22.869f, 9.852f, 22.889f, 9.653f, 22.74f)
                lineTo(8.8f, 22.1f)
                curveTo(8.316f, 21.737f, 8.097f, 21.117f, 8.247f, 20.53f)
                lineTo(9.4f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(1.895f, 16.0f, 1.0f, 15.105f, 1.0f, 14.0f)
                verticalLineTo(11.896f)
                curveTo(1.0f, 11.634f, 1.051f, 11.376f, 1.151f, 11.134f)
                lineTo(4.245f, 3.619f)
                curveTo(4.399f, 3.245f, 4.764f, 3.0f, 5.17f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 3.0f, 17.0f, 3.448f, 17.0f, 4.0f)
                verticalLineTo(15.586f)
                curveTo(17.0f, 15.851f, 16.895f, 16.105f, 16.707f, 16.293f)
                close()
            }
        }
        .build()
        return _thumbDownFill!!
    }

private var _thumbDownFill: ImageVector? = null
