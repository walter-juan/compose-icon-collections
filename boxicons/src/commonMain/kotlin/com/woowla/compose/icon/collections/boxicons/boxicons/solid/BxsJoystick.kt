package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsJoystick: ImageVector
    get() {
        if (_bxsJoystick != null) {
            return _bxsJoystick!!
        }
        _bxsJoystick = Builder(name = "BxsJoystick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.986f, 9.74f)
                arcToRelative(3.193f, 3.193f, 0.0f, false, false, -0.008f, -0.088f)
                arcTo(5.003f, 5.003f, 0.0f, false, false, 17.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, -4.987f, 4.737f)
                curveToRelative(-0.01f, 0.079f, -0.013f, 0.161f, -0.013f, 0.253f)
                verticalLineToRelative(6.51f)
                curveToRelative(0.0f, 0.925f, 0.373f, 1.828f, 1.022f, 2.476f)
                arcTo(3.524f, 3.524f, 0.0f, false, false, 5.5f, 20.0f)
                curveToRelative(1.8f, 0.0f, 2.504f, -1.0f, 3.5f, -3.0f)
                curveToRelative(0.146f, -0.292f, 0.992f, -2.0f, 3.0f, -2.0f)
                curveToRelative(1.996f, 0.0f, 2.853f, 1.707f, 3.0f, 2.0f)
                curveToRelative(1.004f, 2.0f, 1.7f, 3.0f, 3.5f, 3.0f)
                curveToRelative(0.925f, 0.0f, 1.828f, -0.373f, 2.476f, -1.022f)
                arcTo(3.524f, 3.524f, 0.0f, false, false, 22.0f, 16.5f)
                lineTo(22.0f, 10.0f)
                curveToRelative(0.0f, -0.095f, -0.004f, -0.18f, -0.014f, -0.26f)
                close()
                moveTo(7.0f, 12.031f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.001f, -3.999f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 12.031f)
                close()
                moveTo(17.0f, 7.031f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                close()
                moveTo(15.0f, 11.031f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                close()
                moveTo(17.0f, 13.031f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                close()
                moveTo(19.0f, 11.031f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsJoystick!!
    }

private var _bxsJoystick: ImageVector? = null
