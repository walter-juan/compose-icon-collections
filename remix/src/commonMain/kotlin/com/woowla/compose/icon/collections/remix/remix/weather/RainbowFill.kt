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

public val WeatherGroup.RainbowFill: ImageVector
    get() {
        if (_rainbowFill != null) {
            return _rainbowFill!!
        }
        _rainbowFill = Builder(name = "RainbowFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(18.075f, 4.0f, 23.0f, 8.925f, 23.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                curveTo(20.0f, 10.665f, 16.552f, 7.135f, 12.249f, 7.004f)
                lineTo(12.0f, 7.0f)
                curveTo(7.665f, 7.0f, 4.135f, 10.448f, 4.004f, 14.751f)
                lineTo(4.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 8.925f, 5.925f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(15.866f, 8.0f, 19.0f, 11.134f, 19.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                curveTo(16.0f, 12.858f, 14.316f, 11.109f, 12.2f, 11.005f)
                lineTo(12.0f, 11.0f)
                curveTo(9.858f, 11.0f, 8.109f, 12.684f, 8.005f, 14.8f)
                lineTo(8.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 11.134f, 8.134f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.657f, 12.0f, 15.0f, 13.343f, 15.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 13.343f, 10.343f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _rainbowFill!!
    }

private var _rainbowFill: ImageVector? = null
