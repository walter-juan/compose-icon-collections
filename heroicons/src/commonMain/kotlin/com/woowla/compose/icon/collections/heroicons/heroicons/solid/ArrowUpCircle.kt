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

public val SolidGroup.ArrowUpCircle: ImageVector
    get() {
        if (_arrowUpCircle != null) {
            return _arrowUpCircle!!
        }
        _arrowUpCircle = Builder(name = "ArrowUpCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(12.53f, 7.72f)
                curveTo(12.39f, 7.579f, 12.199f, 7.5f, 12.0f, 7.5f)
                curveTo(11.801f, 7.5f, 11.61f, 7.579f, 11.47f, 7.72f)
                lineTo(8.47f, 10.72f)
                curveTo(8.177f, 11.013f, 8.177f, 11.487f, 8.47f, 11.78f)
                curveTo(8.763f, 12.073f, 9.237f, 12.073f, 9.53f, 11.78f)
                lineTo(11.25f, 10.061f)
                lineTo(11.25f, 15.75f)
                curveTo(11.25f, 16.164f, 11.586f, 16.5f, 12.0f, 16.5f)
                curveTo(12.414f, 16.5f, 12.75f, 16.164f, 12.75f, 15.75f)
                lineTo(12.75f, 10.061f)
                lineTo(14.47f, 11.78f)
                curveTo(14.763f, 12.073f, 15.237f, 12.073f, 15.53f, 11.78f)
                curveTo(15.823f, 11.487f, 15.823f, 11.013f, 15.53f, 10.72f)
                lineTo(12.53f, 7.72f)
                close()
            }
        }
        .build()
        return _arrowUpCircle!!
    }

private var _arrowUpCircle: ImageVector? = null
