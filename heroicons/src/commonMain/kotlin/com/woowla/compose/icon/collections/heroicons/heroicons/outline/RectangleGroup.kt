package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.RectangleGroup: ImageVector
    get() {
        if (_rectangleGroup != null) {
            return _rectangleGroup!!
        }
        _rectangleGroup = Builder(name = "RectangleGroup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 7.125f)
                curveTo(2.25f, 6.504f, 2.754f, 6.0f, 3.375f, 6.0f)
                horizontalLineTo(9.375f)
                curveTo(9.996f, 6.0f, 10.5f, 6.504f, 10.5f, 7.125f)
                verticalLineTo(10.875f)
                curveTo(10.5f, 11.496f, 9.996f, 12.0f, 9.375f, 12.0f)
                horizontalLineTo(3.375f)
                curveTo(2.754f, 12.0f, 2.25f, 11.496f, 2.25f, 10.875f)
                verticalLineTo(7.125f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.25f, 8.625f)
                curveTo(14.25f, 8.004f, 14.754f, 7.5f, 15.375f, 7.5f)
                horizontalLineTo(20.625f)
                curveTo(21.246f, 7.5f, 21.75f, 8.004f, 21.75f, 8.625f)
                verticalLineTo(16.875f)
                curveTo(21.75f, 17.496f, 21.246f, 18.0f, 20.625f, 18.0f)
                horizontalLineTo(15.375f)
                curveTo(14.754f, 18.0f, 14.25f, 17.496f, 14.25f, 16.875f)
                verticalLineTo(8.625f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 16.125f)
                curveTo(3.75f, 15.504f, 4.254f, 15.0f, 4.875f, 15.0f)
                horizontalLineTo(10.125f)
                curveTo(10.746f, 15.0f, 11.25f, 15.504f, 11.25f, 16.125f)
                verticalLineTo(18.375f)
                curveTo(11.25f, 18.996f, 10.746f, 19.5f, 10.125f, 19.5f)
                horizontalLineTo(4.875f)
                curveTo(4.254f, 19.5f, 3.75f, 18.996f, 3.75f, 18.375f)
                verticalLineTo(16.125f)
                close()
            }
        }
        .build()
        return _rectangleGroup!!
    }

private var _rectangleGroup: ImageVector? = null
