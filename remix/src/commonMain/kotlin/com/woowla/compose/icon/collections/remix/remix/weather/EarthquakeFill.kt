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

public val WeatherGroup.EarthquakeFill: ImageVector
    get() {
        if (_earthquakeFill != null) {
            return _earthquakeFill!!
        }
        _earthquakeFill = Builder(name = "EarthquakeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.327f, 1.612f)
                curveTo(11.677f, 1.294f, 12.196f, 1.267f, 12.573f, 1.532f)
                lineTo(12.673f, 1.612f)
                lineTo(23.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 20.513f, 19.614f, 20.935f, 19.117f, 20.993f)
                lineTo(19.0f, 21.0f)
                horizontalLineTo(12.5f)
                lineTo(15.0f, 17.0f)
                lineTo(11.5f, 14.0f)
                lineTo(15.5f, 11.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.5f, 6.0f)
                lineTo(10.5f, 9.0f)
                lineTo(13.0f, 11.0f)
                lineTo(8.0f, 14.0f)
                lineTo(11.75f, 17.5f)
                lineTo(8.5f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.487f, 21.0f, 4.064f, 20.614f, 4.007f, 20.117f)
                lineTo(4.0f, 20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                lineTo(11.327f, 1.612f)
                close()
            }
        }
        .build()
        return _earthquakeFill!!
    }

private var _earthquakeFill: ImageVector? = null
