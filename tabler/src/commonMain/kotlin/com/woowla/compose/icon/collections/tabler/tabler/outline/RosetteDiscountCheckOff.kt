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

public val OutlineGroup.RosetteDiscountCheckOff: ImageVector
    get() {
        if (_rosetteDiscountCheckOff != null) {
            return _rosetteDiscountCheckOff!!
        }
        _rosetteDiscountCheckOff = Builder(name = "RosetteDiscountCheckOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(1.5f, -1.5f)
                moveToRelative(2.0f, -2.0f)
                lineToRelative(0.5f, -0.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.887f, 4.89f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 0.863f, -0.53f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 3.12f, 0.0f)
                lineToRelative(0.7f, 0.7f)
                curveToRelative(0.412f, 0.41f, 0.97f, 0.64f, 1.55f, 0.64f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.2f, 2.2f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.58f, 0.23f, 1.138f, 0.64f, 1.55f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.0f, 3.12f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.528f, 0.858f)
                moveToRelative(-0.757f, 3.248f)
                arcToRelative(2.193f, 2.193f, 0.0f, false, true, -1.555f, 0.644f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -1.55f, 0.64f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.12f, 0.0f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -1.55f, -0.64f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.2f, -2.2f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.64f, -1.55f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.0f, -3.12f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 0.64f, -1.55f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.604f, 0.244f, -1.152f, 0.638f, -1.55f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _rosetteDiscountCheckOff!!
    }

private var _rosetteDiscountCheckOff: ImageVector? = null
