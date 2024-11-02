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

public val SolidGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.055f, 7.061f)
                curveTo(3.805f, 6.346f, 2.25f, 7.249f, 2.25f, 8.689f)
                verticalLineTo(16.811f)
                curveTo(2.25f, 18.251f, 3.805f, 19.154f, 5.055f, 18.439f)
                lineTo(12.0f, 14.471f)
                verticalLineTo(16.811f)
                curveTo(12.0f, 18.251f, 13.555f, 19.154f, 14.805f, 18.439f)
                lineTo(21.913f, 14.378f)
                curveTo(23.172f, 13.658f, 23.172f, 11.842f, 21.913f, 11.122f)
                lineTo(14.805f, 7.061f)
                curveTo(13.555f, 6.346f, 12.0f, 7.249f, 12.0f, 8.689f)
                verticalLineTo(11.029f)
                lineTo(5.055f, 7.061f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
