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

public val OutlineGroup.RosetteNumber6: ImageVector
    get() {
        if (_rosetteNumber6 != null) {
            return _rosetteNumber6!!
        }
        _rosetteNumber6 = Builder(name = "RosetteNumber6", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 7.2f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.2f, -2.2f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 1.55f, -0.64f)
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
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.64f, 1.55f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.2f, 2.2f)
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
            }
        }
        .build()
        return _rosetteNumber6!!
    }

private var _rosetteNumber6: ImageVector? = null
