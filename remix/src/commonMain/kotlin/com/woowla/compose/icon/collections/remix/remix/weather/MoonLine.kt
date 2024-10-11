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

public val WeatherGroup.MoonLine: ImageVector
    get() {
        if (_moonLine != null) {
            return _moonLine!!
        }
        _moonLine = Builder(name = "MoonLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                curveTo(10.0f, 10.866f, 13.134f, 14.0f, 17.0f, 14.0f)
                curveTo(18.958f, 14.0f, 20.729f, 13.196f, 22.0f, 11.899f)
                curveTo(22.0f, 11.933f, 22.0f, 11.967f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(12.033f, 2.0f, 12.067f, 2.0f, 12.101f, 2.0f)
                curveTo(10.804f, 3.271f, 10.0f, 5.042f, 10.0f, 7.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(15.058f, 20.0f, 17.716f, 18.284f, 19.062f, 15.762f)
                curveTo(18.395f, 15.919f, 17.704f, 16.0f, 17.0f, 16.0f)
                curveTo(12.029f, 16.0f, 8.0f, 11.971f, 8.0f, 7.0f)
                curveTo(8.0f, 6.296f, 8.081f, 5.605f, 8.238f, 4.938f)
                curveTo(5.716f, 6.284f, 4.0f, 8.942f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _moonLine!!
    }

private var _moonLine: ImageVector? = null
