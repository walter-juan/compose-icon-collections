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

public val Simpleicons.Elegoo: ImageVector
    get() {
        if (_elegoo != null) {
            return _elegoo!!
        }
        _elegoo = Builder(name = "Elegoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.686f, 7.479f)
                curveToRelative(0.54f, 0.829f, 1.032f, 1.665f, 1.476f, 2.505f)
                curveToRelative(0.64f, -1.217f, 1.849f, -2.086f, 3.328f, -2.086f)
                curveToRelative(2.217f, 0.0f, 3.826f, 1.954f, 3.826f, 4.102f)
                curveToRelative(0.0f, 2.149f, -1.609f, 4.102f, -3.826f, 4.102f)
                curveToRelative(-0.656f, 0.0f, -1.26f, -0.171f, -1.784f, -0.467f)
                lineToRelative(-0.001f, -0.001f)
                curveToRelative(-0.635f, -0.36f, -1.153f, -0.905f, -1.509f, -1.553f)
                curveToRelative(-0.484f, -0.804f, -0.725f, -1.706f, -0.991f, -2.657f)
                curveToRelative(-0.598f, -2.134f, -1.252f, -3.773f, -3.194f, -4.988f)
                curveToRelative(-1.001f, -0.626f, -2.196f, -0.985f, -3.501f, -0.985f)
                curveTo(2.815f, 5.451f, 0.0f, 8.323f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.727f, 2.761f, 6.549f, 6.51f, 6.549f)
                curveToRelative(1.955f, 0.0f, 3.639f, -0.766f, 4.805f, -2.027f)
                curveToRelative(-0.543f, -0.83f, -1.034f, -1.664f, -1.477f, -2.505f)
                curveToRelative(-0.641f, 1.217f, -1.849f, 2.085f, -3.328f, 2.085f)
                curveToRelative(-2.218f, 0.0f, -3.827f, -1.953f, -3.827f, -4.102f)
                curveToRelative(0.0f, -2.148f, 1.609f, -4.102f, 3.827f, -4.102f)
                curveToRelative(0.655f, 0.0f, 1.26f, 0.171f, 1.783f, 0.469f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.635f, 0.36f, 1.154f, 0.904f, 1.509f, 1.553f)
                curveToRelative(0.574f, 0.951f, 0.807f, 2.041f, 1.144f, 3.188f)
                curveToRelative(0.555f, 1.89f, 1.285f, 3.339f, 3.002f, 4.432f)
                curveToRelative(1.008f, 0.642f, 2.217f, 1.009f, 3.541f, 1.009f)
                curveToRelative(3.694f, 0.0f, 6.51f, -2.872f, 6.51f, -6.549f)
                curveToRelative(0.0f, -3.727f, -2.76f, -6.549f, -6.51f, -6.549f)
                curveToRelative(-1.954f, 0.0f, -3.64f, 0.766f, -4.804f, 2.028f)
                close()
            }
        }
        .build()
        return _elegoo!!
    }

private var _elegoo: ImageVector? = null
