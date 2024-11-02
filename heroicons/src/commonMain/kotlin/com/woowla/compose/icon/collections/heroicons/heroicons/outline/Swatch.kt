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

public val OutlineGroup.Swatch: ImageVector
    get() {
        if (_swatch != null) {
            return _swatch!!
        }
        _swatch = Builder(name = "Swatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.098f, 19.902f)
                curveTo(5.563f, 21.366f, 7.937f, 21.366f, 9.402f, 19.902f)
                lineTo(15.803f, 13.5f)
                moveTo(6.75f, 21.0f)
                curveTo(4.679f, 21.0f, 3.0f, 19.321f, 3.0f, 17.25f)
                verticalLineTo(4.125f)
                curveTo(3.0f, 3.504f, 3.504f, 3.0f, 4.125f, 3.0f)
                horizontalLineTo(9.375f)
                curveTo(9.996f, 3.0f, 10.5f, 3.504f, 10.5f, 4.125f)
                verticalLineTo(8.197f)
                moveTo(6.75f, 21.0f)
                curveTo(8.821f, 21.0f, 10.5f, 19.321f, 10.5f, 17.25f)
                verticalLineTo(8.197f)
                moveTo(6.75f, 21.0f)
                horizontalLineTo(19.875f)
                curveTo(20.496f, 21.0f, 21.0f, 20.496f, 21.0f, 19.875f)
                verticalLineTo(14.625f)
                curveTo(21.0f, 14.004f, 20.496f, 13.5f, 19.875f, 13.5f)
                horizontalLineTo(15.803f)
                moveTo(10.5f, 8.197f)
                lineTo(13.379f, 5.318f)
                curveTo(13.818f, 4.878f, 14.531f, 4.878f, 14.97f, 5.318f)
                lineTo(18.682f, 9.03f)
                curveTo(19.122f, 9.469f, 19.122f, 10.182f, 18.682f, 10.621f)
                lineTo(15.803f, 13.5f)
                moveTo(6.75f, 17.25f)
                horizontalLineTo(6.758f)
                verticalLineTo(17.257f)
                horizontalLineTo(6.75f)
                verticalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _swatch!!
    }

private var _swatch: ImageVector? = null
