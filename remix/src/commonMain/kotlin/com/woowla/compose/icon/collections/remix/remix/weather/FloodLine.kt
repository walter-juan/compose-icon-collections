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

public val WeatherGroup.FloodLine: ImageVector
    get() {
        if (_floodLine != null) {
            return _floodLine!!
        }
        _floodLine = Builder(name = "FloodLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 17.472f)
                curveTo(17.062f, 18.422f, 18.463f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                curveTo(18.543f, 21.0f, 17.177f, 20.61f, 16.0f, 19.93f)
                curveTo(14.824f, 20.61f, 13.458f, 21.0f, 12.0f, 21.0f)
                curveTo(10.543f, 21.0f, 9.177f, 20.61f, 8.0f, 19.93f)
                curveTo(6.824f, 20.61f, 5.458f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                curveTo(5.537f, 19.0f, 6.939f, 18.422f, 8.0f, 17.472f)
                curveTo(9.062f, 18.422f, 10.463f, 19.0f, 12.0f, 19.0f)
                curveTo(13.537f, 19.0f, 14.939f, 18.422f, 16.0f, 17.472f)
                close()
                moveTo(12.573f, 1.532f)
                lineTo(12.673f, 1.612f)
                lineTo(23.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(19.299f, 17.0f, 18.626f, 16.88f, 18.0f, 16.659f)
                lineTo(18.0f, 9.157f)
                lineTo(12.0f, 3.702f)
                lineTo(6.0f, 9.156f)
                lineTo(6.001f, 16.658f)
                curveTo(5.465f, 16.848f, 4.893f, 16.963f, 4.299f, 16.993f)
                lineTo(4.0f, 17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                lineTo(11.327f, 1.612f)
                curveTo(11.677f, 1.294f, 12.196f, 1.267f, 12.573f, 1.532f)
                close()
            }
        }
        .build()
        return _floodLine!!
    }

private var _floodLine: ImageVector? = null
