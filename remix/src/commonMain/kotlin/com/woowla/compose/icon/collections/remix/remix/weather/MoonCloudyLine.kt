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

public val WeatherGroup.MoonCloudyLine: ImageVector
    get() {
        if (_moonCloudyLine != null) {
            return _moonCloudyLine!!
        }
        _moonCloudyLine = Builder(name = "MoonCloudyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.67f, 5.007f)
                curveTo(9.793f, 2.638f, 12.205f, 1.0f, 15.0f, 1.0f)
                curveTo(15.416f, 1.0f, 15.824f, 1.036f, 16.22f, 1.106f)
                curveTo(16.077f, 1.545f, 16.0f, 2.013f, 16.0f, 2.5f)
                curveTo(16.0f, 4.985f, 18.015f, 7.0f, 20.5f, 7.0f)
                curveTo(20.987f, 7.0f, 21.455f, 6.923f, 21.894f, 6.78f)
                curveTo(21.964f, 7.176f, 22.0f, 7.584f, 22.0f, 8.0f)
                curveTo(22.0f, 9.223f, 21.687f, 10.372f, 21.135f, 11.373f)
                curveTo(22.279f, 12.381f, 23.0f, 13.856f, 23.0f, 15.5f)
                curveTo(23.0f, 18.538f, 20.538f, 21.0f, 17.5f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(4.582f, 21.0f, 1.0f, 17.418f, 1.0f, 13.0f)
                curveTo(1.0f, 8.692f, 4.405f, 5.179f, 8.67f, 5.007f)
                close()
                moveTo(10.847f, 5.214f)
                curveTo(13.42f, 5.823f, 15.514f, 7.674f, 16.458f, 10.099f)
                curveTo(16.795f, 10.034f, 17.144f, 10.0f, 17.5f, 10.0f)
                curveTo(18.174f, 10.0f, 18.821f, 10.121f, 19.418f, 10.344f)
                curveTo(19.643f, 9.919f, 19.809f, 9.459f, 19.905f, 8.973f)
                curveTo(16.79f, 8.691f, 14.309f, 6.21f, 14.027f, 3.095f)
                curveTo(12.706f, 3.355f, 11.572f, 4.136f, 10.847f, 5.214f)
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
        return _moonCloudyLine!!
    }

private var _moonCloudyLine: ImageVector? = null
