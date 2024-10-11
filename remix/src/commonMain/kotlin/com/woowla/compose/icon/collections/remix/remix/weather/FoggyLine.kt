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

public val WeatherGroup.FoggyLine: ImageVector
    get() {
        if (_foggyLine != null) {
            return _foggyLine!!
        }
        _foggyLine = Builder(name = "FoggyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.584f, 13.007f)
                curveTo(1.208f, 12.079f, 1.0f, 11.064f, 1.0f, 10.0f)
                curveTo(1.0f, 5.582f, 4.582f, 2.0f, 9.0f, 2.0f)
                curveTo(12.395f, 2.0f, 15.296f, 4.115f, 16.458f, 7.099f)
                curveTo(16.795f, 7.034f, 17.144f, 7.0f, 17.5f, 7.0f)
                curveTo(20.538f, 7.0f, 23.0f, 9.462f, 23.0f, 12.5f)
                curveTo(23.0f, 12.671f, 22.992f, 12.84f, 22.977f, 13.007f)
                horizontalLineTo(20.964f)
                curveTo(20.988f, 12.841f, 21.0f, 12.672f, 21.0f, 12.5f)
                curveTo(21.0f, 10.567f, 19.433f, 9.0f, 17.5f, 9.0f)
                curveTo(16.521f, 9.0f, 15.635f, 9.402f, 15.0f, 10.051f)
                curveTo(15.0f, 10.034f, 15.0f, 10.017f, 15.0f, 10.0f)
                curveTo(15.0f, 6.686f, 12.314f, 4.0f, 9.0f, 4.0f)
                curveTo(5.686f, 4.0f, 3.0f, 6.686f, 3.0f, 10.0f)
                curveTo(3.0f, 11.096f, 3.294f, 12.123f, 3.807f, 13.007f)
                horizontalLineTo(1.584f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _foggyLine!!
    }

private var _foggyLine: ImageVector? = null
