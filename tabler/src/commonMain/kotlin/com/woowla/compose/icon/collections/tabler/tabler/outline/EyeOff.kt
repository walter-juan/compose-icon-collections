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

public val OutlineGroup.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.585f, 10.587f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.829f, 2.828f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.681f, 16.673f)
                arcToRelative(8.717f, 8.717f, 0.0f, false, true, -4.681f, 1.327f)
                curveToRelative(-3.6f, 0.0f, -6.6f, -2.0f, -9.0f, -6.0f)
                curveToRelative(1.272f, -2.12f, 2.712f, -3.678f, 4.32f, -4.674f)
                moveToRelative(2.86f, -1.146f)
                arcToRelative(9.055f, 9.055f, 0.0f, false, true, 1.82f, -0.18f)
                curveToRelative(3.6f, 0.0f, 6.6f, 2.0f, 9.0f, 6.0f)
                curveToRelative(-0.666f, 1.11f, -1.379f, 2.067f, -2.138f, 2.87f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null