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

public val Simpleicons.Pixlr: ImageVector
    get() {
        if (_pixlr != null) {
            return _pixlr!!
        }
        _pixlr = Builder(name = "Pixlr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.264f, 14.391f)
                arcToRelative(17.698f, 17.698f, 0.0f, false, true, -2.645f, -0.299f)
                arcTo(16.016f, 16.016f, 0.0f, false, true, 0.0f, 11.821f)
                verticalLineToRelative(0.284f)
                curveToRelative(0.0f, 6.052f, 4.483f, 11.043f, 10.311f, 11.85f)
                arcToRelative(48.568f, 48.568f, 0.0f, false, true, -1.808f, -7.816f)
                curveToRelative(-0.075f, -0.552f, -0.164f, -1.135f, -0.239f, -1.748f)
                close()
                moveTo(14.54f, 9.758f)
                curveToRelative(0.374f, -0.418f, 0.613f, -0.941f, 0.688f, -1.494f)
                curveToRelative(0.015f, -0.12f, 0.03f, -0.24f, 0.03f, -0.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.24f, -1.016f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, false, -0.657f, -0.628f)
                curveToRelative(-1.195f, -0.582f, -2.615f, 0.658f, -3.123f, 1.69f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.014f, -0.015f, 0.014f)
                curveToRelative(-0.717f, 1.36f, -0.523f, 3.542f, -0.523f, 3.542f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, false, 2.929f, -1.031f)
                curveToRelative(0.329f, -0.195f, 0.642f, -0.434f, 0.911f, -0.733f)
                close()
                moveTo(12.0f, 0.045f)
                curveTo(6.486f, 0.045f, 1.853f, 3.765f, 0.463f, 8.847f)
                curveToRelative(0.105f, 0.134f, 0.643f, 0.433f, 0.733f, 0.493f)
                curveToRelative(0.254f, 0.164f, 0.523f, 0.329f, 0.792f, 0.493f)
                curveToRelative(1.11f, 0.647f, 2.897f, 1.47f, 5.155f, 1.749f)
                curveToRelative(0.314f, 0.06f, 0.643f, 0.074f, 0.957f, 0.074f)
                curveToRelative(0.0f, -0.12f, -0.015f, -0.239f, -0.015f, -0.358f)
                curveToRelative(-0.015f, -0.583f, 0.015f, -1.18f, 0.074f, -1.764f)
                curveToRelative(0.03f, -0.239f, 0.045f, -0.463f, 0.09f, -0.702f)
                curveToRelative(0.015f, -0.045f, 0.015f, -0.105f, 0.03f, -0.15f)
                verticalLineToRelative(-0.044f)
                curveToRelative(0.374f, -2.003f, 1.42f, -3.781f, 3.362f, -4.648f)
                curveToRelative(2.003f, -0.882f, 4.29f, -0.523f, 5.545f, 1.36f)
                arcToRelative(5.218f, 5.218f, 0.0f, false, true, -0.12f, 5.484f)
                curveToRelative(-1.315f, 2.048f, -3.631f, 3.034f, -6.067f, 3.363f)
                arcToRelative(44.26f, 44.26f, 0.0f, false, false, 0.642f, 4.035f)
                arcToRelative(48.25f, 48.25f, 0.0f, false, false, 0.882f, 3.511f)
                curveToRelative(0.015f, 0.06f, 0.03f, 0.12f, 0.06f, 0.18f)
                curveToRelative(0.194f, 0.672f, 0.418f, 1.345f, 0.642f, 2.002f)
                curveTo(19.278f, 23.328f, 24.0f, 18.217f, 24.0f, 12.015f)
                curveTo(23.97f, 5.41f, 18.605f, 0.045f, 12.0f, 0.045f)
            }
        }
        .build()
        return _pixlr!!
    }

private var _pixlr: ImageVector? = null
