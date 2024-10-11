package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.BubbleTea2: ImageVector
    get() {
        if (_bubbleTea2 != null) {
            return _bubbleTea2!!
        }
        _bubbleTea2 = Builder(name = "BubbleTea2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.95f, 9.0f)
                lineToRelative(-1.478f, 8.69f)
                curveToRelative(-0.25f, 1.463f, -0.374f, 2.195f, -0.936f, 2.631f)
                curveToRelative(-1.2f, 0.931f, -6.039f, 0.88f, -7.172f, 0.0f)
                curveToRelative(-0.562f, -0.436f, -0.687f, -1.168f, -0.936f, -2.632f)
                lineToRelative(-1.478f, -8.689f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                lineToRelative(0.514f, -1.286f)
                arcToRelative(5.908f, 5.908f, 0.0f, false, true, 10.972f, 0.0f)
                lineToRelative(0.514f, 1.286f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                horizontalLineToRelative(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                lineToRelative(4.0f, -7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                curveToRelative(0.593f, 0.642f, 1.484f, 1.017f, 2.5f, 1.0f)
                curveToRelative(1.016f, 0.017f, 1.907f, -0.358f, 2.5f, -1.0f)
                reflectiveCurveToRelative(1.484f, -1.017f, 2.5f, -1.0f)
                curveToRelative(1.016f, -0.017f, 1.907f, 0.358f, 2.5f, 1.0f)
            }
        }
        .build()
        return _bubbleTea2!!
    }

private var _bubbleTea2: ImageVector? = null
