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

public val WeatherGroup.CloudyLine: ImageVector
    get() {
        if (_cloudyLine != null) {
            return _cloudyLine!!
        }
        _cloudyLine = Builder(name = "CloudyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 6.0f)
                curveTo(5.91f, 6.0f, 3.0f, 8.91f, 3.0f, 12.5f)
                curveTo(3.0f, 16.09f, 5.91f, 19.0f, 9.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 19.0f, 21.0f, 16.985f, 21.0f, 14.5f)
                curveTo(21.0f, 12.015f, 18.985f, 10.0f, 16.5f, 10.0f)
                curveTo(16.172f, 10.0f, 15.852f, 10.035f, 15.543f, 10.102f)
                curveTo(14.589f, 7.699f, 12.243f, 6.0f, 9.5f, 6.0f)
                close()
                moveTo(16.5f, 21.0f)
                horizontalLineTo(9.5f)
                curveTo(4.806f, 21.0f, 1.0f, 17.194f, 1.0f, 12.5f)
                curveTo(1.0f, 7.806f, 4.806f, 4.0f, 9.5f, 4.0f)
                curveTo(12.543f, 4.0f, 15.213f, 5.599f, 16.715f, 8.003f)
                curveTo(20.205f, 8.117f, 23.0f, 10.982f, 23.0f, 14.5f)
                curveTo(23.0f, 18.09f, 20.09f, 21.0f, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return _cloudyLine!!
    }

private var _cloudyLine: ImageVector? = null
