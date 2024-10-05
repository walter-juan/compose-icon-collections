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

public val OutlineGroup.Boom: ImageVector
    get() {
        if (_boom != null) {
            return _boom!!
        }
        _boom = Builder(name = "Boom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 9.662f)
                curveToRelative(2.0f, 2.338f, 2.0f, 4.338f, 0.0f, 6.338f)
                curveToRelative(3.0f, 0.5f, 4.5f, 1.0f, 5.0f, 4.0f)
                curveToRelative(2.0f, -3.0f, 6.0f, -4.0f, 9.0f, 0.0f)
                curveToRelative(0.0f, -3.0f, 1.0f, -4.0f, 4.0f, -4.004f)
                quadToRelative(-3.0f, -2.995f, 0.0f, -5.996f)
                curveToRelative(-3.0f, 0.0f, -5.0f, -2.0f, -5.0f, -5.0f)
                curveToRelative(-2.0f, 4.0f, -5.0f, 3.0f, -7.5f, -1.0f)
                curveToRelative(-0.5f, 3.0f, -2.5f, 5.0f, -5.5f, 5.662f)
            }
        }
        .build()
        return _boom!!
    }

private var _boom: ImageVector? = null
