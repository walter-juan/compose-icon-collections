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

public val OutlineGroup.ArrowRoundaboutRight: ImageVector
    get() {
        if (_arrowRoundaboutRight != null) {
            return _arrowRoundaboutRight!!
        }
        _arrowRoundaboutRight = Builder(name = "ArrowRoundaboutRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -5.0f, 5.0f)
                verticalLineToRelative(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, 4.0f)
            }
        }
        .build()
        return _arrowRoundaboutRight!!
    }

private var _arrowRoundaboutRight: ImageVector? = null