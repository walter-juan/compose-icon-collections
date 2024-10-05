package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.HistoryOff: ImageVector
    get() {
        if (_historyOff != null) {
            return _historyOff!!
        }
        _historyOff = Builder(name = "HistoryOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.05f, 11.0f)
                arcToRelative(8.975f, 8.975f, 0.0f, false, true, 2.54f, -5.403f)
                moveToRelative(2.314f, -1.697f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 12.113f, 12.112f)
                moveToRelative(-1.695f, 2.312f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -14.772f, -3.324f)
                moveToRelative(-0.5f, 5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _historyOff!!
    }

private var _historyOff: ImageVector? = null