package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.PhoneLine: ImageVector
    get() {
        if (_phoneLine != null) {
            return _phoneLine!!
        }
        _phoneLine = Builder(name = "PhoneLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.366f, 10.682f)
                curveTo(10.302f, 12.329f, 11.671f, 13.698f, 13.318f, 14.634f)
                lineTo(14.202f, 13.396f)
                curveTo(14.497f, 12.984f, 15.052f, 12.857f, 15.496f, 13.1f)
                curveTo(16.902f, 13.868f, 18.457f, 14.335f, 20.079f, 14.464f)
                curveTo(20.599f, 14.505f, 21.0f, 14.939f, 21.0f, 15.461f)
                verticalLineTo(19.923f)
                curveTo(21.0f, 20.436f, 20.612f, 20.866f, 20.102f, 20.918f)
                curveTo(19.572f, 20.973f, 19.038f, 21.0f, 18.5f, 21.0f)
                curveTo(9.94f, 21.0f, 3.0f, 14.06f, 3.0f, 5.5f)
                curveTo(3.0f, 4.962f, 3.027f, 4.428f, 3.082f, 3.898f)
                curveTo(3.134f, 3.388f, 3.564f, 3.0f, 4.077f, 3.0f)
                horizontalLineTo(8.539f)
                curveTo(9.061f, 3.0f, 9.495f, 3.401f, 9.536f, 3.921f)
                curveTo(9.665f, 5.543f, 10.132f, 7.098f, 10.9f, 8.504f)
                curveTo(11.143f, 8.948f, 11.016f, 9.504f, 10.604f, 9.798f)
                lineTo(9.366f, 10.682f)
                close()
                moveTo(6.844f, 10.025f)
                lineTo(8.744f, 8.668f)
                curveTo(8.205f, 7.505f, 7.836f, 6.272f, 7.647f, 5.0f)
                horizontalLineTo(5.009f)
                curveTo(5.003f, 5.166f, 5.0f, 5.333f, 5.0f, 5.5f)
                curveTo(5.0f, 12.956f, 11.044f, 19.0f, 18.5f, 19.0f)
                curveTo(18.667f, 19.0f, 18.834f, 18.997f, 19.0f, 18.991f)
                verticalLineTo(16.353f)
                curveTo(17.728f, 16.164f, 16.495f, 15.795f, 15.332f, 15.256f)
                lineTo(13.975f, 17.156f)
                curveTo(13.426f, 16.942f, 12.896f, 16.691f, 12.387f, 16.406f)
                lineTo(12.329f, 16.373f)
                curveTo(10.37f, 15.259f, 8.741f, 13.63f, 7.627f, 11.671f)
                lineTo(7.594f, 11.613f)
                curveTo(7.308f, 11.104f, 7.058f, 10.574f, 6.844f, 10.025f)
                close()
            }
        }
        .build()
        return _phoneLine!!
    }

private var _phoneLine: ImageVector? = null
