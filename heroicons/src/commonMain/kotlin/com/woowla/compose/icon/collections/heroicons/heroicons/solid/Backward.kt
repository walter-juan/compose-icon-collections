package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Backward: ImageVector
    get() {
        if (_backward != null) {
            return _backward!!
        }
        _backward = Builder(name = "Backward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.195f, 18.439f)
                curveTo(10.445f, 19.154f, 12.0f, 18.251f, 12.0f, 16.811f)
                verticalLineTo(14.471f)
                lineTo(18.945f, 18.439f)
                curveTo(20.195f, 19.154f, 21.75f, 18.251f, 21.75f, 16.811f)
                lineTo(21.75f, 8.689f)
                curveTo(21.75f, 7.249f, 20.195f, 6.346f, 18.945f, 7.061f)
                lineTo(12.0f, 11.029f)
                verticalLineTo(8.689f)
                curveTo(12.0f, 7.249f, 10.445f, 6.346f, 9.195f, 7.061f)
                lineTo(2.087f, 11.122f)
                curveTo(0.828f, 11.842f, 0.828f, 13.658f, 2.087f, 14.378f)
                lineTo(9.195f, 18.439f)
                close()
            }
        }
        .build()
        return _backward!!
    }

private var _backward: ImageVector? = null
