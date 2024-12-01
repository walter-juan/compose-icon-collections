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

public val Simpleicons.Odin: ImageVector
    get() {
        if (_odin != null) {
            return _odin!!
        }
        _odin = Builder(name = "Odin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(11.999f, 11.999f, 0.0f, false, false, 1.607f, 18.0f)
                curveToRelative(0.001f, 0.0f, 0.143f, 0.279f, 0.545f, 0.861f)
                curveToRelative(0.456f, 0.661f, 0.725f, 0.939f, 0.725f, 0.939f)
                lineTo(14.194f, 0.2f)
                reflectiveCurveToRelative(-0.468f, -0.09f, -1.17f, -0.158f)
                curveTo(12.56f, -0.002f, 12.0f, 0.0f, 12.0f, 0.0f)
                moveToRelative(4.184f, 0.755f)
                lineTo(4.35f, 21.248f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.652f, 1.144f)
                curveToRelative(5.734f, 3.312f, 13.078f, 1.342f, 16.39f, -4.394f)
                curveToRelative(3.31f, -5.735f, 1.342f, -13.08f, -4.394f, -16.39f)
                curveToRelative(0.0f, 0.0f, -0.42f, -0.236f, -0.926f, -0.479f)
                curveToRelative(-0.403f, -0.193f, -0.891f, -0.373f, -0.891f, -0.373f)
                moveToRelative(-5.38f, 1.317f)
                lineTo(2.806f, 15.926f)
                arcTo(9.98f, 9.98f, 0.0f, false, true, 3.34f, 7.0f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, 7.463f, -4.928f)
                moveTo(17.0f, 3.34f)
                curveToRelative(4.78f, 2.759f, 6.42f, 8.88f, 3.66f, 13.66f)
                curveToRelative(-2.758f, 4.779f, -8.881f, 6.42f, -13.66f, 3.66f)
                close()
            }
        }
        .build()
        return _odin!!
    }

private var _odin: ImageVector? = null
