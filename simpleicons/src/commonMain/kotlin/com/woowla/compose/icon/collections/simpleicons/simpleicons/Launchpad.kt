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

public val Simpleicons.Launchpad: ImageVector
    get() {
        if (_launchpad != null) {
            return _launchpad!!
        }
        _launchpad = Builder(name = "Launchpad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.518f, 7.088f)
                lineTo(2.68f, 5.351f)
                curveToRelative(0.107f, -0.158f, 0.175f, -0.162f, 0.293f, -0.106f)
                curveToRelative(2.556f, 1.476f, 4.848f, 1.685f, 7.212f, 0.662f)
                curveToRelative(2.35f, -1.019f, 3.763f, -2.82f, 4.445f, -5.659f)
                curveToRelative(0.072f, -0.256f, 0.166f, -0.254f, 0.231f, -0.245f)
                lineToRelative(2.03f, 0.44f)
                curveToRelative(0.343f, 0.086f, 0.33f, 0.18f, 0.322f, 0.25f)
                curveToRelative(-0.45f, 3.328f, -2.755f, 6.251f, -6.019f, 7.632f)
                curveToRelative(-3.317f, 1.426f, -6.92f, 1.112f, -9.64f, -0.84f)
                curveToRelative(-0.056f, -0.048f, -0.182f, -0.177f, -0.032f, -0.397f)
                horizontalLineToRelative(-0.003f)
                close()
                moveTo(11.633f, 23.886f)
                lineTo(13.714f, 24.0f)
                curveToRelative(0.35f, 0.006f, 0.36f, -0.087f, 0.369f, -0.156f)
                curveToRelative(0.45f, -3.328f, -0.999f, -6.758f, -3.779f, -8.953f)
                curveToRelative(-2.82f, -2.256f, -6.378f, -2.91f, -9.519f, -1.749f)
                curveToRelative(-0.065f, 0.033f, -0.222f, 0.123f, -0.136f, 0.373f)
                lineToRelative(0.659f, 1.984f)
                curveToRelative(0.063f, 0.18f, 0.125f, 0.202f, 0.254f, 0.179f)
                curveToRelative(2.855f, -0.744f, 5.12f, -0.339f, 7.128f, 1.275f)
                curveToRelative(1.996f, 1.606f, 2.88f, 3.716f, 2.784f, 6.644f)
                curveToRelative(0.003f, 0.258f, 0.093f, 0.281f, 0.158f, 0.29f)
                lineToRelative(0.001f, -0.001f)
                close()
                moveTo(12.968f, 10.018f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, false, -0.28f, -0.02f)
                curveToRelative(-0.422f, 0.0f, -0.82f, 0.132f, -1.146f, 0.38f)
                arcToRelative(1.907f, 1.907f, 0.0f, false, false, -0.725f, 1.28f)
                curveToRelative(-0.07f, 0.508f, 0.06f, 1.01f, 0.362f, 1.411f)
                curveToRelative(0.305f, 0.407f, 0.759f, 0.67f, 1.277f, 0.74f)
                arcToRelative(1.915f, 1.915f, 0.0f, false, false, 2.15f, -1.64f)
                arcToRelative(1.892f, 1.892f, 0.0f, false, false, -1.64f, -2.152f)
                lineToRelative(0.002f, 0.001f)
                close()
                moveTo(23.36f, 6.525f)
                lineToRelative(-0.966f, -1.85f)
                curveToRelative(-0.137f, -0.304f, -0.247f, -0.274f, -0.36f, -0.236f)
                curveToRelative(-3.089f, 1.332f, -5.22f, 4.26f, -5.703f, 7.838f)
                curveToRelative(-0.483f, 3.58f, 0.797f, 6.973f, 3.426f, 9.075f)
                curveToRelative(0.059f, 0.052f, 0.117f, 0.07f, 0.182f, 0.065f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.2f, -0.109f)
                lineToRelative(1.358f, -1.628f)
                curveToRelative(0.125f, -0.157f, 0.071f, -0.238f, 0.006f, -0.306f)
                curveToRelative(-2.13f, -2.096f, -2.926f, -4.18f, -2.58f, -6.748f)
                curveToRelative(0.349f, -2.583f, 1.71f, -4.433f, 4.286f, -5.827f)
                curveToRelative(0.204f, -0.123f, 0.17f, -0.228f, 0.151f, -0.276f)
                verticalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _launchpad!!
    }

private var _launchpad: ImageVector? = null
