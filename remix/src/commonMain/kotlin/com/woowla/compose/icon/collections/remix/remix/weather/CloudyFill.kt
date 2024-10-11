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

public val WeatherGroup.CloudyFill: ImageVector
    get() {
        if (_cloudyFill != null) {
            return _cloudyFill!!
        }
        _cloudyFill = Builder(name = "CloudyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.986f)
                curveTo(4.538f, 20.727f, 1.0f, 17.027f, 1.0f, 12.5f)
                curveTo(1.0f, 7.806f, 4.806f, 4.0f, 9.5f, 4.0f)
                curveTo(12.543f, 4.0f, 15.213f, 5.599f, 16.715f, 8.003f)
                curveTo(20.205f, 8.117f, 23.0f, 10.982f, 23.0f, 14.5f)
                curveTo(23.0f, 17.922f, 20.356f, 20.726f, 17.0f, 20.981f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.986f)
                close()
            }
        }
        .build()
        return _cloudyFill!!
    }

private var _cloudyFill: ImageVector? = null
