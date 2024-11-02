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

public val OutlineGroup.Cake: ImageVector
    get() {
        if (_cake != null) {
            return _cake!!
        }
        _cake = Builder(name = "Cake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.25f)
                verticalLineTo(6.75f)
                moveTo(12.0f, 8.25f)
                curveTo(10.645f, 8.25f, 9.303f, 8.306f, 7.976f, 8.416f)
                curveTo(6.845f, 8.51f, 6.0f, 9.473f, 6.0f, 10.608f)
                verticalLineTo(13.121f)
                moveTo(12.0f, 8.25f)
                curveTo(13.355f, 8.25f, 14.697f, 8.306f, 16.024f, 8.416f)
                curveTo(17.155f, 8.51f, 18.0f, 9.473f, 18.0f, 10.608f)
                verticalLineTo(13.121f)
                moveTo(15.0f, 8.25f)
                verticalLineTo(6.75f)
                moveTo(9.0f, 8.25f)
                verticalLineTo(6.75f)
                moveTo(21.0f, 16.5f)
                lineTo(19.5f, 17.25f)
                curveTo(18.556f, 17.722f, 17.444f, 17.722f, 16.5f, 17.25f)
                curveTo(15.556f, 16.778f, 14.444f, 16.778f, 13.5f, 17.25f)
                curveTo(12.556f, 17.722f, 11.444f, 17.722f, 10.5f, 17.25f)
                curveTo(9.556f, 16.778f, 8.444f, 16.778f, 7.5f, 17.25f)
                curveTo(6.556f, 17.722f, 5.444f, 17.722f, 4.5f, 17.25f)
                lineTo(3.0f, 16.5f)
                moveTo(18.0f, 13.121f)
                curveTo(16.034f, 12.876f, 14.032f, 12.75f, 12.0f, 12.75f)
                curveTo(9.968f, 12.75f, 7.966f, 12.876f, 6.0f, 13.121f)
                moveTo(18.0f, 13.121f)
                curveTo(18.389f, 13.17f, 18.777f, 13.223f, 19.163f, 13.281f)
                curveTo(20.232f, 13.441f, 21.0f, 14.375f, 21.0f, 15.456f)
                verticalLineTo(20.625f)
                curveTo(21.0f, 21.246f, 20.496f, 21.75f, 19.875f, 21.75f)
                horizontalLineTo(4.125f)
                curveTo(3.504f, 21.75f, 3.0f, 21.246f, 3.0f, 20.625f)
                verticalLineTo(15.456f)
                curveTo(3.0f, 14.375f, 3.768f, 13.441f, 4.837f, 13.281f)
                curveTo(5.223f, 13.223f, 5.611f, 13.17f, 6.0f, 13.121f)
                moveTo(12.265f, 3.11f)
                curveTo(12.412f, 3.256f, 12.412f, 3.494f, 12.265f, 3.64f)
                curveTo(12.119f, 3.787f, 11.881f, 3.787f, 11.735f, 3.64f)
                curveTo(11.588f, 3.494f, 11.588f, 3.256f, 11.735f, 3.11f)
                curveTo(11.81f, 3.034f, 12.0f, 2.845f, 12.0f, 2.845f)
                curveTo(12.0f, 2.845f, 12.194f, 3.039f, 12.265f, 3.11f)
                close()
                moveTo(9.265f, 3.11f)
                curveTo(9.412f, 3.256f, 9.412f, 3.494f, 9.265f, 3.64f)
                curveTo(9.119f, 3.787f, 8.881f, 3.787f, 8.735f, 3.64f)
                curveTo(8.588f, 3.494f, 8.588f, 3.256f, 8.735f, 3.11f)
                curveTo(8.81f, 3.034f, 9.0f, 2.845f, 9.0f, 2.845f)
                curveTo(9.0f, 2.845f, 9.194f, 3.039f, 9.265f, 3.11f)
                close()
                moveTo(15.265f, 3.11f)
                curveTo(15.412f, 3.256f, 15.412f, 3.494f, 15.265f, 3.64f)
                curveTo(15.119f, 3.787f, 14.881f, 3.787f, 14.735f, 3.64f)
                curveTo(14.588f, 3.494f, 14.588f, 3.256f, 14.735f, 3.11f)
                curveTo(14.81f, 3.034f, 15.0f, 2.845f, 15.0f, 2.845f)
                curveTo(15.0f, 2.845f, 15.194f, 3.039f, 15.265f, 3.11f)
                close()
            }
        }
        .build()
        return _cake!!
    }

private var _cake: ImageVector? = null
