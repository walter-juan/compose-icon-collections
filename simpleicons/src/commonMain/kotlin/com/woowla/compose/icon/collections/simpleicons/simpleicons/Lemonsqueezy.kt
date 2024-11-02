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

public val Simpleicons.Lemonsqueezy: ImageVector
    get() {
        if (_lemonsqueezy != null) {
            return _lemonsqueezy!!
        }
        _lemonsqueezy = Builder(name = "Lemonsqueezy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.492f, 10.835f)
                lineToRelative(2.375f, -6.511f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, false, -0.065f, -2.342f)
                curveTo(9.031f, 0.183f, 6.943f, -0.398f, 5.293f, 0.265f)
                curveTo(3.643f, 0.929f, 2.71f, 2.435f, 3.512f, 4.305f)
                lineToRelative(2.82f, 6.562f)
                curveToRelative(0.219f, 0.509f, 0.97f, 0.489f, 1.16f, -0.03f)
                moveToRelative(1.68f, 1.097f)
                lineToRelative(6.533f, -2.776f)
                curveToRelative(2.17f, -0.922f, 2.722f, -3.691f, 1.022f, -5.291f)
                lineToRelative(-0.068f, -0.063f)
                curveToRelative(-1.667f, -1.547f, -4.422f, -1.002f, -5.371f, 1.036f)
                lineTo(8.357f, 11.135f)
                curveToRelative(-0.234f, 0.503f, 0.295f, 1.02f, 0.816f, 0.798f)
                moveToRelative(0.373f, 0.87f)
                lineToRelative(6.645f, -2.512f)
                curveToRelative(2.208f, -0.835f, 4.621f, 0.745f, 4.589f, 3.04f)
                lineToRelative(-0.002f, 0.09f)
                curveToRelative(-0.048f, 2.236f, -2.394f, 3.738f, -4.554f, 2.947f)
                lineToRelative(-6.672f, -2.442f)
                arcToRelative(0.595f, 0.595f, 0.0f, false, true, -0.006f, -1.123f)
                moveToRelative(-0.386f, 1.927f)
                lineToRelative(6.438f, 2.977f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 1.666f, 1.699f)
                curveToRelative(0.769f, 1.8f, -0.283f, 3.64f, -1.933f, 4.302f)
                curveToRelative(-1.65f, 0.662f, -3.41f, 0.235f, -4.21f, -1.636f)
                lineToRelative(-2.803f, -6.569f)
                curveToRelative(-0.217f, -0.509f, 0.328f, -1.009f, 0.842f, -0.772f)
            }
        }
        .build()
        return _lemonsqueezy!!
    }

private var _lemonsqueezy: ImageVector? = null
