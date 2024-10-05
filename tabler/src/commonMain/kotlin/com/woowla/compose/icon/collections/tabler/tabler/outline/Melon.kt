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

public val OutlineGroup.Melon: ImageVector
    get() {
        if (_melon != null) {
            return _melon!!
        }
        _melon = Builder(name = "Melon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                arcToRelative(9.967f, 9.967f, 0.0f, false, true, -6.984f, -2.842f)
                lineToRelative(4.343f, -4.153f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.76f, -5.51f)
                lineToRelative(4.342f, -4.153f)
                arcToRelative(9.963f, 9.963f, 0.0f, false, true, 2.539f, 6.658f)
                close()
            }
        }
        .build()
        return _melon!!
    }

private var _melon: ImageVector? = null
