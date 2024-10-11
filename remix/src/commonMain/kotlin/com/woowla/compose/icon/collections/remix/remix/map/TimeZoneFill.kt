package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.TimeZoneFill: ImageVector
    get() {
        if (_timeZoneFill != null) {
            return _timeZoneFill!!
        }
        _timeZoneFill = Builder(name = "TimeZoneFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.078f, 2.0f, 21.272f, 5.785f, 21.915f, 10.687f)
                curveTo(20.559f, 9.63f, 18.853f, 9.0f, 17.0f, 9.0f)
                curveTo(12.582f, 9.0f, 9.0f, 12.582f, 9.0f, 17.0f)
                curveTo(9.0f, 18.853f, 9.63f, 20.559f, 10.687f, 21.915f)
                curveTo(5.785f, 21.272f, 2.0f, 17.078f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.833f)
                curveTo(9.683f, 3.833f, 7.591f, 4.799f, 6.104f, 6.349f)
                curveTo(6.281f, 6.472f, 6.435f, 6.645f, 6.541f, 6.883f)
                curveTo(6.745f, 7.34f, 6.745f, 7.811f, 6.745f, 8.228f)
                curveTo(6.745f, 8.556f, 6.744f, 8.867f, 6.85f, 9.093f)
                curveTo(6.994f, 9.401f, 7.616f, 9.532f, 8.165f, 9.647f)
                lineTo(8.185f, 9.651f)
                curveTo(8.375f, 9.691f, 8.57f, 9.733f, 8.748f, 9.782f)
                curveTo(9.254f, 9.922f, 9.646f, 10.377f, 9.959f, 10.741f)
                curveTo(10.09f, 10.893f, 10.282f, 11.116f, 10.378f, 11.172f)
                curveTo(10.429f, 11.136f, 10.59f, 10.961f, 10.67f, 10.674f)
                curveTo(10.731f, 10.455f, 10.713f, 10.26f, 10.624f, 10.154f)
                curveTo(10.065f, 9.494f, 10.095f, 8.223f, 10.268f, 7.755f)
                curveTo(10.54f, 7.016f, 11.391f, 7.071f, 12.012f, 7.111f)
                lineTo(12.018f, 7.111f)
                curveTo(12.247f, 7.126f, 12.464f, 7.14f, 12.626f, 7.12f)
                curveTo(13.097f, 7.061f, 13.321f, 6.504f, 13.461f, 6.156f)
                curveTo(13.506f, 6.045f, 13.542f, 5.955f, 13.575f, 5.91f)
                curveTo(13.867f, 5.51f, 14.761f, 4.907f, 15.316f, 4.535f)
                curveTo(14.302f, 4.084f, 13.181f, 3.833f, 12.0f, 3.833f)
                close()
                moveTo(23.0f, 17.0f)
                curveTo(23.0f, 20.314f, 20.314f, 23.0f, 17.0f, 23.0f)
                curveTo(13.686f, 23.0f, 11.0f, 20.314f, 11.0f, 17.0f)
                curveTo(11.0f, 13.686f, 13.686f, 11.0f, 17.0f, 11.0f)
                curveTo(20.314f, 11.0f, 23.0f, 13.686f, 23.0f, 17.0f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _timeZoneFill!!
    }

private var _timeZoneFill: ImageVector? = null
