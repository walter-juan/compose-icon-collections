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

public val WeatherGroup.SunCloudyLine: ImageVector
    get() {
        if (_sunCloudyLine != null) {
            return _sunCloudyLine!!
        }
        _sunCloudyLine = Builder(name = "SunCloudyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.984f, 5.06f)
                curveTo(11.132f, 3.222f, 13.173f, 2.0f, 15.5f, 2.0f)
                curveTo(19.09f, 2.0f, 22.0f, 4.91f, 22.0f, 8.5f)
                curveTo(22.0f, 9.58f, 21.736f, 10.599f, 21.27f, 11.495f)
                curveTo(22.335f, 12.498f, 23.0f, 13.922f, 23.0f, 15.5f)
                curveTo(23.0f, 18.538f, 20.538f, 21.0f, 17.5f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(4.582f, 21.0f, 1.0f, 17.418f, 1.0f, 13.0f)
                curveTo(1.0f, 8.582f, 4.582f, 5.0f, 9.0f, 5.0f)
                curveTo(9.333f, 5.0f, 9.661f, 5.02f, 9.984f, 5.06f)
                close()
                moveTo(12.055f, 5.604f)
                curveTo(14.068f, 6.436f, 15.666f, 8.066f, 16.458f, 10.099f)
                curveTo(16.795f, 10.034f, 17.144f, 10.0f, 17.5f, 10.0f)
                curveTo(18.235f, 10.0f, 18.937f, 10.144f, 19.578f, 10.406f)
                curveTo(19.849f, 9.827f, 20.0f, 9.181f, 20.0f, 8.5f)
                curveTo(20.0f, 6.015f, 17.985f, 4.0f, 15.5f, 4.0f)
                curveTo(14.118f, 4.0f, 12.881f, 4.623f, 12.055f, 5.604f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(19.433f, 19.0f, 21.0f, 17.433f, 21.0f, 15.5f)
                curveTo(21.0f, 13.567f, 19.433f, 12.0f, 17.5f, 12.0f)
                curveTo(16.521f, 12.0f, 15.635f, 12.402f, 15.0f, 13.051f)
                curveTo(15.0f, 13.034f, 15.0f, 13.017f, 15.0f, 13.0f)
                curveTo(15.0f, 9.686f, 12.314f, 7.0f, 9.0f, 7.0f)
                curveTo(5.686f, 7.0f, 3.0f, 9.686f, 3.0f, 13.0f)
                curveTo(3.0f, 16.314f, 5.686f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _sunCloudyLine!!
    }

private var _sunCloudyLine: ImageVector? = null
