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

public val Simpleicons.Telenor: ImageVector
    get() {
        if (_telenor != null) {
            return _telenor!!
        }
        _telenor = Builder(name = "Telenor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.131f, 7.706f)
                curveToRelative(0.343f, 0.054f, 0.412f, -0.017f, 0.458f, -0.343f)
                arcToRelative(7.754f, 7.754f, 0.0f, false, true, 0.668f, -2.189f)
                curveToRelative(0.45f, -0.923f, 1.162f, -1.938f, 2.166f, -2.619f)
                arcToRelative(10.776f, 10.776f, 0.0f, false, true, 3.296f, -1.418f)
                arcToRelative(8.039f, 8.039f, 0.0f, false, true, 2.403f, -0.16f)
                curveToRelative(1.445f, 0.13f, 2.245f, 0.543f, 2.647f, 1.077f)
                arcToRelative(1.159f, 1.159f, 0.0f, false, true, 0.23f, 0.61f)
                curveToRelative(0.012f, 0.267f, -0.103f, 0.612f, -0.486f, 0.952f)
                curveToRelative(-0.383f, 0.34f, -1.162f, 0.743f, -2.242f, 1.105f)
                curveToRelative(-1.119f, 0.373f, -2.65f, 0.767f, -4.176f, 1.118f)
                arcToRelative(23.554f, 23.554f, 0.0f, false, false, -2.612f, 0.75f)
                curveToRelative(-1.01f, 0.343f, -1.314f, 1.347f, -0.687f, 1.655f)
                arcToRelative(9.427f, 9.427f, 0.0f, false, true, 1.965f, 1.287f)
                arcToRelative(17.392f, 17.392f, 0.0f, false, true, 2.62f, 2.575f)
                curveToRelative(0.949f, 1.16f, 2.504f, 3.374f, 3.062f, 5.524f)
                curveToRelative(0.62f, 2.36f, 0.234f, 4.596f, -1.102f, 5.221f)
                curveToRelative(-1.31f, 0.615f, -3.054f, -0.271f, -4.28f, -1.545f)
                curveToRelative(-1.163f, -1.201f, -1.977f, -2.624f, -2.746f, -4.806f)
                curveToRelative(-0.662f, -1.888f, -0.93f, -4.612f, -0.93f, -6.04f)
                curveToRelative(0.0f, -0.476f, 0.0f, -0.577f, 0.012f, -1.006f)
                curveToRelative(0.045f, -0.375f, -0.965f, -0.687f, -2.05f, 0.013f)
                curveToRelative(-1.234f, 0.795f, -2.442f, 2.232f, -3.156f, 3.07f)
                curveToRelative(-0.311f, 0.365f, -0.733f, 0.9f, -1.178f, 1.462f)
                curveToRelative(-0.589f, 0.738f, -1.237f, 1.507f, -1.83f, 1.936f)
                curveToRelative(-0.887f, 0.634f, -2.317f, 0.908f, -3.324f, 0.194f)
                curveTo(0.3f, 15.731f, 0.0f, 14.98f, 0.0f, 14.214f)
                arcToRelative(2.903f, 2.903f, 0.0f, false, true, 0.395f, -1.506f)
                curveToRelative(0.343f, -0.589f, 0.888f, -1.222f, 1.765f, -1.946f)
                arcToRelative(15.536f, 15.536f, 0.0f, false, true, 3.802f, -2.168f)
                curveToRelative(2.21f, -0.891f, 4.591f, -1.171f, 6.169f, -0.888f)
                close()
            }
        }
        .build()
        return _telenor!!
    }

private var _telenor: ImageVector? = null
