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

public val WeatherGroup.FahrenheitFill: ImageVector
    get() {
        if (_fahrenheitFill != null) {
            return _fahrenheitFill!!
        }
        _fahrenheitFill = Builder(name = "FahrenheitFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                curveTo(10.0f, 5.791f, 11.791f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                curveTo(12.895f, 6.0f, 12.0f, 6.895f, 12.0f, 8.0f)
                verticalLineTo(12.0f)
                close()
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
            }
        }
        .build()
        return _fahrenheitFill!!
    }

private var _fahrenheitFill: ImageVector? = null
