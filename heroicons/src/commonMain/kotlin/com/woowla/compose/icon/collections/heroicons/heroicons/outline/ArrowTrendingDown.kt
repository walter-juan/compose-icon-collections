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

public val OutlineGroup.ArrowTrendingDown: ImageVector
    get() {
        if (_arrowTrendingDown != null) {
            return _arrowTrendingDown!!
        }
        _arrowTrendingDown = Builder(name = "ArrowTrendingDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 6.0f)
                lineTo(9.0f, 12.75f)
                lineTo(13.286f, 8.464f)
                curveTo(15.322f, 10.017f, 16.878f, 12.23f, 17.592f, 14.894f)
                lineTo(18.368f, 17.792f)
                moveTo(18.368f, 17.792f)
                lineTo(21.55f, 12.281f)
                moveTo(18.368f, 17.792f)
                lineTo(12.857f, 14.61f)
            }
        }
        .build()
        return _arrowTrendingDown!!
    }

private var _arrowTrendingDown: ImageVector? = null
