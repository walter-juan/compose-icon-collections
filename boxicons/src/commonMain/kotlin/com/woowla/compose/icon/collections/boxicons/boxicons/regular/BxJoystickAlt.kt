package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxJoystickAlt: ImageVector
    get() {
        if (_bxJoystickAlt != null) {
            return _bxJoystickAlt!!
        }
        _bxJoystickAlt = Builder(name = "BxJoystickAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, 7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 7.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 7.0f, -7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, -7.0f)
                close()
                moveTo(15.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 9.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                close()
            }
        }
        .build()
        return _bxJoystickAlt!!
    }

private var _bxJoystickAlt: ImageVector? = null
