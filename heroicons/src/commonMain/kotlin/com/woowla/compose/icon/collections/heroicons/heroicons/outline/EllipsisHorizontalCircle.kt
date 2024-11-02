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

public val OutlineGroup.EllipsisHorizontalCircle: ImageVector
    get() {
        if (_ellipsisHorizontalCircle != null) {
            return _ellipsisHorizontalCircle!!
        }
        _ellipsisHorizontalCircle = Builder(name = "EllipsisHorizontalCircle", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.625f, 12.0f)
                curveTo(8.625f, 12.207f, 8.457f, 12.375f, 8.25f, 12.375f)
                curveTo(8.043f, 12.375f, 7.875f, 12.207f, 7.875f, 12.0f)
                curveTo(7.875f, 11.793f, 8.043f, 11.625f, 8.25f, 11.625f)
                curveTo(8.457f, 11.625f, 8.625f, 11.793f, 8.625f, 12.0f)
                close()
                moveTo(8.625f, 12.0f)
                horizontalLineTo(8.25f)
                moveTo(12.375f, 12.0f)
                curveTo(12.375f, 12.207f, 12.207f, 12.375f, 12.0f, 12.375f)
                curveTo(11.793f, 12.375f, 11.625f, 12.207f, 11.625f, 12.0f)
                curveTo(11.625f, 11.793f, 11.793f, 11.625f, 12.0f, 11.625f)
                curveTo(12.207f, 11.625f, 12.375f, 11.793f, 12.375f, 12.0f)
                close()
                moveTo(12.375f, 12.0f)
                horizontalLineTo(12.0f)
                moveTo(16.125f, 12.0f)
                curveTo(16.125f, 12.207f, 15.957f, 12.375f, 15.75f, 12.375f)
                curveTo(15.543f, 12.375f, 15.375f, 12.207f, 15.375f, 12.0f)
                curveTo(15.375f, 11.793f, 15.543f, 11.625f, 15.75f, 11.625f)
                curveTo(15.957f, 11.625f, 16.125f, 11.793f, 16.125f, 12.0f)
                close()
                moveTo(16.125f, 12.0f)
                horizontalLineTo(15.75f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _ellipsisHorizontalCircle!!
    }

private var _ellipsisHorizontalCircle: ImageVector? = null
