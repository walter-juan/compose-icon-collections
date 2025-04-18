package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.BorderCornerPill: ImageVector
    get() {
        if (_borderCornerPill != null) {
            return _borderCornerPill!!
        }
        _borderCornerPill = Builder(name = "BorderCornerPill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -6.075f, 4.925f, -11.0f, 11.0f, -11.0f)
                horizontalLineToRelative(5.0f)
            }
        }
        .build()
        return _borderCornerPill!!
    }

private var _borderCornerPill: ImageVector? = null
