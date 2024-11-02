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

public val OutlineGroup.ArrowPathRoundedSquare: ImageVector
    get() {
        if (_arrowPathRoundedSquare != null) {
            return _arrowPathRoundedSquare!!
        }
        _arrowPathRoundedSquare = Builder(name = "ArrowPathRoundedSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 12.0f)
                curveTo(19.5f, 10.768f, 19.454f, 9.547f, 19.362f, 8.338f)
                curveTo(19.213f, 6.354f, 17.646f, 4.787f, 15.662f, 4.638f)
                curveTo(14.453f, 4.546f, 13.232f, 4.5f, 12.0f, 4.5f)
                curveTo(10.768f, 4.5f, 9.547f, 4.546f, 8.338f, 4.638f)
                curveTo(6.354f, 4.787f, 4.787f, 6.354f, 4.638f, 8.338f)
                curveTo(4.621f, 8.559f, 4.606f, 8.779f, 4.592f, 9.0f)
                moveTo(19.5f, 12.0f)
                lineTo(22.5f, 9.0f)
                moveTo(19.5f, 12.0f)
                lineTo(16.5f, 9.0f)
                moveTo(4.5f, 12.0f)
                curveTo(4.5f, 13.232f, 4.546f, 14.453f, 4.638f, 15.662f)
                curveTo(4.787f, 17.646f, 6.354f, 19.213f, 8.338f, 19.362f)
                curveTo(9.547f, 19.454f, 10.768f, 19.5f, 12.0f, 19.5f)
                curveTo(13.232f, 19.5f, 14.453f, 19.454f, 15.662f, 19.362f)
                curveTo(17.646f, 19.213f, 19.213f, 17.646f, 19.362f, 15.662f)
                curveTo(19.379f, 15.441f, 19.394f, 15.221f, 19.408f, 15.0f)
                moveTo(4.5f, 12.0f)
                lineTo(7.5f, 15.0f)
                moveTo(4.5f, 12.0f)
                lineTo(1.5f, 15.0f)
            }
        }
        .build()
        return _arrowPathRoundedSquare!!
    }

private var _arrowPathRoundedSquare: ImageVector? = null
