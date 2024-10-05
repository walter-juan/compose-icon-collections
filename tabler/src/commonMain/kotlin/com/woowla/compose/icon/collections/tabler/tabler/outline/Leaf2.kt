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

public val OutlineGroup.Leaf2: ImageVector
    get() {
        if (_leaf2 != null) {
            return _leaf2!!
        }
        _leaf2 = Builder(name = "Leaf2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                curveToRelative(0.5f, -4.5f, 2.5f, -8.0f, 7.0f, -10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 15.0f)
                quadToRelative(-3.5f, 0.0f, -4.5f, -6.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 3.438f, 0.402f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.052f, -0.793f)
                curveToRelative(0.0f, -3.606f, 3.204f, -5.609f, 3.204f, -5.609f)
                reflectiveCurveToRelative(2.003f, 1.252f, 2.842f, 3.557f)
                quadToRelative(2.568f, -1.557f, 6.568f, -1.557f)
                quadToRelative(0.396f, 3.775f, -1.557f, 6.568f)
                curveToRelative(2.305f, 0.839f, 3.557f, 2.842f, 3.557f, 2.842f)
                reflectiveCurveToRelative(-3.0f, 2.59f, -7.0f, 2.59f)
                curveToRelative(0.0f, 1.0f, 0.0f, 1.0f, 0.5f, 3.0f)
                quadToRelative(-6.0f, 0.0f, -7.0f, -5.0f)
            }
        }
        .build()
        return _leaf2!!
    }

private var _leaf2: ImageVector? = null
