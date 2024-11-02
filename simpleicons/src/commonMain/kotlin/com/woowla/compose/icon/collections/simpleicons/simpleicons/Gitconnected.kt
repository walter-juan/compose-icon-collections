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

public val Simpleicons.Gitconnected: ImageVector
    get() {
        if (_gitconnected != null) {
            return _gitconnected!!
        }
        _gitconnected = Builder(name = "Gitconnected", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.734f, 5.42f)
                curveTo(2.865f, 5.42f, 0.0f, 8.405f, 0.0f, 12.035f)
                curveToRelative(0.0f, 3.607f, 2.842f, 6.545f, 6.688f, 6.545f)
                curveToRelative(3.859f, 0.0f, 6.708f, -2.936f, 6.755f, -6.58f)
                lineToRelative(0.002f, -0.08f)
                curveToRelative(0.03f, -2.19f, 1.504f, -3.967f, 3.797f, -3.967f)
                curveToRelative(2.268f, 0.0f, 3.87f, 1.838f, 3.87f, 4.082f)
                curveToRelative(0.0f, 2.222f, -1.483f, 4.037f, -3.823f, 4.037f)
                curveToRelative(-1.334f, 0.0f, -2.43f, -0.657f, -3.107f, -1.656f)
                arcToRelative(7.557f, 7.557f, 0.0f, false, true, -1.41f, 2.53f)
                curveToRelative(1.163f, 1.013f, 2.71f, 1.634f, 4.47f, 1.634f)
                curveToRelative(3.893f, 0.0f, 6.758f, -2.986f, 6.758f, -6.592f)
                curveToRelative(0.0f, -3.63f, -2.841f, -6.568f, -6.71f, -6.568f)
                curveToRelative(-3.828f, 0.0f, -6.672f, 2.922f, -6.733f, 6.5f)
                curveToRelative(-0.015f, 0.04f, 0.0f, 0.101f, 0.0f, 0.115f)
                curveToRelative(0.0f, 2.222f, -1.482f, 4.037f, -3.823f, 4.037f)
                curveToRelative(-2.244f, 0.0f, -3.845f, -1.84f, -3.845f, -4.084f)
                curveToRelative(0.0f, -2.221f, 1.482f, -4.035f, 3.799f, -4.035f)
                curveToRelative(1.232f, 0.0f, 2.254f, 0.554f, 2.943f, 1.41f)
                lineToRelative(1.385f, -2.449f)
                arcTo(6.75f, 6.75f, 0.0f, false, false, 6.734f, 5.42f)
                close()
            }
        }
        .build()
        return _gitconnected!!
    }

private var _gitconnected: ImageVector? = null
