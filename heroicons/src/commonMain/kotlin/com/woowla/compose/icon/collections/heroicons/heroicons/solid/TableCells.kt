package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.TableCells: ImageVector
    get() {
        if (_tableCells != null) {
            return _tableCells!!
        }
        _tableCells = Builder(name = "TableCells", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 5.625f)
                curveTo(1.5f, 4.589f, 2.339f, 3.75f, 3.375f, 3.75f)
                horizontalLineTo(20.625f)
                curveTo(21.66f, 3.75f, 22.5f, 4.589f, 22.5f, 5.625f)
                verticalLineTo(18.375f)
                curveTo(22.5f, 19.41f, 21.66f, 20.25f, 20.625f, 20.25f)
                horizontalLineTo(3.375f)
                curveTo(2.339f, 20.25f, 1.5f, 19.41f, 1.5f, 18.375f)
                verticalLineTo(5.625f)
                close()
                moveTo(21.0f, 9.375f)
                curveTo(21.0f, 9.168f, 20.832f, 9.0f, 20.625f, 9.0f)
                horizontalLineTo(13.125f)
                curveTo(12.918f, 9.0f, 12.75f, 9.168f, 12.75f, 9.375f)
                verticalLineTo(10.875f)
                curveTo(12.75f, 11.082f, 12.918f, 11.25f, 13.125f, 11.25f)
                horizontalLineTo(20.625f)
                curveTo(20.832f, 11.25f, 21.0f, 11.082f, 21.0f, 10.875f)
                verticalLineTo(9.375f)
                close()
                moveTo(21.0f, 13.125f)
                curveTo(21.0f, 12.918f, 20.832f, 12.75f, 20.625f, 12.75f)
                horizontalLineTo(13.125f)
                curveTo(12.918f, 12.75f, 12.75f, 12.918f, 12.75f, 13.125f)
                verticalLineTo(14.625f)
                curveTo(12.75f, 14.832f, 12.918f, 15.0f, 13.125f, 15.0f)
                horizontalLineTo(20.625f)
                curveTo(20.832f, 15.0f, 21.0f, 14.832f, 21.0f, 14.625f)
                verticalLineTo(13.125f)
                close()
                moveTo(21.0f, 16.875f)
                curveTo(21.0f, 16.668f, 20.832f, 16.5f, 20.625f, 16.5f)
                horizontalLineTo(13.125f)
                curveTo(12.918f, 16.5f, 12.75f, 16.668f, 12.75f, 16.875f)
                verticalLineTo(18.375f)
                curveTo(12.75f, 18.582f, 12.918f, 18.75f, 13.125f, 18.75f)
                horizontalLineTo(20.625f)
                curveTo(20.832f, 18.75f, 21.0f, 18.582f, 21.0f, 18.375f)
                verticalLineTo(16.875f)
                close()
                moveTo(10.875f, 18.75f)
                curveTo(11.082f, 18.75f, 11.25f, 18.582f, 11.25f, 18.375f)
                verticalLineTo(16.875f)
                curveTo(11.25f, 16.668f, 11.082f, 16.5f, 10.875f, 16.5f)
                horizontalLineTo(3.375f)
                curveTo(3.168f, 16.5f, 3.0f, 16.668f, 3.0f, 16.875f)
                verticalLineTo(18.375f)
                curveTo(3.0f, 18.582f, 3.168f, 18.75f, 3.375f, 18.75f)
                horizontalLineTo(10.875f)
                close()
                moveTo(3.375f, 15.0f)
                horizontalLineTo(10.875f)
                curveTo(11.082f, 15.0f, 11.25f, 14.832f, 11.25f, 14.625f)
                verticalLineTo(13.125f)
                curveTo(11.25f, 12.918f, 11.082f, 12.75f, 10.875f, 12.75f)
                horizontalLineTo(3.375f)
                curveTo(3.168f, 12.75f, 3.0f, 12.918f, 3.0f, 13.125f)
                verticalLineTo(14.625f)
                curveTo(3.0f, 14.832f, 3.168f, 15.0f, 3.375f, 15.0f)
                close()
                moveTo(3.375f, 11.25f)
                horizontalLineTo(10.875f)
                curveTo(11.082f, 11.25f, 11.25f, 11.082f, 11.25f, 10.875f)
                verticalLineTo(9.375f)
                curveTo(11.25f, 9.168f, 11.082f, 9.0f, 10.875f, 9.0f)
                horizontalLineTo(3.375f)
                curveTo(3.168f, 9.0f, 3.0f, 9.168f, 3.0f, 9.375f)
                verticalLineTo(10.875f)
                curveTo(3.0f, 11.082f, 3.168f, 11.25f, 3.375f, 11.25f)
                close()
            }
        }
        .build()
        return _tableCells!!
    }

private var _tableCells: ImageVector? = null
