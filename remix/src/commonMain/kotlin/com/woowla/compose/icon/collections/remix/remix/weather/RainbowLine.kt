package com.woowla.compose.icon.collections.remix.remix.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.WeatherGroup

public val WeatherGroup.RainbowLine: ImageVector
    get() {
        if (_rainbowLine != null) {
            return _rainbowLine!!
        }
        _rainbowLine = Builder(name = "RainbowLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(18.075f, 4.0f, 23.0f, 8.925f, 23.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 10.118f, 17.113f, 6.144f, 12.265f, 6.004f)
                lineTo(12.0f, 6.0f)
                curveTo(7.118f, 6.0f, 3.144f, 9.887f, 3.004f, 14.735f)
                lineTo(3.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 8.925f, 5.925f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(15.866f, 8.0f, 19.0f, 11.134f, 19.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 12.311f, 14.878f, 10.118f, 12.217f, 10.005f)
                lineTo(12.0f, 10.0f)
                curveTo(9.311f, 10.0f, 7.118f, 12.122f, 7.005f, 14.783f)
                lineTo(7.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 11.134f, 8.134f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.657f, 12.0f, 15.0f, 13.343f, 15.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 14.487f, 12.614f, 14.064f, 12.117f, 14.007f)
                lineTo(12.0f, 14.0f)
                curveTo(11.487f, 14.0f, 11.064f, 14.386f, 11.007f, 14.883f)
                lineTo(11.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 13.343f, 10.343f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _rainbowLine!!
    }

private var _rainbowLine: ImageVector? = null
