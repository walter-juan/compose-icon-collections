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

public val OutlineGroup.CarrotOff: ImageVector
    get() {
        if (_carrotOff != null) {
            return _carrotOff!!
        }
        _carrotOff = Builder(name = "CarrotOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.868f, 8.846f)
                curveToRelative(-2.756f, 3.382f, -5.868f, 12.154f, -5.868f, 12.154f)
                reflectiveCurveToRelative(8.75f, -3.104f, 12.134f, -5.85f)
                moveToRelative(1.667f, -2.342f)
                arcToRelative(4.486f, 4.486f, 0.0f, false, false, -5.589f, -5.615f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                lineToRelative(-1.5f, -1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                reflectiveCurveToRelative(-1.14f, -2.0f, -3.0f, -2.0f)
                curveToRelative(-1.406f, 0.0f, -3.0f, 2.0f, -3.0f, 2.0f)
                reflectiveCurveToRelative(1.14f, 2.0f, 3.0f, 2.0f)
                reflectiveCurveToRelative(3.0f, -2.0f, 3.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, 1.14f, -2.0f, 3.0f)
                reflectiveCurveToRelative(2.0f, 3.0f, 2.0f, 3.0f)
                reflectiveCurveToRelative(2.0f, -1.577f, 2.0f, -3.0f)
                curveToRelative(0.0f, -1.86f, -2.0f, -3.0f, -2.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _carrotOff!!
    }

private var _carrotOff: ImageVector? = null
