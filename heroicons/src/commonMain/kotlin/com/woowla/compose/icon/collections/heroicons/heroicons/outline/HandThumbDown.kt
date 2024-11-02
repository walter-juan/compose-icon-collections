package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.HandThumbDown: ImageVector
    get() {
        if (_handThumbDown != null) {
            return _handThumbDown!!
        }
        _handThumbDown = Builder(name = "HandThumbDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.498f, 15.25f)
                horizontalLineTo(4.372f)
                curveTo(3.346f, 15.25f, 2.427f, 14.556f, 2.318f, 13.535f)
                curveTo(2.273f, 13.113f, 2.25f, 12.684f, 2.25f, 12.25f)
                curveTo(2.25f, 9.402f, 3.242f, 6.786f, 4.899f, 4.729f)
                curveTo(5.287f, 4.247f, 5.886f, 4.0f, 6.504f, 4.0f)
                lineTo(10.52f, 4.0f)
                curveTo(11.003f, 4.0f, 11.484f, 4.078f, 11.943f, 4.231f)
                lineTo(15.057f, 5.269f)
                curveTo(15.516f, 5.422f, 15.997f, 5.5f, 16.48f, 5.5f)
                lineTo(17.774f, 5.5f)
                moveTo(7.498f, 15.25f)
                curveTo(8.116f, 15.25f, 8.489f, 15.974f, 8.223f, 16.532f)
                curveTo(7.76f, 17.507f, 7.5f, 18.598f, 7.5f, 19.75f)
                curveTo(7.5f, 20.993f, 8.507f, 22.0f, 9.75f, 22.0f)
                curveTo(10.164f, 22.0f, 10.5f, 21.664f, 10.5f, 21.25f)
                verticalLineTo(20.617f)
                curveTo(10.5f, 20.044f, 10.609f, 19.477f, 10.822f, 18.945f)
                curveTo(11.126f, 18.186f, 11.752f, 17.614f, 12.474f, 17.23f)
                curveTo(13.588f, 16.637f, 14.563f, 15.816f, 15.336f, 14.83f)
                curveTo(15.833f, 14.196f, 16.561f, 13.75f, 17.367f, 13.75f)
                horizontalLineTo(17.751f)
                moveTo(7.498f, 15.25f)
                horizontalLineTo(9.7f)
                moveTo(17.774f, 5.5f)
                curveTo(17.785f, 5.55f, 17.802f, 5.6f, 17.826f, 5.648f)
                curveTo(18.417f, 6.847f, 18.75f, 8.197f, 18.75f, 9.625f)
                curveTo(18.75f, 11.112f, 18.389f, 12.514f, 17.751f, 13.75f)
                moveTo(17.774f, 5.5f)
                curveTo(17.698f, 5.135f, 17.958f, 4.75f, 18.349f, 4.75f)
                horizontalLineTo(19.257f)
                curveTo(20.146f, 4.75f, 20.97f, 5.268f, 21.229f, 6.118f)
                curveTo(21.568f, 7.227f, 21.75f, 8.405f, 21.75f, 9.625f)
                curveTo(21.75f, 11.177f, 21.455f, 12.661f, 20.919f, 14.023f)
                curveTo(20.614f, 14.797f, 19.833f, 15.25f, 19.001f, 15.25f)
                horizontalLineTo(17.948f)
                curveTo(17.476f, 15.25f, 17.203f, 14.694f, 17.448f, 14.291f)
                curveTo(17.555f, 14.114f, 17.656f, 13.934f, 17.751f, 13.75f)
            }
        }
        .build()
        return _handThumbDown!!
    }

private var _handThumbDown: ImageVector? = null
