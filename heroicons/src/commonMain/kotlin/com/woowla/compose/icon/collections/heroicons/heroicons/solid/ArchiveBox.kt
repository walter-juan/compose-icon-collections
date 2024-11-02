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

public val SolidGroup.ArchiveBox: ImageVector
    get() {
        if (_archiveBox != null) {
            return _archiveBox!!
        }
        _archiveBox = Builder(name = "ArchiveBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(9.25f, 12.75f)
                curveTo(9.25f, 12.336f, 9.586f, 12.0f, 10.0f, 12.0f)
                horizontalLineTo(14.0f)
                curveTo(14.414f, 12.0f, 14.75f, 12.336f, 14.75f, 12.75f)
                curveTo(14.75f, 13.164f, 14.414f, 13.5f, 14.0f, 13.5f)
                horizontalLineTo(10.0f)
                curveTo(9.586f, 13.5f, 9.25f, 13.164f, 9.25f, 12.75f)
                close()
            }
        }
        .build()
        return _archiveBox!!
    }

private var _archiveBox: ImageVector? = null
