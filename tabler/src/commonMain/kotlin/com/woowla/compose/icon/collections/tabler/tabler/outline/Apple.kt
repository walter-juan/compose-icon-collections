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

public val OutlineGroup.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 11.319f)
                curveToRelative(0.0f, 3.102f, 0.444f, 5.319f, 2.222f, 7.978f)
                curveToRelative(1.351f, 1.797f, 3.156f, 2.247f, 5.08f, 0.988f)
                curveToRelative(0.426f, -0.268f, 0.97f, -0.268f, 1.397f, 0.0f)
                curveToRelative(1.923f, 1.26f, 3.728f, 0.809f, 5.079f, -0.988f)
                curveToRelative(1.778f, -2.66f, 2.222f, -4.876f, 2.222f, -7.977f)
                curveToRelative(0.0f, -2.661f, -1.99f, -5.32f, -4.444f, -5.32f)
                curveToRelative(-1.267f, 0.0f, -2.41f, 0.693f, -3.22f, 1.44f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.672f, 0.0f)
                curveToRelative(-0.809f, -0.746f, -1.953f, -1.44f, -3.22f, -1.44f)
                curveToRelative(-2.454f, 0.0f, -4.444f, 2.66f, -4.444f, 5.319f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                curveToRelative(0.0f, -1.47f, 0.454f, -2.34f, 1.5f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(0.0f, -1.2f, 0.867f, -4.0f, 3.0f, -4.0f)
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
