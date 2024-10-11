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

public val MapGroup.RocketFill: ImageVector
    get() {
        if (_rocketFill != null) {
            return _rocketFill!!
        }
        _rocketFill = Builder(name = "RocketFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.331f, 15.929f)
                curveTo(5.115f, 14.991f, 5.001f, 14.01f, 5.001f, 13.0f)
                curveTo(5.001f, 7.912f, 7.903f, 3.564f, 12.0f, 1.818f)
                curveTo(16.098f, 3.564f, 19.0f, 7.912f, 19.0f, 13.0f)
                curveTo(19.0f, 14.01f, 18.886f, 14.991f, 18.671f, 15.929f)
                lineTo(20.691f, 17.725f)
                curveTo(20.87f, 17.884f, 20.911f, 18.149f, 20.787f, 18.355f)
                lineTo(18.33f, 22.451f)
                curveTo(18.188f, 22.688f, 17.881f, 22.764f, 17.644f, 22.622f)
                curveTo(17.609f, 22.601f, 17.577f, 22.576f, 17.548f, 22.547f)
                lineTo(15.293f, 20.293f)
                curveTo(15.106f, 20.105f, 14.851f, 20.0f, 14.586f, 20.0f)
                horizontalLineTo(9.415f)
                curveTo(9.15f, 20.0f, 8.895f, 20.105f, 8.708f, 20.293f)
                lineTo(6.453f, 22.547f)
                curveTo(6.258f, 22.742f, 5.942f, 22.742f, 5.746f, 22.547f)
                curveTo(5.717f, 22.518f, 5.692f, 22.486f, 5.671f, 22.451f)
                lineTo(3.214f, 18.355f)
                curveTo(3.09f, 18.149f, 3.131f, 17.884f, 3.31f, 17.725f)
                lineTo(5.331f, 15.929f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(13.105f, 13.0f, 14.0f, 12.104f, 14.0f, 11.0f)
                curveTo(14.0f, 9.895f, 13.105f, 9.0f, 12.0f, 9.0f)
                curveTo(10.896f, 9.0f, 10.0f, 9.895f, 10.0f, 11.0f)
                curveTo(10.0f, 12.104f, 10.896f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _rocketFill!!
    }

private var _rocketFill: ImageVector? = null
