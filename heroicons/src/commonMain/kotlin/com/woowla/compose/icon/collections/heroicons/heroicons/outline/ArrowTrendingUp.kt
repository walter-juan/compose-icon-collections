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

public val OutlineGroup.ArrowTrendingUp: ImageVector
    get() {
        if (_arrowTrendingUp != null) {
            return _arrowTrendingUp!!
        }
        _arrowTrendingUp = Builder(name = "ArrowTrendingUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 18.0f)
                lineTo(9.0f, 11.25f)
                lineTo(13.306f, 15.556f)
                curveTo(14.51f, 13.188f, 16.504f, 11.202f, 19.12f, 10.038f)
                lineTo(21.861f, 8.817f)
                moveTo(21.861f, 8.817f)
                lineTo(15.92f, 6.537f)
                moveTo(21.861f, 8.817f)
                lineTo(19.58f, 14.759f)
            }
        }
        .build()
        return _arrowTrendingUp!!
    }

private var _arrowTrendingUp: ImageVector? = null
