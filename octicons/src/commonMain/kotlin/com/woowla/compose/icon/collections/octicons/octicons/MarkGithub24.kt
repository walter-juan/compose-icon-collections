package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.MarkGithub24: ImageVector
    get() {
        if (_markGithub24 != null) {
            return _markGithub24!!
        }
        _markGithub24 = Builder(name = "MarkGithub24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.303f, 16.652f)
                curveToRelative(-2.837f, -0.344f, -4.835f, -2.385f, -4.835f, -5.028f)
                curveToRelative(0.0f, -1.074f, 0.387f, -2.235f, 1.031f, -3.008f)
                curveToRelative(-0.279f, -0.709f, -0.236f, -2.214f, 0.086f, -2.837f)
                curveToRelative(0.86f, -0.107f, 2.02f, 0.344f, 2.708f, 0.967f)
                curveToRelative(0.816f, -0.258f, 1.676f, -0.386f, 2.728f, -0.386f)
                curveToRelative(1.053f, 0.0f, 1.913f, 0.128f, 2.686f, 0.365f)
                curveToRelative(0.666f, -0.602f, 1.848f, -1.053f, 2.708f, -0.946f)
                curveToRelative(0.3f, 0.581f, 0.344f, 2.085f, 0.064f, 2.815f)
                curveToRelative(0.688f, 0.817f, 1.053f, 1.913f, 1.053f, 3.03f)
                curveToRelative(0.0f, 2.643f, -1.998f, 4.641f, -4.877f, 5.006f)
                curveToRelative(0.73f, 0.473f, 1.224f, 1.504f, 1.224f, 2.686f)
                verticalLineToRelative(2.235f)
                curveToRelative(0.0f, 0.644f, 0.537f, 1.01f, 1.182f, 0.752f)
                curveToRelative(3.889f, -1.483f, 6.94f, -5.372f, 6.94f, -10.185f)
                curveToRelative(0.0f, -6.081f, -4.942f, -11.044f, -11.022f, -11.044f)
                curveToRelative(-6.081f, 0.0f, -10.98f, 4.963f, -10.98f, 11.044f)
                arcToRelative(10.84f, 10.84f, 0.0f, false, false, 7.112f, 10.206f)
                curveToRelative(0.58f, 0.215f, 1.139f, -0.172f, 1.139f, -0.752f)
                verticalLineToRelative(-1.719f)
                arcToRelative(2.768f, 2.768f, 0.0f, false, true, -1.032f, 0.215f)
                curveToRelative(-1.418f, 0.0f, -2.256f, -0.773f, -2.857f, -2.213f)
                curveToRelative(-0.237f, -0.58f, -0.495f, -0.924f, -0.989f, -0.988f)
                curveToRelative(-0.258f, -0.022f, -0.344f, -0.129f, -0.344f, -0.258f)
                curveToRelative(0.0f, -0.258f, 0.43f, -0.451f, 0.86f, -0.451f)
                curveToRelative(0.623f, 0.0f, 1.16f, 0.386f, 1.719f, 1.181f)
                curveToRelative(0.43f, 0.623f, 0.881f, 0.903f, 1.418f, 0.903f)
                curveToRelative(0.537f, 0.0f, 0.881f, -0.194f, 1.375f, -0.688f)
                curveToRelative(0.365f, -0.365f, 0.645f, -0.687f, 0.903f, -0.902f)
                close()
            }
        }
        .build()
        return _markGithub24!!
    }

private var _markGithub24: ImageVector? = null
