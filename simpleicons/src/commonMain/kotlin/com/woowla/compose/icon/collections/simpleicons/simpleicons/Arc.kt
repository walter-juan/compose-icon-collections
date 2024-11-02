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

public val Simpleicons.Arc: ImageVector
    get() {
        if (_arc != null) {
            return _arc!!
        }
        _arc = Builder(name = "Arc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.937f, 8.509f)
                curveToRelative(0.147f, -0.715f, 0.037f, -1.466f, -0.336f, -2.097f)
                curveToRelative(-0.42f, -0.709f, -1.104f, -1.188f, -1.908f, -1.351f)
                arcToRelative(2.918f, 2.918f, 0.0f, false, false, -0.562f, -0.058f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.377f, 0.0f, -2.533f, 0.988f, -2.806f, 2.339f)
                curveToRelative(-0.163f, 0.794f, -0.478f, 1.561f, -0.92f, 2.27f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, true, -0.236f, 0.12f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, true, -0.221f, -0.147f)
                lineToRelative(-2.859f, -5.991f)
                curveToRelative(-0.363f, -0.762f, -1.014f, -1.361f, -1.824f, -1.597f)
                curveToRelative(-1.387f, -0.41f, -2.817f, 0.284f, -3.405f, 1.524f)
                lineTo(5.897f, 9.733f)
                curveToRelative(-0.079f, 0.163f, -0.31f, 0.158f, -0.378f, -0.005f)
                verticalLineToRelative(-0.005f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, false, -2.664f, -1.797f)
                curveToRelative(-0.378f, 0.0f, -0.752f, 0.074f, -1.109f, 0.221f)
                curveToRelative(-1.471f, 0.615f, -2.128f, 2.349f, -1.519f, 3.82f)
                curveToRelative(0.557f, 1.329f, 1.471f, 2.586f, 2.659f, 3.668f)
                curveToRelative(0.084f, 0.079f, 0.11f, 0.2f, 0.063f, 0.305f)
                lineToRelative(-0.956f, 2.007f)
                curveToRelative(-0.673f, 1.419f, -0.131f, 3.148f, 1.266f, 3.857f)
                curveToRelative(0.41f, 0.205f, 0.846f, 0.31f, 1.298f, 0.31f)
                curveToRelative(1.104f, 0.0f, 2.123f, -0.641f, 2.596f, -1.64f)
                lineToRelative(0.825f, -1.729f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, 0.305f, -0.137f)
                curveToRelative(1.004f, 0.273f, 2.013f, 0.42f, 3.006f, 0.42f)
                curveToRelative(1.119f, 0.0f, 2.223f, -0.168f, 3.29f, -0.478f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, true, 0.31f, 0.137f)
                lineToRelative(0.814f, 1.713f)
                curveToRelative(0.483f, 1.02f, 1.492f, 1.713f, 2.617f, 1.718f)
                curveToRelative(0.457f, 0.0f, 0.899f, -0.1f, 1.314f, -0.31f)
                curveToRelative(1.403f, -0.709f, 1.939f, -2.444f, 1.266f, -3.868f)
                lineTo(19.875f, 15.787f)
                curveToRelative(-0.047f, -0.105f, -0.026f, -0.226f, 0.058f, -0.305f)
                curveToRelative(1.986f, -1.85f, 3.453f, -4.272f, 4.004f, -6.973f)
                close()
                moveTo(6.212f, 20.017f)
                arcToRelative(1.835f, 1.835f, 0.0f, false, true, -0.676f, 0.762f)
                arcToRelative(1.835f, 1.835f, 0.0f, false, true, -0.979f, 0.283f)
                curveToRelative(-0.273f, 0.0f, -0.552f, -0.063f, -0.809f, -0.189f)
                curveToRelative(-0.904f, -0.447f, -1.245f, -1.571f, -0.809f, -2.48f)
                lineToRelative(0.794f, -1.666f)
                curveToRelative(0.068f, -0.147f, 0.257f, -0.2f, 0.384f, -0.105f)
                curveToRelative(0.168f, 0.121f, 0.342f, 0.236f, 0.52f, 0.352f)
                curveToRelative(0.699f, 0.447f, 1.429f, 0.825f, 2.181f, 1.135f)
                curveToRelative(0.142f, 0.058f, 0.205f, 0.215f, 0.142f, 0.352f)
                lineToRelative(-0.746f, 1.556f)
                close()
                moveTo(11.288f, 17.973f)
                curveToRelative(-4.209f, 0.0f, -8.655f, -2.853f, -10.126f, -6.495f)
                arcToRelative(1.829f, 1.829f, 0.0f, false, true, 1.009f, -2.381f)
                curveToRelative(0.226f, -0.089f, 0.457f, -0.137f, 0.683f, -0.137f)
                curveToRelative(0.725f, 0.0f, 1.408f, 0.431f, 1.697f, 1.146f)
                curveToRelative(0.92f, 2.281f, 4.004f, 4.209f, 6.737f, 4.209f)
                curveToRelative(0.42f, 0.0f, 0.841f, -0.042f, 1.256f, -0.116f)
                arcToRelative(0.264f, 0.264f, 0.0f, false, true, 0.284f, 0.142f)
                lineToRelative(1.377f, 2.901f)
                curveToRelative(0.068f, 0.147f, -0.01f, 0.32f, -0.163f, 0.363f)
                curveToRelative(-0.899f, 0.236f, -1.818f, 0.368f, -2.754f, 0.368f)
                close()
                moveTo(10.689f, 13.044f)
                lineTo(11.325f, 11.709f)
                curveToRelative(0.053f, -0.105f, 0.205f, -0.105f, 0.257f, 0.0f)
                lineToRelative(0.62f, 1.303f)
                curveToRelative(0.042f, 0.084f, -0.016f, 0.189f, -0.105f, 0.205f)
                curveToRelative(-0.268f, 0.037f, -0.536f, 0.058f, -0.799f, 0.058f)
                arcToRelative(5.063f, 5.063f, 0.0f, false, true, -0.489f, -0.026f)
                curveToRelative(-0.11f, -0.016f, -0.163f, -0.121f, -0.121f, -0.205f)
                close()
                moveTo(19.15f, 20.868f)
                arcToRelative(1.831f, 1.831f, 0.0f, false, true, -2.033f, -0.279f)
                arcToRelative(1.829f, 1.829f, 0.0f, false, true, -0.432f, -0.578f)
                lineToRelative(-4.987f, -10.484f)
                curveToRelative(-0.1f, -0.21f, -0.399f, -0.21f, -0.494f, 0.0f)
                lineToRelative(-1.545f, 3.253f)
                arcToRelative(0.262f, 0.262f, 0.0f, false, true, -0.32f, 0.137f)
                curveToRelative(-1.051f, -0.363f, -2.049f, -0.977f, -2.79f, -1.718f)
                arcToRelative(0.255f, 0.255f, 0.0f, false, true, -0.047f, -0.294f)
                lineToRelative(3.342f, -7.031f)
                curveToRelative(0.116f, -0.247f, 0.294f, -0.468f, 0.52f, -0.62f)
                curveToRelative(1.051f, -0.688f, 2.281f, -0.257f, 2.738f, 0.704f)
                lineToRelative(6.858f, 14.425f)
                curveToRelative(0.431f, 0.914f, 0.095f, 2.039f, -0.809f, 2.486f)
                close()
                moveTo(17.705f, 11.22f)
                arcToRelative(0.258f, 0.258f, 0.0f, false, true, 0.032f, -0.273f)
                curveToRelative(0.783f, -1.004f, 1.356f, -2.176f, 1.603f, -3.421f)
                curveToRelative(0.173f, -0.867f, 0.935f, -1.471f, 1.792f, -1.471f)
                curveToRelative(0.147f, 0.0f, 0.294f, 0.016f, 0.447f, 0.053f)
                curveToRelative(0.972f, 0.242f, 1.534f, 1.251f, 1.329f, 2.233f)
                curveToRelative(-0.484f, 2.302f, -1.682f, 4.388f, -3.316f, 6.022f)
                curveToRelative(-0.131f, 0.131f, -0.347f, 0.095f, -0.426f, -0.068f)
                lineToRelative(-1.461f, -3.074f)
                close()
            }
        }
        .build()
        return _arc!!
    }

private var _arc: ImageVector? = null
