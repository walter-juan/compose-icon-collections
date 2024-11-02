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

public val Simpleicons.Yabai: ImageVector
    get() {
        if (_yabai != null) {
            return _yabai!!
        }
        _yabai = Builder(name = "Yabai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.075f, 0.0f)
                arcToRelative(3.263f, 3.263f, 0.0f, false, false, -2.381f, 0.955f)
                lineTo(6.216f, 4.431f)
                lineToRelative(-0.531f, -0.529f)
                curveToRelative(-1.2f, -1.055f, -2.821f, 0.513f, -1.744f, 1.742f)
                lineToRelative(0.531f, 0.531f)
                lineTo(0.976f, 9.671f)
                curveToRelative(-1.273f, 1.274f, -1.273f, 3.339f, 0.0f, 4.613f)
                lineToRelative(3.494f, 3.496f)
                lineToRelative(-0.068f, 0.066f)
                lineToRelative(-0.516f, 0.514f)
                curveToRelative(-1.07f, 1.206f, 0.471f, 2.816f, 1.707f, 1.776f)
                lineToRelative(0.598f, -0.594f)
                lineToRelative(3.502f, 3.502f)
                curveToRelative(1.274f, 1.275f, 3.341f, 1.275f, 4.615f, 0.0f)
                lineToRelative(8.714f, -8.714f)
                curveToRelative(1.275f, -1.274f, 1.275f, -3.341f, 0.0f, -4.615f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(-3.486f, -3.488f)
                lineToRelative(0.58f, -0.58f)
                curveToRelative(0.478f, -0.482f, 0.478f, -1.26f, 0.0f, -1.742f)
                curveToRelative(-0.481f, -0.482f, -1.262f, -0.482f, -1.744f, 0.0f)
                lineToRelative(-0.561f, 0.56f)
                lineTo(14.307f, 0.955f)
                arcTo(3.263f, 3.263f, 0.0f, false, false, 12.075f, 0.0f)
                close()
                moveTo(11.999f, 1.721f)
                curveToRelative(0.394f, 0.0f, 0.789f, 0.15f, 1.09f, 0.451f)
                lineToRelative(3.508f, 3.506f)
                lineToRelative(-4.566f, 4.568f)
                lineTo(7.433f, 5.65f)
                lineToRelative(3.478f, -3.478f)
                arcToRelative(1.533f, 1.533f, 0.0f, false, true, 1.088f, -0.451f)
                close()
                moveTo(5.691f, 7.394f)
                lineToRelative(4.593f, 4.593f)
                lineToRelative(-4.595f, 4.578f)
                lineToRelative(-3.494f, -3.498f)
                curveToRelative(-0.602f, -0.602f, -0.602f, -1.578f, 0.0f, -2.18f)
                close()
                moveTo(18.317f, 7.441f)
                lineTo(21.807f, 10.931f)
                curveToRelative(0.601f, 0.601f, 0.601f, 1.576f, 0.0f, 2.178f)
                lineToRelative(-8.714f, 8.714f)
                curveToRelative(-0.602f, 0.603f, -1.578f, 0.603f, -2.18f, 0.0f)
                lineToRelative(-3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _yabai!!
    }

private var _yabai: ImageVector? = null
