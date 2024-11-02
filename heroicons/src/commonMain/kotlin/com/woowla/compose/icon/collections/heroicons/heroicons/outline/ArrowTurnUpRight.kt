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

public val OutlineGroup.ArrowTurnUpRight: ImageVector
    get() {
        if (_arrowTurnUpRight != null) {
            return _arrowTurnUpRight!!
        }
        _arrowTurnUpRight = Builder(name = "ArrowTurnUpRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.49f, 11.999f)
                lineTo(20.24f, 8.249f)
                moveTo(20.24f, 8.249f)
                lineTo(16.49f, 4.499f)
                moveTo(20.24f, 8.249f)
                lineTo(3.74f, 8.249f)
                lineTo(3.74f, 19.5f)
            }
        }
        .build()
        return _arrowTurnUpRight!!
    }

private var _arrowTurnUpRight: ImageVector? = null
