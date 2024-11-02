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

public val SolidGroup.XCircle: ImageVector
    get() {
        if (_xCircle != null) {
            return _xCircle!!
        }
        _xCircle = Builder(name = "XCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(10.28f, 9.22f)
                curveTo(9.987f, 8.927f, 9.513f, 8.927f, 9.22f, 9.22f)
                curveTo(8.927f, 9.513f, 8.927f, 9.987f, 9.22f, 10.28f)
                lineTo(10.939f, 12.0f)
                lineTo(9.22f, 13.72f)
                curveTo(8.927f, 14.013f, 8.927f, 14.487f, 9.22f, 14.78f)
                curveTo(9.513f, 15.073f, 9.987f, 15.073f, 10.28f, 14.78f)
                lineTo(12.0f, 13.061f)
                lineTo(13.72f, 14.78f)
                curveTo(14.013f, 15.073f, 14.487f, 15.073f, 14.78f, 14.78f)
                curveTo(15.073f, 14.487f, 15.073f, 14.013f, 14.78f, 13.72f)
                lineTo(13.061f, 12.0f)
                lineTo(14.78f, 10.28f)
                curveTo(15.073f, 9.987f, 15.073f, 9.513f, 14.78f, 9.22f)
                curveTo(14.487f, 8.927f, 14.013f, 8.927f, 13.72f, 9.22f)
                lineTo(12.0f, 10.939f)
                lineTo(10.28f, 9.22f)
                close()
            }
        }
        .build()
        return _xCircle!!
    }

private var _xCircle: ImageVector? = null
