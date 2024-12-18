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

public val OutlineGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.941f)
                curveToRelative(2.333f, -3.308f, 0.167f, -7.823f, -1.0f, -8.941f)
                curveToRelative(0.0f, 3.395f, -2.235f, 5.299f, -3.667f, 6.706f)
                curveToRelative(-1.43f, 1.408f, -2.333f, 3.621f, -2.333f, 5.588f)
                curveToRelative(0.0f, 3.704f, 3.134f, 6.706f, 7.0f, 6.706f)
                reflectiveCurveToRelative(7.0f, -3.002f, 7.0f, -6.706f)
                curveToRelative(0.0f, -1.712f, -1.232f, -4.403f, -2.333f, -5.588f)
                curveToRelative(-2.084f, 3.353f, -3.257f, 3.353f, -4.667f, 2.235f)
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
