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

public val Simpleicons.Airindia: ImageVector
    get() {
        if (_airindia != null) {
            return _airindia!!
        }
        _airindia = Builder(name = "Airindia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.483f, 0.001f)
                curveTo(6.247f, 0.043f, 4.102f, 1.018f, 2.092f, 2.898f)
                curveToRelative(0.141f, -0.065f, -0.545f, 0.44f, -1.637f, 1.676f)
                curveToRelative(0.013f, 0.006f, -0.009f, 0.017f, -0.013f, 0.025f)
                curveToRelative(0.0f, 0.0f, 0.014f, 0.037f, 0.14f, -0.064f)
                curveToRelative(0.75f, -0.61f, 3.198f, -2.893f, 9.86f, 0.101f)
                arcToRelative(276.52f, 276.52f, 0.0f, false, false, 6.42f, 2.78f)
                reflectiveCurveToRelative(1.027f, 3.236f, 2.207f, 6.637f)
                curveToRelative(2.398f, 6.89f, -0.087f, 9.135f, -0.76f, 9.82f)
                curveToRelative(-0.102f, 0.114f, -0.064f, 0.127f, -0.064f, 0.127f)
                arcToRelative(16.746f, 16.746f, 0.0f, false, false, 2.385f, -2.08f)
                curveToRelative(1.624f, -1.637f, 2.588f, -3.428f, 2.855f, -5.344f)
                curveToRelative(0.254f, -1.878f, -0.203f, -3.5f, -0.584f, -4.566f)
                curveToRelative(-0.266f, -0.75f, -0.481f, -1.346f, -0.672f, -1.88f)
                curveToRelative(-0.862f, -2.423f, -1.028f, -2.867f, -1.625f, -5.29f)
                lineToRelative(-0.203f, -0.8f)
                curveToRelative(-0.023f, -0.003f, 0.009f, -0.016f, 0.014f, -0.025f)
                lineToRelative(-0.787f, -0.254f)
                curveToRelative(-2.386f, -0.774f, -2.804f, -0.964f, -5.165f, -2.017f)
                curveToRelative(-0.52f, -0.229f, -1.103f, -0.496f, -1.826f, -0.813f)
                curveToRelative(-0.85f, -0.368f, -2.146f, -0.875f, -3.707f, -0.926f)
                arcToRelative(8.027f, 8.027f, 0.0f, false, false, -0.447f, -0.004f)
                close()
            }
        }
        .build()
        return _airindia!!
    }

private var _airindia: ImageVector? = null
