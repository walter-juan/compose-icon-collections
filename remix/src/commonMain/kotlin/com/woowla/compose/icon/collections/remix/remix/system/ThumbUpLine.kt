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

public val SystemGroup.ThumbUpLine: ImageVector
    get() {
        if (_thumbUpLine != null) {
            return _thumbUpLine!!
        }
        _thumbUpLine = Builder(name = "ThumbUpLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(22.105f, 8.0f, 23.0f, 8.896f, 23.0f, 10.0f)
                verticalLineTo(12.105f)
                curveTo(23.0f, 12.366f, 22.949f, 12.625f, 22.849f, 12.866f)
                lineTo(19.755f, 20.381f)
                curveTo(19.601f, 20.756f, 19.236f, 21.0f, 18.83f, 21.0f)
                horizontalLineTo(2.0f)
                curveTo(1.448f, 21.0f, 1.0f, 20.553f, 1.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 9.448f, 1.448f, 9.0f, 2.0f, 9.0f)
                horizontalLineTo(5.482f)
                curveTo(5.807f, 9.0f, 6.111f, 8.842f, 6.299f, 8.577f)
                lineTo(11.752f, 0.851f)
                curveTo(11.895f, 0.649f, 12.163f, 0.582f, 12.384f, 0.692f)
                lineTo(14.198f, 1.6f)
                curveTo(15.25f, 2.125f, 15.793f, 3.313f, 15.503f, 4.452f)
                lineTo(14.6f, 8.0f)
                close()
                moveTo(7.0f, 10.588f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.161f)
                lineTo(21.0f, 12.105f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.6f)
                curveTo(13.295f, 10.0f, 12.34f, 8.771f, 12.662f, 7.507f)
                lineTo(13.565f, 3.959f)
                curveTo(13.623f, 3.731f, 13.514f, 3.494f, 13.304f, 3.388f)
                lineTo(12.643f, 3.058f)
                lineTo(7.933f, 9.73f)
                curveTo(7.683f, 10.084f, 7.363f, 10.375f, 7.0f, 10.588f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _thumbUpLine!!
    }

private var _thumbUpLine: ImageVector? = null
