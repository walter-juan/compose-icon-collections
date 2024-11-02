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

public val OutlineGroup.ArrowTurnDownLeft: ImageVector
    get() {
        if (_arrowTurnDownLeft != null) {
            return _arrowTurnDownLeft!!
        }
        _arrowTurnDownLeft = Builder(name = "ArrowTurnDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.49f, 12.0f)
                lineTo(3.74f, 15.75f)
                moveTo(3.74f, 15.75f)
                lineTo(7.49f, 19.5f)
                moveTo(3.74f, 15.75f)
                horizontalLineTo(20.24f)
                verticalLineTo(4.499f)
            }
        }
        .build()
        return _arrowTurnDownLeft!!
    }

private var _arrowTurnDownLeft: ImageVector? = null
