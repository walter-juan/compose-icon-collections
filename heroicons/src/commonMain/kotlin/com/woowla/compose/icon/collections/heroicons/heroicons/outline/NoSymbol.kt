package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.NoSymbol: ImageVector
    get() {
        if (_noSymbol != null) {
            return _noSymbol!!
        }
        _noSymbol = Builder(name = "NoSymbol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.364f, 18.364f)
                curveTo(21.879f, 14.849f, 21.879f, 9.151f, 18.364f, 5.636f)
                curveTo(14.849f, 2.121f, 9.151f, 2.121f, 5.636f, 5.636f)
                moveTo(18.364f, 18.364f)
                curveTo(14.849f, 21.879f, 9.151f, 21.879f, 5.636f, 18.364f)
                curveTo(2.121f, 14.849f, 2.121f, 9.151f, 5.636f, 5.636f)
                moveTo(18.364f, 18.364f)
                lineTo(5.636f, 5.636f)
            }
        }
        .build()
        return _noSymbol!!
    }

private var _noSymbol: ImageVector? = null
