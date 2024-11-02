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

public val OutlineGroup.ChartBar: ImageVector
    get() {
        if (_chartBar != null) {
            return _chartBar!!
        }
        _chartBar = Builder(name = "ChartBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 13.125f)
                curveTo(3.0f, 12.504f, 3.504f, 12.0f, 4.125f, 12.0f)
                horizontalLineTo(6.375f)
                curveTo(6.996f, 12.0f, 7.5f, 12.504f, 7.5f, 13.125f)
                verticalLineTo(19.875f)
                curveTo(7.5f, 20.496f, 6.996f, 21.0f, 6.375f, 21.0f)
                horizontalLineTo(4.125f)
                curveTo(3.504f, 21.0f, 3.0f, 20.496f, 3.0f, 19.875f)
                verticalLineTo(13.125f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.75f, 8.625f)
                curveTo(9.75f, 8.004f, 10.254f, 7.5f, 10.875f, 7.5f)
                horizontalLineTo(13.125f)
                curveTo(13.746f, 7.5f, 14.25f, 8.004f, 14.25f, 8.625f)
                verticalLineTo(19.875f)
                curveTo(14.25f, 20.496f, 13.746f, 21.0f, 13.125f, 21.0f)
                horizontalLineTo(10.875f)
                curveTo(10.254f, 21.0f, 9.75f, 20.496f, 9.75f, 19.875f)
                verticalLineTo(8.625f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 4.125f)
                curveTo(16.5f, 3.504f, 17.004f, 3.0f, 17.625f, 3.0f)
                horizontalLineTo(19.875f)
                curveTo(20.496f, 3.0f, 21.0f, 3.504f, 21.0f, 4.125f)
                verticalLineTo(19.875f)
                curveTo(21.0f, 20.496f, 20.496f, 21.0f, 19.875f, 21.0f)
                horizontalLineTo(17.625f)
                curveTo(17.004f, 21.0f, 16.5f, 20.496f, 16.5f, 19.875f)
                verticalLineTo(4.125f)
                close()
            }
        }
        .build()
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
