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

public val OutlineGroup.SignalSlash: ImageVector
    get() {
        if (_signalSlash != null) {
            return _signalSlash!!
        }
        _signalSlash = Builder(name = "SignalSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineTo(11.735f, 11.735f)
                moveTo(11.735f, 11.735f)
                curveTo(11.803f, 11.667f, 11.896f, 11.625f, 12.0f, 11.625f)
                curveTo(12.207f, 11.625f, 12.375f, 11.793f, 12.375f, 12.0f)
                curveTo(12.375f, 12.104f, 12.333f, 12.197f, 12.265f, 12.265f)
                moveTo(11.735f, 11.735f)
                lineTo(12.265f, 12.265f)
                moveTo(12.265f, 12.265f)
                lineTo(21.0f, 21.0f)
                moveTo(14.652f, 9.348f)
                curveTo(16.116f, 10.813f, 16.116f, 13.187f, 14.652f, 14.652f)
                moveTo(16.773f, 7.227f)
                curveTo(19.409f, 9.863f, 19.409f, 14.137f, 16.773f, 16.773f)
                moveTo(18.894f, 5.106f)
                curveTo(22.702f, 8.913f, 22.702f, 15.087f, 18.894f, 18.894f)
                moveTo(9.348f, 14.652f)
                curveTo(8.751f, 14.055f, 8.398f, 13.306f, 8.287f, 12.53f)
                moveTo(7.227f, 16.773f)
                curveTo(5.353f, 14.899f, 4.811f, 12.197f, 5.602f, 9.844f)
                moveTo(5.106f, 18.894f)
                curveTo(2.038f, 15.827f, 1.442f, 11.224f, 3.317f, 7.56f)
                moveTo(12.0f, 12.0f)
                horizontalLineTo(12.007f)
                verticalLineTo(12.007f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _signalSlash!!
    }

private var _signalSlash: ImageVector? = null
