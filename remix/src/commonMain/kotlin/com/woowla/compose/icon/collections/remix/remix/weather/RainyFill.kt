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

public val WeatherGroup.RainyFill: ImageVector
    get() {
        if (_rainyFill != null) {
            return _rainyFill!!
        }
        _rainyFill = Builder(name = "RainyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.86f, 18.0f)
                lineTo(12.707f, 14.847f)
                curveTo(12.317f, 14.457f, 11.683f, 14.457f, 11.293f, 14.847f)
                lineTo(8.181f, 17.959f)
                curveTo(4.148f, 17.549f, 1.0f, 14.142f, 1.0f, 10.0f)
                curveTo(1.0f, 5.582f, 4.582f, 2.0f, 9.0f, 2.0f)
                curveTo(11.997f, 2.0f, 14.609f, 3.648f, 15.979f, 6.087f)
                curveTo(16.311f, 6.03f, 16.652f, 6.0f, 17.0f, 6.0f)
                curveTo(20.314f, 6.0f, 23.0f, 8.686f, 23.0f, 12.0f)
                curveTo(23.0f, 15.314f, 20.314f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(15.86f)
                close()
                moveTo(10.232f, 18.732f)
                lineTo(12.0f, 16.965f)
                lineTo(13.768f, 18.732f)
                curveTo(14.744f, 19.708f, 14.744f, 21.292f, 13.768f, 22.268f)
                curveTo(12.792f, 23.244f, 11.208f, 23.244f, 10.232f, 22.268f)
                curveTo(9.256f, 21.292f, 9.256f, 19.708f, 10.232f, 18.732f)
                close()
            }
        }
        .build()
        return _rainyFill!!
    }

private var _rainyFill: ImageVector? = null
