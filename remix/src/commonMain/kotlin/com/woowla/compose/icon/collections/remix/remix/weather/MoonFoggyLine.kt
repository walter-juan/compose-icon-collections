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

public val WeatherGroup.MoonFoggyLine: ImageVector
    get() {
        if (_moonFoggyLine != null) {
            return _moonFoggyLine!!
        }
        _moonFoggyLine = Builder(name = "MoonFoggyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.334f)
                verticalLineTo(18.135f)
                curveTo(17.699f, 17.237f, 19.012f, 15.705f, 19.623f, 13.854f)
                curveTo(19.093f, 13.95f, 18.55f, 14.0f, 18.0f, 14.0f)
                curveTo(13.029f, 14.0f, 9.0f, 9.971f, 9.0f, 5.0f)
                curveTo(9.0f, 4.954f, 9.0f, 4.909f, 9.001f, 4.863f)
                curveTo(7.041f, 5.899f, 5.603f, 7.776f, 5.15f, 10.0f)
                horizontalLineTo(3.118f)
                curveTo(3.794f, 5.738f, 7.304f, 2.42f, 11.656f, 2.037f)
                curveTo(11.235f, 2.937f, 11.0f, 3.941f, 11.0f, 5.0f)
                curveTo(11.0f, 8.866f, 14.134f, 12.0f, 18.0f, 12.0f)
                curveTo(19.475f, 12.0f, 20.844f, 11.544f, 21.972f, 10.765f)
                curveTo(21.99f, 11.007f, 22.0f, 11.253f, 22.0f, 11.5f)
                curveTo(22.0f, 15.511f, 19.515f, 18.941f, 16.0f, 20.334f)
                close()
                moveTo(7.0f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
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
        return _moonFoggyLine!!
    }

private var _moonFoggyLine: ImageVector? = null
