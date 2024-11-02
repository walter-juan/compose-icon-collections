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

public val Simpleicons.Osu: ImageVector
    get() {
        if (_osu != null) {
            return _osu!!
        }
        _osu = Builder(name = "Osu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.698f, 10.362f)
                curveToRelative(-0.185f, -0.218f, -0.419f, -0.391f, -0.7f, -0.516f)
                curveToRelative(-0.281f, -0.126f, -0.61f, -0.189f, -0.987f, -0.189f)
                reflectiveCurveToRelative(-0.705f, 0.063f, -0.983f, 0.189f)
                reflectiveCurveToRelative(-0.509f, 0.298f, -0.691f, 0.516f)
                curveToRelative(-0.183f, 0.219f, -0.32f, 0.477f, -0.413f, 0.776f)
                curveToRelative(-0.093f, 0.299f, -0.139f, 0.619f, -0.139f, 0.961f)
                curveToRelative(0.0f, 0.341f, 0.046f, 0.658f, 0.139f, 0.952f)
                curveToRelative(0.093f, 0.293f, 0.23f, 0.549f, 0.413f, 0.767f)
                curveToRelative(0.182f, 0.219f, 0.413f, 0.389f, 0.691f, 0.512f)
                curveToRelative(0.278f, 0.123f, 0.606f, 0.184f, 0.983f, 0.184f)
                reflectiveCurveToRelative(0.706f, -0.062f, 0.988f, -0.184f)
                curveToRelative(0.281f, -0.123f, 0.515f, -0.293f, 0.7f, -0.512f)
                curveToRelative(0.185f, -0.218f, 0.323f, -0.474f, 0.413f, -0.767f)
                curveToRelative(0.09f, -0.293f, 0.135f, -0.61f, 0.135f, -0.952f)
                curveToRelative(0.0f, -0.341f, -0.045f, -0.661f, -0.135f, -0.961f)
                curveToRelative(-0.09f, -0.299f, -0.228f, -0.558f, -0.413f, -0.776f)
                close()
                moveTo(6.733f, 13.172f)
                curveToRelative(-0.147f, 0.248f, -0.387f, 0.373f, -0.723f, 0.373f)
                curveToRelative(-0.329f, 0.0f, -0.567f, -0.124f, -0.714f, -0.373f)
                curveToRelative(-0.147f, -0.248f, -0.22f, -0.606f, -0.22f, -1.073f)
                reflectiveCurveToRelative(0.073f, -0.824f, 0.22f, -1.073f)
                curveToRelative(0.147f, -0.248f, 0.384f, -0.373f, 0.714f, -0.373f)
                curveToRelative(0.335f, 0.0f, 0.576f, 0.124f, 0.723f, 0.373f)
                curveToRelative(0.147f, 0.248f, 0.22f, 0.606f, 0.22f, 1.073f)
                curveToRelative(0.0f, 0.467f, -0.073f, 0.825f, -0.22f, 1.073f)
                close()
                moveTo(18.622f, 12.341f)
                lineTo(18.533f, 7.952f)
                arcToRelative(4.541f, 4.541f, 0.0f, false, true, 0.691f, -0.054f)
                curveToRelative(0.233f, 0.0f, 0.467f, 0.018f, 0.7f, 0.054f)
                lineToRelative(-0.09f, 4.39f)
                curveToRelative(-0.21f, 0.036f, -0.41f, 0.054f, -0.601f, 0.054f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, true, -0.61f, -0.054f)
                close()
                moveTo(19.942f, 13.742f)
                curveToRelative(0.0f, 0.221f, -0.018f, 0.443f, -0.054f, 0.664f)
                arcToRelative(4.206f, 4.206f, 0.0f, false, true, -0.655f, 0.054f)
                arcToRelative(4.141f, 4.141f, 0.0f, false, true, -0.664f, -0.054f)
                arcToRelative(4.088f, 4.088f, 0.0f, false, true, -0.054f, -0.655f)
                curveToRelative(0.0f, -0.215f, 0.018f, -0.437f, 0.054f, -0.664f)
                arcToRelative(4.088f, 4.088f, 0.0f, false, true, 0.655f, -0.054f)
                curveToRelative(0.215f, 0.0f, 0.437f, 0.018f, 0.664f, 0.054f)
                curveToRelative(0.036f, 0.228f, 0.054f, 0.446f, 0.054f, 0.655f)
                close()
                moveTo(16.719f, 9.711f)
                curveToRelative(0.209f, 0.0f, 0.422f, 0.018f, 0.637f, 0.054f)
                verticalLineToRelative(4.461f)
                curveToRelative(-0.192f, 0.066f, -0.444f, 0.13f, -0.758f, 0.193f)
                curveToRelative(-0.314f, 0.063f, -0.642f, 0.094f, -0.983f, 0.094f)
                curveToRelative(-0.305f, 0.0f, -0.599f, -0.024f, -0.88f, -0.072f)
                curveToRelative(-0.281f, -0.048f, -0.528f, -0.149f, -0.74f, -0.305f)
                curveToRelative(-0.213f, -0.155f, -0.382f, -0.383f, -0.507f, -0.682f)
                curveToRelative(-0.126f, -0.299f, -0.189f, -0.697f, -0.189f, -1.194f)
                lineTo(13.299f, 9.765f)
                arcToRelative(3.872f, 3.872f, 0.0f, false, true, 0.637f, -0.054f)
                curveToRelative(0.209f, 0.0f, 0.422f, 0.018f, 0.637f, 0.054f)
                verticalLineToRelative(2.46f)
                curveToRelative(0.0f, 0.245f, 0.019f, 0.447f, 0.058f, 0.606f)
                curveToRelative(0.039f, 0.159f, 0.099f, 0.284f, 0.179f, 0.377f)
                arcToRelative(0.661f, 0.661f, 0.0f, false, false, 0.301f, 0.197f)
                curveToRelative(0.12f, 0.039f, 0.26f, 0.058f, 0.422f, 0.058f)
                curveToRelative(0.221f, 0.0f, 0.407f, -0.021f, 0.557f, -0.063f)
                lineTo(16.091f, 9.765f)
                arcToRelative(3.822f, 3.822f, 0.0f, false, true, 0.628f, -0.054f)
                close()
                moveTo(12.357f, 12.395f)
                curveToRelative(0.054f, 0.15f, 0.081f, 0.332f, 0.081f, 0.548f)
                curveToRelative(0.0f, 0.221f, -0.046f, 0.428f, -0.139f, 0.619f)
                curveToRelative(-0.093f, 0.192f, -0.227f, 0.358f, -0.404f, 0.498f)
                curveToRelative(-0.177f, 0.141f, -0.391f, 0.251f, -0.642f, 0.332f)
                curveToRelative(-0.251f, 0.081f, -0.536f, 0.121f, -0.853f, 0.121f)
                arcToRelative(5.298f, 5.298f, 0.0f, false, true, -0.395f, -0.014f)
                arcToRelative(3.123f, 3.123f, 0.0f, false, true, -0.346f, -0.045f)
                arcToRelative(4.048f, 4.048f, 0.0f, false, true, -0.328f, -0.076f)
                arcToRelative(3.934f, 3.934f, 0.0f, false, true, -0.35f, -0.117f)
                arcToRelative(2.577f, 2.577f, 0.0f, false, true, 0.085f, -0.489f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, 0.175f, -0.48f)
                curveToRelative(0.198f, 0.078f, 0.384f, 0.136f, 0.561f, 0.175f)
                curveToRelative(0.176f, 0.039f, 0.361f, 0.058f, 0.552f, 0.058f)
                curveToRelative(0.084f, 0.0f, 0.175f, -0.007f, 0.274f, -0.023f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, 0.274f, -0.081f)
                arcToRelative(0.647f, 0.647f, 0.0f, false, false, 0.211f, -0.153f)
                curveToRelative(0.057f, -0.063f, 0.085f, -0.145f, 0.085f, -0.247f)
                curveToRelative(0.0f, -0.144f, -0.043f, -0.247f, -0.13f, -0.31f)
                curveToRelative(-0.087f, -0.063f, -0.208f, -0.118f, -0.364f, -0.166f)
                lineToRelative(-0.557f, -0.162f)
                curveToRelative(-0.335f, -0.096f, -0.597f, -0.238f, -0.785f, -0.426f)
                curveToRelative(-0.189f, -0.189f, -0.283f, -0.471f, -0.283f, -0.848f)
                curveToRelative(0.0f, -0.455f, 0.163f, -0.811f, 0.489f, -1.068f)
                curveToRelative(0.326f, -0.257f, 0.771f, -0.386f, 1.333f, -0.386f)
                curveToRelative(0.233f, 0.0f, 0.464f, 0.021f, 0.691f, 0.063f)
                curveToRelative(0.227f, 0.042f, 0.458f, 0.105f, 0.691f, 0.189f)
                curveToRelative(-0.012f, 0.156f, -0.042f, 0.317f, -0.09f, 0.485f)
                curveToRelative(-0.048f, 0.168f, -0.105f, 0.314f, -0.171f, 0.44f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -0.476f, -0.157f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, false, -0.548f, -0.067f)
                curveToRelative(-0.203f, 0.0f, -0.362f, 0.031f, -0.476f, 0.094f)
                curveToRelative(-0.114f, 0.063f, -0.17f, 0.163f, -0.17f, 0.301f)
                curveToRelative(0.0f, 0.132f, 0.04f, 0.224f, 0.121f, 0.278f)
                curveToRelative(0.081f, 0.054f, 0.196f, 0.105f, 0.346f, 0.153f)
                lineToRelative(0.512f, 0.153f)
                curveToRelative(0.168f, 0.048f, 0.319f, 0.106f, 0.453f, 0.175f)
                curveToRelative(0.135f, 0.069f, 0.25f, 0.154f, 0.346f, 0.256f)
                curveToRelative(0.096f, 0.102f, 0.171f, 0.227f, 0.225f, 0.377f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveTo(0.0f, 18.627f, 5.373f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                curveTo(24.0f, 5.373f, 18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.8f)
                curveToRelative(-5.965f, 0.0f, -10.8f, -4.835f, -10.8f, -10.8f)
                curveTo(1.2f, 6.035f, 6.035f, 1.2f, 12.0f, 1.2f)
                reflectiveCurveToRelative(10.8f, 4.835f, 10.8f, 10.8f)
                curveTo(22.8f, 17.965f, 17.965f, 22.8f, 12.0f, 22.8f)
                close()
            }
        }
        .build()
        return _osu!!
    }

private var _osu: ImageVector? = null
