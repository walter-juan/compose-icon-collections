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

public val Simpleicons.Yaak: ImageVector
    get() {
        if (_yaak != null) {
            return _yaak!!
        }
        _yaak = Builder(name = "Yaak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.377f, 0.0f, 0.0f, 5.377f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.377f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.26f, 0.0f, 2.474f, -0.194f, 3.615f, -0.555f)
                curveToRelative(-0.272f, -0.827f, -0.485f, -1.57f, -0.72f, -1.496f)
                curveTo(8.607f, 23.925f, 1.668f, 18.246f, 1.668f, 12.0f)
                curveTo(1.667f, 6.29f, 7.79f, -0.043f, 14.7f, 1.779f)
                curveToRelative(0.18f, 0.047f, 1.364f, -0.405f, 2.19f, -0.738f)
                arcTo(11.95f, 11.95f, 0.0f, false, false, 12.0f, 0.0f)
                moveToRelative(6.37f, 1.83f)
                curveToRelative(-1.866f, 0.712f, -6.182f, 2.136f, -7.332f, 3.731f)
                curveToRelative(-2.676f, 0.004f, -3.675f, 0.532f, -4.069f, 0.814f)
                curveToRelative(-0.316f, 0.226f, -0.407f, 2.034f, -0.407f, 2.034f)
                horizontalLineToRelative(-0.814f)
                lineToRelative(-0.406f, -1.627f)
                reflectiveCurveToRelative(-3.967f, 4.496f, 1.22f, 4.475f)
                curveToRelative(0.202f, 1.339f, 0.15f, 3.974f, 0.407f, 5.696f)
                curveToRelative(0.27f, 1.806f, 4.18f, 3.74f, 5.29f, 3.662f)
                curveToRelative(0.58f, -0.04f, 0.362f, -1.65f, 0.406f, -2.441f)
                curveToRelative(2.345f, 0.802f, 3.653f, 1.981f, 4.285f, 4.76f)
                curveTo(21.106f, 21.046f, 24.0f, 16.858f, 24.0f, 12.0f)
                curveToRelative(0.0f, -4.284f, -2.25f, -8.046f, -5.63f, -10.17f)
                moveToRelative(-2.81f, 4.124f)
                curveToRelative(0.667f, -0.062f, 6.563f, 2.538f, 4.428f, 4.454f)
                curveToRelative(-0.572f, 0.21f, -1.268f, 0.195f, -1.782f, 0.21f)
                curveToRelative(-2.198f, 0.065f, -3.007f, -0.61f, -3.421f, -1.376f)
                curveToRelative(-0.229f, -0.422f, -0.62f, -1.084f, -0.492f, -1.24f)
                curveToRelative(0.67f, 0.001f, 1.497f, -0.031f, 2.034f, 0.0f)
                curveToRelative(-0.191f, -0.29f, -1.398f, -1.596f, -0.814f, -2.034f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.048f, -0.014f)
                moveToRelative(-3.465f, 6.166f)
                arcToRelative(1.124f, 1.124f, 0.0f, true, true, 0.0f, 2.248f)
                arcToRelative(1.124f, 1.124f, 0.0f, false, true, 0.0f, -2.248f)
            }
        }
        .build()
        return _yaak!!
    }

private var _yaak: ImageVector? = null
