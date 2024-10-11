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

public val MapGroup.TimeZoneLine: ImageVector
    get() {
        if (_timeZoneLine != null) {
            return _timeZoneLine!!
        }
        _timeZoneLine = Builder(name = "TimeZoneLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 9.846f, 4.851f, 7.891f, 6.235f, 6.453f)
                curveTo(6.357f, 6.564f, 6.462f, 6.705f, 6.541f, 6.883f)
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
                curveTo(13.84f, 5.547f, 14.599f, 5.018f, 15.152f, 4.645f)
                curveTo(17.224f, 5.534f, 18.845f, 7.273f, 19.576f, 9.424f)
                curveTo(20.43f, 9.714f, 21.218f, 10.144f, 21.915f, 10.687f)
                curveTo(21.272f, 5.785f, 17.078f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.078f, 5.785f, 21.272f, 10.687f, 21.915f)
                curveTo(10.144f, 21.218f, 9.714f, 20.43f, 9.424f, 19.576f)
                curveTo(6.269f, 18.504f, 4.0f, 15.517f, 4.0f, 12.0f)
                close()
                moveTo(17.0f, 13.0f)
                curveTo(14.791f, 13.0f, 13.0f, 14.791f, 13.0f, 17.0f)
                curveTo(13.0f, 19.209f, 14.791f, 21.0f, 17.0f, 21.0f)
                curveTo(19.209f, 21.0f, 21.0f, 19.209f, 21.0f, 17.0f)
                curveTo(21.0f, 14.791f, 19.209f, 13.0f, 17.0f, 13.0f)
                close()
                moveTo(11.0f, 17.0f)
                curveTo(11.0f, 13.686f, 13.686f, 11.0f, 17.0f, 11.0f)
                curveTo(20.314f, 11.0f, 23.0f, 13.686f, 23.0f, 17.0f)
                curveTo(23.0f, 20.314f, 20.314f, 23.0f, 17.0f, 23.0f)
                curveTo(13.686f, 23.0f, 11.0f, 20.314f, 11.0f, 17.0f)
                close()
                moveTo(16.0f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _timeZoneLine!!
    }

private var _timeZoneLine: ImageVector? = null
