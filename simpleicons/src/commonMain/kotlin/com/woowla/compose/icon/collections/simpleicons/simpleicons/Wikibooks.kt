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

public val Simpleicons.Wikibooks: ImageVector
    get() {
        if (_wikibooks != null) {
            return _wikibooks!!
        }
        _wikibooks = Builder(name = "Wikibooks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.027f, 0.29f)
                curveToRelative(-0.424f, 0.143f, -0.776f, 0.418f, -1.106f, 0.707f)
                curveTo(0.434f, 5.314f, 0.254f, 5.497f, 0.254f, 5.497f)
                curveToRelative(-0.236f, 0.22f, -0.257f, 0.537f, -0.254f, 0.859f)
                lineToRelative(0.021f, 1.819f)
                reflectiveCurveToRelative(2.07f, -2.013f, 5.164f, -4.99f)
                curveToRelative(1.665f, 4.337f, 3.405f, 8.651f, 5.116f, 12.974f)
                curveToRelative(0.234f, 0.653f, -0.329f, 1.188f, -1.04f, 1.902f)
                curveToRelative(-0.982f, 0.958f, -3.034f, 2.93f, -5.136f, 5.561f)
                horizontalLineToRelative(2.107f)
                lineToRelative(5.067f, -5.554f)
                curveToRelative(0.482f, -0.662f, 1.077f, -1.309f, 0.824f, -1.909f)
                lineTo(8.145f, 5.806f)
                curveToRelative(0.924f, -0.785f, 1.763f, -1.676f, 2.618f, -2.531f)
                lineToRelative(5.252f, 13.173f)
                curveToRelative(0.303f, 0.891f, -0.175f, 1.684f, -1.134f, 2.549f)
                curveToRelative(-1.148f, 0.922f, -3.508f, 3.073f, -4.58f, 4.712f)
                horizontalLineToRelative(1.631f)
                curveToRelative(1.71f, -1.758f, 2.017f, -1.994f, 3.964f, -3.68f)
                curveToRelative(1.308f, -1.334f, 2.488f, -2.022f, 1.871f, -3.731f)
                lineToRelative(-4.13f, -10.325f)
                curveToRelative(1.007f, -0.99f, 2.013f, -1.875f, 2.98f, -2.852f)
                curveToRelative(2.113f, 4.643f, 3.559f, 8.384f, 5.33f, 13.33f)
                curveToRelative(0.58f, 1.607f, 0.458f, 1.682f, -0.928f, 2.55f)
                curveToRelative(-2.228f, 1.107f, -2.929f, 1.834f, -5.585f, 4.66f)
                horizontalLineToRelative(1.815f)
                curveToRelative(2.22f, -2.008f, 3.045f, -2.716f, 5.825f, -4.18f)
                curveToRelative(0.983f, -0.569f, 1.116f, -1.285f, 0.713f, -2.4f)
                curveToRelative(-1.3f, -3.616f, -4.116f, -11.41f, -6.719f, -16.755f)
                lineToRelative(-4.103f, 3.971f)
                lineToRelative(-1.569f, -3.92f)
                curveTo(9.912f, 1.38f, 8.74f, 2.78f, 7.466f, 4.04f)
                close()
            }
        }
        .build()
        return _wikibooks!!
    }

private var _wikibooks: ImageVector? = null
