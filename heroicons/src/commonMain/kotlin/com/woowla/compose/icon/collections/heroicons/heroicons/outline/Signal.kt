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

public val OutlineGroup.Signal: ImageVector
    get() {
        if (_signal != null) {
            return _signal!!
        }
        _signal = Builder(name = "Signal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.348f, 14.652f)
                curveTo(7.884f, 13.187f, 7.884f, 10.813f, 9.348f, 9.348f)
                moveTo(14.652f, 9.348f)
                curveTo(16.116f, 10.813f, 16.116f, 13.187f, 14.652f, 14.652f)
                moveTo(7.227f, 16.773f)
                curveTo(4.591f, 14.137f, 4.591f, 9.863f, 7.227f, 7.227f)
                moveTo(16.773f, 7.227f)
                curveTo(19.409f, 9.863f, 19.409f, 14.137f, 16.773f, 16.773f)
                moveTo(5.106f, 18.894f)
                curveTo(1.298f, 15.087f, 1.298f, 8.913f, 5.106f, 5.106f)
                moveTo(18.894f, 5.106f)
                curveTo(22.702f, 8.913f, 22.702f, 15.087f, 18.894f, 18.894f)
                moveTo(12.0f, 12.0f)
                horizontalLineTo(12.007f)
                verticalLineTo(12.007f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(12.375f, 12.0f)
                curveTo(12.375f, 12.207f, 12.207f, 12.375f, 12.0f, 12.375f)
                curveTo(11.793f, 12.375f, 11.625f, 12.207f, 11.625f, 12.0f)
                curveTo(11.625f, 11.793f, 11.793f, 11.625f, 12.0f, 11.625f)
                curveTo(12.207f, 11.625f, 12.375f, 11.793f, 12.375f, 12.0f)
                close()
            }
        }
        .build()
        return _signal!!
    }

private var _signal: ImageVector? = null
