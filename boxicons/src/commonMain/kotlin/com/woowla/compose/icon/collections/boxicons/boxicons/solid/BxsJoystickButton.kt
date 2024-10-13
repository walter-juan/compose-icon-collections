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

public val SolidGroup.BxsJoystickButton: ImageVector
    get() {
        if (_bxsJoystickButton != null) {
            return _bxsJoystickButton!!
        }
        _bxsJoystickButton = Builder(name = "BxsJoystickButton", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(7.0f, 14.0f)
                lineToRelative(-3.0f, -2.0f)
                lineToRelative(3.0f, -2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(12.0f, 20.0f)
                lineTo(10.0f, 17.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-2.0f, 3.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.001f, -4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 14.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(12.0f, 4.0f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(17.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(-3.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsJoystickButton!!
    }

private var _bxsJoystickButton: ImageVector? = null
