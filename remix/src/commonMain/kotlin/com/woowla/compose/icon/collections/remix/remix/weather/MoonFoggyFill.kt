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

public val WeatherGroup.MoonFoggyFill: ImageVector
    get() {
        if (_moonFoggyFill != null) {
            return _moonFoggyFill!!
        }
        _moonFoggyFill = Builder(name = "MoonFoggyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.334f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.332f)
                curveTo(3.116f, 13.203f, 3.0f, 12.365f, 3.0f, 11.5f)
                curveTo(3.0f, 6.94f, 6.213f, 3.13f, 10.5f, 2.211f)
                curveTo(10.177f, 3.079f, 10.0f, 4.019f, 10.0f, 5.0f)
                curveTo(10.0f, 9.418f, 13.582f, 13.0f, 18.0f, 13.0f)
                curveTo(19.453f, 13.0f, 20.816f, 12.613f, 21.99f, 11.935f)
                curveTo(21.818f, 15.758f, 19.387f, 18.992f, 16.0f, 20.334f)
                close()
                moveTo(7.0f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _moonFoggyFill!!
    }

private var _moonFoggyFill: ImageVector? = null
