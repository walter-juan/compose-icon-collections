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

public val OutlineGroup.CellSignal1: ImageVector
    get() {
        if (_cellSignal1 != null) {
            return _cellSignal1!!
        }
        _cellSignal1 = Builder(name = "CellSignal1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-15.269f)
                arcToRelative(0.731f, 0.731f, 0.0f, false, true, -0.517f, -1.249f)
                lineToRelative(14.537f, -14.537f)
                arcToRelative(0.731f, 0.731f, 0.0f, false, true, 1.249f, 0.517f)
                verticalLineToRelative(15.269f)
                close()
            }
        }
        .build()
        return _cellSignal1!!
    }

private var _cellSignal1: ImageVector? = null