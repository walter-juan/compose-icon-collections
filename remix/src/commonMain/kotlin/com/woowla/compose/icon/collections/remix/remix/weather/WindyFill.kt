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

public val WeatherGroup.WindyFill: ImageVector
    get() {
        if (_windyFill != null) {
            return _windyFill!!
        }
        _windyFill = Builder(name = "WindyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.5f)
                curveTo(12.433f, 15.0f, 14.0f, 16.567f, 14.0f, 18.5f)
                curveTo(14.0f, 20.433f, 12.433f, 22.0f, 10.5f, 22.0f)
                curveTo(9.0f, 22.0f, 7.72f, 21.056f, 7.222f, 19.729f)
                lineTo(9.095f, 19.027f)
                curveTo(9.308f, 19.595f, 9.857f, 20.0f, 10.5f, 20.0f)
                curveTo(11.328f, 20.0f, 12.0f, 19.328f, 12.0f, 18.5f)
                curveTo(12.0f, 17.672f, 11.328f, 17.0f, 10.5f, 17.0f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineTo(18.5f)
                curveTo(20.433f, 11.0f, 22.0f, 12.567f, 22.0f, 14.5f)
                curveTo(22.0f, 16.433f, 20.433f, 18.0f, 18.5f, 18.0f)
                curveTo(17.0f, 18.0f, 15.72f, 17.056f, 15.222f, 15.729f)
                lineTo(17.095f, 15.027f)
                curveTo(17.308f, 15.595f, 17.857f, 16.0f, 18.5f, 16.0f)
                curveTo(19.328f, 16.0f, 20.0f, 15.328f, 20.0f, 14.5f)
                curveTo(20.0f, 13.672f, 19.328f, 13.0f, 18.5f, 13.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 13.0f, 2.0f, 11.657f, 2.0f, 10.0f)
                curveTo(2.0f, 8.343f, 3.343f, 7.0f, 5.0f, 7.0f)
                horizontalLineTo(13.5f)
                curveTo(14.328f, 7.0f, 15.0f, 6.328f, 15.0f, 5.5f)
                curveTo(15.0f, 4.672f, 14.328f, 4.0f, 13.5f, 4.0f)
                curveTo(12.857f, 4.0f, 12.308f, 4.405f, 12.095f, 4.973f)
                lineTo(10.222f, 4.271f)
                curveTo(10.72f, 2.944f, 12.0f, 2.0f, 13.5f, 2.0f)
                curveTo(15.433f, 2.0f, 17.0f, 3.567f, 17.0f, 5.5f)
                curveTo(17.0f, 7.433f, 15.433f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 9.0f, 4.0f, 9.448f, 4.0f, 10.0f)
                curveTo(4.0f, 10.552f, 4.448f, 11.0f, 5.0f, 11.0f)
                close()
            }
        }
        .build()
        return _windyFill!!
    }

private var _windyFill: ImageVector? = null
