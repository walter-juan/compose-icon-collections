package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Codefresh: ImageVector
    get() {
        if (_codefresh != null) {
            return _codefresh!!
        }
        _codefresh = Builder(name = "Codefresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.84f)
                curveToRelative(1.402f, 2.71f, 1.445f, 5.241f, 2.977f, 10.4f)
                curveToRelative(1.855f, 5.341f, 8.703f, 5.701f, 9.21f, 5.711f)
                curveToRelative(0.46f, 0.726f, 1.513f, 1.704f, 3.926f, 2.21f)
                lineToRelative(0.268f, -1.272f)
                curveToRelative(-2.082f, -0.436f, -2.844f, -1.239f, -3.106f, -1.68f)
                lineToRelative(-0.005f, 0.006f)
                curveToRelative(0.087f, -0.484f, 1.523f, -5.377f, -1.323f, -9.352f)
                curveTo(7.182f, 3.583f, 0.0f, 2.84f, 0.0f, 2.84f)
                close()
                moveTo(24.0f, 3.68f)
                curveToRelative(-3.898f, 0.611f, -4.293f, -0.92f, -11.473f, 3.093f)
                arcToRelative(11.879f, 11.879f, 0.0f, false, true, 2.625f, 10.05f)
                curveToRelative(3.723f, -1.486f, 5.166f, -3.976f, 5.606f, -6.466f)
                curveToRelative(0.0f, 0.0f, 1.27f, -4.716f, 3.242f, -6.677f)
                close()
                moveTo(12.527f, 6.773f)
                lineToRelative(-0.002f, -0.002f)
                verticalLineToRelative(0.004f)
                lineToRelative(0.002f, -0.002f)
                close()
                moveTo(2.643f, 5.22f)
                reflectiveCurveToRelative(5.422f, 1.426f, 8.543f, 11.543f)
                curveToRelative(-2.945f, -0.889f, -4.203f, -3.796f, -4.63f, -5.168f)
                horizontalLineToRelative(0.006f)
                arcToRelative(15.863f, 15.863f, 0.0f, false, false, -3.92f, -6.375f)
                close()
            }
        }
        .build()
        return _codefresh!!
    }

private var _codefresh: ImageVector? = null
