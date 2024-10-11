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

public val WeatherGroup.MoonFill: ImageVector
    get() {
        if (_moonFill != null) {
            return _moonFill!!
        }
        _moonFill = Builder(name = "MoonFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.381f, 2.019f)
                curveTo(9.916f, 3.388f, 9.0f, 5.337f, 9.0f, 7.5f)
                curveTo(9.0f, 11.642f, 12.358f, 15.0f, 16.5f, 15.0f)
                curveTo(18.663f, 15.0f, 20.612f, 14.084f, 21.981f, 12.619f)
                curveTo(21.661f, 17.854f, 17.315f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.685f, 6.146f, 2.339f, 11.381f, 2.019f)
                close()
            }
        }
        .build()
        return _moonFill!!
    }

private var _moonFill: ImageVector? = null
