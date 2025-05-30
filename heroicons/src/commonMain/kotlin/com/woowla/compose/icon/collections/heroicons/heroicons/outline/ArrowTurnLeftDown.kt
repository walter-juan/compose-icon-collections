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

public val OutlineGroup.ArrowTurnLeftDown: ImageVector
    get() {
        if (_arrowTurnLeftDown != null) {
            return _arrowTurnLeftDown!!
        }
        _arrowTurnLeftDown = Builder(name = "ArrowTurnLeftDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.99f, 16.5f)
                lineTo(8.24f, 20.25f)
                moveTo(8.24f, 20.25f)
                lineTo(4.489f, 16.5f)
                moveTo(8.24f, 20.25f)
                lineTo(8.24f, 3.75f)
                lineTo(19.491f, 3.75f)
            }
        }
        .build()
        return _arrowTurnLeftDown!!
    }

private var _arrowTurnLeftDown: ImageVector? = null
