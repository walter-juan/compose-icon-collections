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

public val Simpleicons.Now: ImageVector
    get() {
        if (_now != null) {
            return _now!!
        }
        _now = Builder(name = "Now", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.801f, 11.997f)
                curveToRelative(0.0f, -0.974f, 0.788f, -1.763f, 1.76f, -1.763f)
                curveToRelative(0.972f, 0.0f, 1.76f, 0.789f, 1.76f, 1.763f)
                curveToRelative(0.0f, 0.974f, -0.788f, 1.763f, -1.76f, 1.763f)
                curveToRelative(-0.972f, 0.0f, -1.76f, -0.79f, -1.76f, -1.763f)
                close()
                moveTo(21.829f, 9.101f)
                lineToRelative(-1.217f, 2.452f)
                lineToRelative(-0.788f, -2.319f)
                lineToRelative(-0.002f, -0.0f)
                curveToRelative(-0.157f, -0.451f, -0.582f, -0.774f, -1.083f, -0.774f)
                curveToRelative(-0.399f, 0.0f, -0.751f, 0.205f, -0.956f, 0.517f)
                curveToRelative(-0.525f, 0.802f, -1.05f, 1.609f, -1.574f, 2.414f)
                lineToRelative(-0.278f, -1.956f)
                curveToRelative(-0.096f, -0.63f, -0.681f, -1.059f, -1.305f, -0.962f)
                curveToRelative(-0.625f, 0.096f, -1.054f, 0.678f, -0.958f, 1.304f)
                lineToRelative(0.049f, 0.328f)
                curveToRelative(-0.643f, -1.075f, -1.816f, -1.794f, -3.158f, -1.794f)
                curveToRelative(-1.353f, 0.0f, -2.535f, 0.732f, -3.174f, 1.823f)
                lineToRelative(0.07f, -0.343f)
                curveToRelative(0.122f, -0.601f, -0.264f, -1.187f, -0.864f, -1.31f)
                curveToRelative(-0.599f, -0.122f, -1.185f, 0.265f, -1.307f, 0.866f)
                lineToRelative(-0.476f, 2.338f)
                lineToRelative(-1.752f, -2.718f)
                curveToRelative(-0.198f, -0.304f, -0.54f, -0.505f, -0.928f, -0.505f)
                curveToRelative(-0.532f, 0.0f, -0.976f, 0.377f, -1.084f, 0.879f)
                lineToRelative(-1.022f, 5.012f)
                curveToRelative(-0.122f, 0.601f, 0.257f, 1.185f, 0.858f, 1.312f)
                curveToRelative(0.075f, 0.016f, 0.156f, 0.023f, 0.229f, 0.024f)
                curveToRelative(0.514f, 0.004f, 0.976f, -0.358f, 1.084f, -0.892f)
                lineToRelative(0.476f, -2.338f)
                curveToRelative(0.592f, 0.922f, 1.184f, 1.844f, 1.779f, 2.764f)
                curveToRelative(0.196f, 0.278f, 0.528f, 0.466f, 0.902f, 0.466f)
                curveToRelative(0.546f, 0.0f, 1.0f, -0.398f, 1.092f, -0.922f)
                lineToRelative(0.469f, -2.302f)
                curveToRelative(0.229f, 1.815f, 1.776f, 3.219f, 3.649f, 3.219f)
                curveToRelative(1.726f, 0.0f, 3.174f, -1.191f, 3.57f, -2.797f)
                lineToRelative(0.261f, 1.759f)
                curveToRelative(0.074f, 0.579f, 0.547f, 1.037f, 1.141f, 1.037f)
                curveToRelative(0.427f, 0.0f, 0.776f, -0.244f, 0.997f, -0.584f)
                lineToRelative(1.884f, -2.894f)
                lineToRelative(0.905f, 2.664f)
                curveToRelative(0.162f, 0.475f, 0.581f, 0.814f, 1.096f, 0.814f)
                curveToRelative(0.479f, 0.0f, 0.855f, -0.288f, 1.061f, -0.715f)
                lineToRelative(2.402f, -4.845f)
                curveToRelative(0.283f, -0.568f, 0.053f, -1.255f, -0.512f, -1.54f)
                curveToRelative(-0.565f, -0.285f, -1.256f, -0.052f, -1.538f, 0.52f)
                close()
            }
        }
        .build()
        return _now!!
    }

private var _now: ImageVector? = null
