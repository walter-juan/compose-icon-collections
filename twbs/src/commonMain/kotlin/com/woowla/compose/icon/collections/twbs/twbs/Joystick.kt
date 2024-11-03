package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Joystick: ImageVector
    get() {
        if (_joystick != null) {
            return _joystick!!
        }
        _joystick = Builder(name = "Joystick", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.5f, 1.937f)
                verticalLineToRelative(5.087f)
                curveToRelative(0.863f, 0.083f, 1.5f, 0.377f, 1.5f, 0.726f)
                curveToRelative(0.0f, 0.414f, -0.895f, 0.75f, -2.0f, 0.75f)
                reflectiveCurveToRelative(-2.0f, -0.336f, -2.0f, -0.75f)
                curveToRelative(0.0f, -0.35f, 0.637f, -0.643f, 1.5f, -0.726f)
                verticalLineTo(3.937f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 10.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.665f)
                verticalLineToRelative(1.717f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.553f, 0.894f)
                lineToRelative(6.553f, 3.277f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.788f, 0.0f)
                lineToRelative(6.553f, -3.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.553f, -0.894f)
                verticalLineTo(9.665f)
                curveToRelative(0.0f, -0.1f, -0.06f, -0.19f, -0.152f, -0.23f)
                lineTo(9.5f, 6.715f)
                verticalLineToRelative(0.993f)
                lineToRelative(5.227f, 2.178f)
                arcToRelative(0.125f, 0.125f, 0.0f, false, true, 0.001f, 0.23f)
                lineToRelative(-5.94f, 2.546f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.576f, 0.0f)
                lineToRelative(-5.94f, -2.546f)
                arcToRelative(0.125f, 0.125f, 0.0f, false, true, 0.001f, -0.23f)
                lineTo(6.5f, 7.708f)
                lineToRelative(-0.013f, -0.988f)
                lineTo(0.152f, 9.435f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.152f, 0.23f)
            }
        }
        .build()
        return _joystick!!
    }

private var _joystick: ImageVector? = null
