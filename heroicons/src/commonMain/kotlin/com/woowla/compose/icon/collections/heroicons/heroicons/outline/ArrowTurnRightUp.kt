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

public val OutlineGroup.ArrowTurnRightUp: ImageVector
    get() {
        if (_arrowTurnRightUp != null) {
            return _arrowTurnRightUp!!
        }
        _arrowTurnRightUp = Builder(name = "ArrowTurnRightUp", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.99f, 7.499f)
                lineTo(15.74f, 3.75f)
                moveTo(15.74f, 3.75f)
                lineTo(19.491f, 7.499f)
                moveTo(15.74f, 3.75f)
                lineTo(15.74f, 20.249f)
                lineTo(4.489f, 20.249f)
            }
        }
        .build()
        return _arrowTurnRightUp!!
    }

private var _arrowTurnRightUp: ImageVector? = null
