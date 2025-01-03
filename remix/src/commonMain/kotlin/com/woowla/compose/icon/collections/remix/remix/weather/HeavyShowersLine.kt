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

public val WeatherGroup.HeavyShowersLine: ImageVector
    get() {
        if (_heavyShowersLine != null) {
            return _heavyShowersLine!!
        }
        _heavyShowersLine = Builder(name = "HeavyShowersLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 16.93f)
                curveTo(2.609f, 15.547f, 1.0f, 12.961f, 1.0f, 10.0f)
                curveTo(1.0f, 5.582f, 4.582f, 2.0f, 9.0f, 2.0f)
                curveTo(12.395f, 2.0f, 15.296f, 4.115f, 16.458f, 7.099f)
                curveTo(16.795f, 7.034f, 17.144f, 7.0f, 17.5f, 7.0f)
                curveTo(20.538f, 7.0f, 23.0f, 9.462f, 23.0f, 12.5f)
                curveTo(23.0f, 15.018f, 21.309f, 17.14f, 19.0f, 17.793f)
                verticalLineTo(15.663f)
                curveTo(20.183f, 15.101f, 21.0f, 13.896f, 21.0f, 12.5f)
                curveTo(21.0f, 10.567f, 19.433f, 9.0f, 17.5f, 9.0f)
                curveTo(16.521f, 9.0f, 15.635f, 9.402f, 15.0f, 10.051f)
                curveTo(15.0f, 10.034f, 15.0f, 10.017f, 15.0f, 10.0f)
                curveTo(15.0f, 6.686f, 12.314f, 4.0f, 9.0f, 4.0f)
                curveTo(5.686f, 4.0f, 3.0f, 6.686f, 3.0f, 10.0f)
                curveTo(3.0f, 11.777f, 3.773f, 13.374f, 5.0f, 14.472f)
                verticalLineTo(16.93f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(15.0f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _heavyShowersLine!!
    }

private var _heavyShowersLine: ImageVector? = null
