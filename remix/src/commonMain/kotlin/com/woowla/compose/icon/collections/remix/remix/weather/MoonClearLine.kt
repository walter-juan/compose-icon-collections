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

public val WeatherGroup.MoonClearLine: ImageVector
    get() {
        if (_moonClearLine != null) {
            return _moonClearLine!!
        }
        _moonClearLine = Builder(name = "MoonClearLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                curveTo(10.0f, 10.418f, 13.582f, 14.0f, 18.0f, 14.0f)
                curveTo(19.439f, 14.0f, 20.788f, 13.62f, 21.955f, 12.956f)
                curveTo(21.474f, 18.03f, 17.201f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.799f, 5.97f, 2.526f, 11.044f, 2.045f)
                curveTo(10.38f, 3.212f, 10.0f, 4.561f, 10.0f, 6.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(14.965f, 20.0f, 17.576f, 18.379f, 18.957f, 15.955f)
                curveTo(18.641f, 15.985f, 18.321f, 16.0f, 18.0f, 16.0f)
                curveTo(12.477f, 16.0f, 8.0f, 11.523f, 8.0f, 6.0f)
                curveTo(8.0f, 5.679f, 8.015f, 5.359f, 8.045f, 5.043f)
                curveTo(5.621f, 6.424f, 4.0f, 9.035f, 4.0f, 12.0f)
                close()
                moveTo(18.164f, 2.291f)
                lineTo(19.0f, 2.5f)
                verticalLineTo(3.5f)
                lineTo(18.164f, 3.709f)
                curveTo(17.448f, 3.888f, 16.888f, 4.448f, 16.709f, 5.164f)
                lineTo(16.5f, 6.0f)
                horizontalLineTo(15.5f)
                lineTo(15.291f, 5.164f)
                curveTo(15.112f, 4.448f, 14.552f, 3.888f, 13.836f, 3.709f)
                lineTo(13.0f, 3.5f)
                verticalLineTo(2.5f)
                lineTo(13.836f, 2.291f)
                curveTo(14.552f, 2.112f, 15.112f, 1.552f, 15.291f, 0.836f)
                lineTo(15.5f, 0.0f)
                horizontalLineTo(16.5f)
                lineTo(16.709f, 0.836f)
                curveTo(16.888f, 1.552f, 17.448f, 2.112f, 18.164f, 2.291f)
                close()
                moveTo(23.164f, 7.291f)
                lineTo(24.0f, 7.5f)
                verticalLineTo(8.5f)
                lineTo(23.164f, 8.709f)
                curveTo(22.448f, 8.888f, 21.888f, 9.448f, 21.709f, 10.164f)
                lineTo(21.5f, 11.0f)
                horizontalLineTo(20.5f)
                lineTo(20.291f, 10.164f)
                curveTo(20.112f, 9.448f, 19.552f, 8.888f, 18.836f, 8.709f)
                lineTo(18.0f, 8.5f)
                verticalLineTo(7.5f)
                lineTo(18.836f, 7.291f)
                curveTo(19.552f, 7.112f, 20.112f, 6.552f, 20.291f, 5.836f)
                lineTo(20.5f, 5.0f)
                horizontalLineTo(21.5f)
                lineTo(21.709f, 5.836f)
                curveTo(21.888f, 6.552f, 22.448f, 7.112f, 23.164f, 7.291f)
                close()
            }
        }
        .build()
        return _moonClearLine!!
    }

private var _moonClearLine: ImageVector? = null
