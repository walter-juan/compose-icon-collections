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

public val OutlineGroup.CubeOff: ImageVector
    get() {
        if (_cubeOff != null) {
            return _cubeOff!!
        }
        _cubeOff = Builder(name = "CubeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.83f, 16.809f)
                curveToRelative(0.11f, -0.248f, 0.17f, -0.52f, 0.17f, -0.801f)
                verticalLineToRelative(-8.018f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, -1.0f, -1.717f)
                lineToRelative(-7.0f, -4.008f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, -2.0f, 0.0f)
                lineToRelative(-3.012f, 1.725f)
                moveToRelative(-2.547f, 1.458f)
                lineToRelative(-1.441f, 0.825f)
                curveToRelative(-0.619f, 0.355f, -1.0f, 1.01f, -1.0f, 1.718f)
                verticalLineToRelative(8.018f)
                curveToRelative(0.0f, 0.709f, 0.381f, 1.363f, 1.0f, 1.717f)
                lineToRelative(7.0f, 4.008f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, 2.0f, 0.0f)
                lineToRelative(5.544f, -3.174f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineToRelative(-10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.532f, 10.538f)
                lineToRelative(6.198f, -3.578f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.27f, 6.96f)
                lineToRelative(8.73f, 5.04f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _cubeOff!!
    }

private var _cubeOff: ImageVector? = null
