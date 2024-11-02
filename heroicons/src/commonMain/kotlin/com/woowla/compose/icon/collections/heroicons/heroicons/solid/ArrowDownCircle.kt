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

public val SolidGroup.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) {
            return _arrowDownCircle!!
        }
        _arrowDownCircle = Builder(name = "ArrowDownCircle", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(11.47f, 16.28f)
                curveTo(11.61f, 16.421f, 11.801f, 16.5f, 12.0f, 16.5f)
                curveTo(12.199f, 16.5f, 12.39f, 16.421f, 12.53f, 16.28f)
                lineTo(15.53f, 13.28f)
                curveTo(15.823f, 12.987f, 15.823f, 12.513f, 15.53f, 12.22f)
                curveTo(15.237f, 11.927f, 14.763f, 11.927f, 14.47f, 12.22f)
                lineTo(12.75f, 13.939f)
                lineTo(12.75f, 8.25f)
                curveTo(12.75f, 7.836f, 12.414f, 7.5f, 12.0f, 7.5f)
                curveTo(11.586f, 7.5f, 11.25f, 7.836f, 11.25f, 8.25f)
                lineTo(11.25f, 13.939f)
                lineTo(9.53f, 12.22f)
                curveTo(9.237f, 11.927f, 8.763f, 11.927f, 8.47f, 12.22f)
                curveTo(8.177f, 12.513f, 8.177f, 12.987f, 8.47f, 13.28f)
                lineTo(11.47f, 16.28f)
                close()
            }
        }
        .build()
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
