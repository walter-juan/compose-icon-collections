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

public val WeatherGroup.SunFoggyFill: ImageVector
    get() {
        if (_sunFoggyFill != null) {
            return _sunFoggyFill!!
        }
        _sunFoggyFill = Builder(name = "SunFoggyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.341f, 14.0f)
                curveTo(6.12f, 13.374f, 6.0f, 12.701f, 6.0f, 12.0f)
                curveTo(6.0f, 8.686f, 8.686f, 6.0f, 12.0f, 6.0f)
                curveTo(15.314f, 6.0f, 18.0f, 8.686f, 18.0f, 12.0f)
                curveTo(18.0f, 15.314f, 15.314f, 18.0f, 12.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.341f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(1.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(11.0f, 1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(3.515f, 4.929f)
                lineTo(4.929f, 3.515f)
                lineTo(7.05f, 5.636f)
                lineTo(5.636f, 7.05f)
                lineTo(3.515f, 4.929f)
                close()
                moveTo(16.95f, 18.364f)
                lineTo(18.364f, 16.95f)
                lineTo(20.485f, 19.071f)
                lineTo(19.071f, 20.485f)
                lineTo(16.95f, 18.364f)
                close()
                moveTo(19.071f, 3.515f)
                lineTo(20.485f, 4.929f)
                lineTo(18.364f, 7.05f)
                lineTo(16.95f, 5.636f)
                lineTo(19.071f, 3.515f)
                close()
                moveTo(23.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _sunFoggyFill!!
    }

private var _sunFoggyFill: ImageVector? = null
