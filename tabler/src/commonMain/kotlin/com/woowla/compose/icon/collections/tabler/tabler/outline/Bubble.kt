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

public val OutlineGroup.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.4f, 3.0f)
                arcToRelative(5.34f, 5.34f, 0.0f, false, true, 4.906f, 3.239f)
                arcToRelative(5.333f, 5.333f, 0.0f, false, true, -1.195f, 10.6f)
                arcToRelative(4.26f, 4.26f, 0.0f, false, true, -5.28f, 1.863f)
                lineToRelative(-3.831f, 2.298f)
                verticalLineToRelative(-3.134f)
                arcToRelative(2.668f, 2.668f, 0.0f, false, true, -1.795f, -3.773f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, true, 2.908f, -8.933f)
                arcToRelative(5.33f, 5.33f, 0.0f, false, true, 4.287f, -2.16f)
            }
        }
        .build()
        return _bubble!!
    }

private var _bubble: ImageVector? = null
