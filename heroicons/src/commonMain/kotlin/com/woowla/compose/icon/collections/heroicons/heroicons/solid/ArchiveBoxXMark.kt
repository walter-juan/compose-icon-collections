package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ArchiveBoxXMark: ImageVector
    get() {
        if (_archiveBoxXMark != null) {
            return _archiveBoxXMark!!
        }
        _archiveBoxXMark = Builder(name = "ArchiveBoxXMark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.375f, 3.0f)
                curveTo(2.339f, 3.0f, 1.5f, 3.839f, 1.5f, 4.875f)
                verticalLineTo(5.625f)
                curveTo(1.5f, 6.661f, 2.339f, 7.5f, 3.375f, 7.5f)
                horizontalLineTo(20.625f)
                curveTo(21.66f, 7.5f, 22.5f, 6.661f, 22.5f, 5.625f)
                verticalLineTo(4.875f)
                curveTo(22.5f, 3.839f, 21.66f, 3.0f, 20.625f, 3.0f)
                horizontalLineTo(3.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.087f, 9.0f)
                lineTo(3.627f, 18.176f)
                curveTo(3.72f, 19.762f, 5.033f, 21.0f, 6.621f, 21.0f)
                horizontalLineTo(17.378f)
                curveTo(18.967f, 21.0f, 20.28f, 19.762f, 20.373f, 18.176f)
                lineTo(20.913f, 9.0f)
                horizontalLineTo(3.087f)
                close()
                moveTo(9.22f, 11.845f)
                curveTo(9.513f, 11.552f, 9.987f, 11.552f, 10.28f, 11.845f)
                lineTo(12.0f, 13.564f)
                lineTo(13.72f, 11.845f)
                curveTo(14.013f, 11.552f, 14.487f, 11.552f, 14.78f, 11.845f)
                curveTo(15.073f, 12.138f, 15.073f, 12.612f, 14.78f, 12.905f)
                lineTo(13.061f, 14.625f)
                lineTo(14.78f, 16.345f)
                curveTo(15.073f, 16.638f, 15.073f, 17.112f, 14.78f, 17.405f)
                curveTo(14.487f, 17.698f, 14.013f, 17.698f, 13.72f, 17.405f)
                lineTo(12.0f, 15.686f)
                lineTo(10.28f, 17.405f)
                curveTo(9.987f, 17.698f, 9.513f, 17.698f, 9.22f, 17.405f)
                curveTo(8.927f, 17.112f, 8.927f, 16.638f, 9.22f, 16.345f)
                lineTo(10.939f, 14.625f)
                lineTo(9.22f, 12.905f)
                curveTo(8.927f, 12.612f, 8.927f, 12.138f, 9.22f, 11.845f)
                close()
            }
        }
        .build()
        return _archiveBoxXMark!!
    }

private var _archiveBoxXMark: ImageVector? = null
