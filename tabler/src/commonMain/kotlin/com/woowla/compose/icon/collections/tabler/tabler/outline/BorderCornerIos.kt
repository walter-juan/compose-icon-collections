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

public val OutlineGroup.BorderCornerIos: ImageVector
    get() {
        if (_borderCornerIos != null) {
            return _borderCornerIos!!
        }
        _borderCornerIos = Builder(name = "BorderCornerIos", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                curveToRelative(0.0f, -6.559f, 0.0f, -9.838f, 1.628f, -12.162f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 2.21f, -2.21f)
                curveToRelative(2.324f, -1.628f, 5.602f, -1.628f, 12.162f, -1.628f)
            }
        }
        .build()
        return _borderCornerIos!!
    }

private var _borderCornerIos: ImageVector? = null
