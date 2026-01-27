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

public val Simpleicons.Openrouter: ImageVector
    get() {
        if (_openrouter != null) {
            return _openrouter!!
        }
        _openrouter = Builder(name = "Openrouter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.778f, 1.844f)
                verticalLineToRelative(1.919f)
                quadToRelative(-0.569f, -0.026f, -1.138f, -0.032f)
                quadToRelative(-0.708f, -0.008f, -1.415f, 0.037f)
                curveToRelative(-1.93f, 0.126f, -4.023f, 0.728f, -6.149f, 2.237f)
                curveToRelative(-2.911f, 2.066f, -2.731f, 1.95f, -4.14f, 2.75f)
                curveToRelative(-0.396f, 0.223f, -1.342f, 0.574f, -2.185f, 0.798f)
                curveToRelative(-0.841f, 0.225f, -1.753f, 0.333f, -1.751f, 0.333f)
                verticalLineToRelative(4.229f)
                reflectiveCurveToRelative(0.768f, 0.108f, 1.61f, 0.333f)
                curveToRelative(0.842f, 0.224f, 1.789f, 0.575f, 2.185f, 0.799f)
                curveToRelative(1.41f, 0.798f, 1.228f, 0.683f, 4.14f, 2.75f)
                curveToRelative(2.126f, 1.509f, 4.22f, 2.11f, 6.148f, 2.236f)
                curveToRelative(0.88f, 0.058f, 1.716f, 0.041f, 2.555f, 0.005f)
                verticalLineToRelative(1.918f)
                lineToRelative(7.222f, -4.168f)
                lineToRelative(-7.222f, -4.17f)
                verticalLineToRelative(2.176f)
                curveToRelative(-0.86f, 0.038f, -1.611f, 0.065f, -2.278f, 0.021f)
                curveToRelative(-1.364f, -0.09f, -2.417f, -0.357f, -3.979f, -1.465f)
                curveToRelative(-2.244f, -1.593f, -2.866f, -2.027f, -3.68f, -2.508f)
                curveToRelative(0.889f, -0.518f, 1.449f, -0.906f, 3.822f, -2.59f)
                curveToRelative(1.56f, -1.109f, 2.614f, -1.377f, 3.978f, -1.466f)
                curveToRelative(0.667f, -0.044f, 1.418f, -0.017f, 2.278f, 0.02f)
                verticalLineToRelative(2.176f)
                lineTo(24.0f, 6.014f)
                close()
            }
        }
        .build()
        return _openrouter!!
    }

private var _openrouter: ImageVector? = null
