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

public val WeatherGroup.CelsiusLine: ImageVector
    get() {
        if (_celsiusLine != null) {
            return _celsiusLine!!
        }
        _celsiusLine = Builder(name = "CelsiusLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 10.0f)
                curveTo(2.567f, 10.0f, 1.0f, 8.433f, 1.0f, 6.5f)
                curveTo(1.0f, 4.567f, 2.567f, 3.0f, 4.5f, 3.0f)
                curveTo(6.433f, 3.0f, 8.0f, 4.567f, 8.0f, 6.5f)
                curveTo(8.0f, 8.433f, 6.433f, 10.0f, 4.5f, 10.0f)
                close()
                moveTo(4.5f, 8.0f)
                curveTo(5.328f, 8.0f, 6.0f, 7.328f, 6.0f, 6.5f)
                curveTo(6.0f, 5.672f, 5.328f, 5.0f, 4.5f, 5.0f)
                curveTo(3.672f, 5.0f, 3.0f, 5.672f, 3.0f, 6.5f)
                curveTo(3.0f, 7.328f, 3.672f, 8.0f, 4.5f, 8.0f)
                close()
                moveTo(22.0f, 10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.791f, 18.209f, 6.0f, 16.0f, 6.0f)
                curveTo(13.791f, 6.0f, 12.0f, 7.791f, 12.0f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(12.0f, 17.209f, 13.791f, 19.0f, 16.0f, 19.0f)
                curveTo(18.209f, 19.0f, 20.0f, 17.209f, 20.0f, 15.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 18.314f, 19.314f, 21.0f, 16.0f, 21.0f)
                curveTo(12.686f, 21.0f, 10.0f, 18.314f, 10.0f, 15.0f)
                verticalLineTo(10.0f)
                curveTo(10.0f, 6.686f, 12.686f, 4.0f, 16.0f, 4.0f)
                curveTo(19.314f, 4.0f, 22.0f, 6.686f, 22.0f, 10.0f)
                close()
            }
        }
        .build()
        return _celsiusLine!!
    }

private var _celsiusLine: ImageVector? = null
