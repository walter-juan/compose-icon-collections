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

public val Simpleicons.Mambaui: ImageVector
    get() {
        if (_mambaui != null) {
            return _mambaui!!
        }
        _mambaui = Builder(name = "Mambaui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.045f, 15.831f)
                curveToRelative(1.303f, 0.349f, 2.496f, 0.773f, 3.91f, 1.042f)
                arcToRelative(30.713f, 30.713f, 0.0f, false, false, 0.405f, 6.069f)
                curveToRelative(-1.698f, -1.908f, -4.138f, -5.187f, -4.315f, -7.112f)
                close()
                moveTo(19.888f, 15.831f)
                curveToRelative(-1.258f, 0.349f, -2.41f, 0.773f, -3.777f, 1.042f)
                arcToRelative(31.772f, 31.772f, 0.0f, false, true, -0.39f, 6.069f)
                curveToRelative(1.644f, -1.908f, 4.001f, -5.187f, 4.167f, -7.112f)
                close()
                moveTo(6.783f, 1.057f)
                curveToRelative(2.318f, 4.169f, 9.686f, 3.629f, 11.46f, 0.0f)
                arcToRelative(6.223f, 6.223f, 0.0f, false, true, 2.337f, 1.386f)
                curveToRelative(-0.086f, 3.607f, -2.337f, 4.897f, -2.337f, 4.897f)
                lineToRelative(0.078f, 0.838f)
                curveToRelative(2.566f, -0.743f, 3.522f, -0.663f, 3.336f, -5.022f)
                curveToRelative(1.289f, 1.058f, 2.456f, 3.067f, 2.336f, 4.358f)
                curveToRelative(-0.125f, 1.342f, -2.037f, 5.377f, -1.8f, 5.306f)
                arcToRelative(87.749f, 87.749f, 0.0f, false, true, -8.445f, 3.204f)
                arcToRelative(2.931f, 2.931f, 0.0f, false, false, -1.943f, -1.672f)
                arcToRelative(12.781f, 12.781f, 0.0f, false, false, -1.784f, 1.779f)
                curveToRelative(-2.347f, -0.853f, -4.424f, -1.8f, -6.594f, -2.721f)
                lineToRelative(-1.706f, -0.628f)
                lineToRelative(-0.776f, -1.99f)
                curveToRelative(-1.042f, -2.579f, -1.516f, -4.015f, 0.155f, -6.279f)
                curveToRelative(0.364f, -0.492f, 0.998f, -1.56f, 1.556f, -1.794f)
                curveToRelative(-0.109f, 3.695f, -1.224f, 5.454f, 2.944f, 5.457f)
                lineToRelative(0.078f, -0.837f)
                reflectiveCurveToRelative(-1.81f, -0.227f, -2.249f, -4.898f)
                close()
                moveTo(8.856f, 12.26f)
                curveToRelative(-0.207f, 0.278f, -0.336f, 0.349f, -0.543f, 0.628f)
                curveToRelative(0.052f, 0.139f, -0.207f, 0.174f, -0.155f, 0.314f)
                arcTo(2.865f, 2.865f, 0.0f, false, false, 9.01f, 14.353f)
                arcToRelative(2.664f, 2.664f, 0.0f, false, false, 1.705f, -1.151f)
                curveToRelative(-0.206f, -0.44f, -1.443f, -1.163f, -1.86f, -0.941f)
                close()
                moveTo(14.519f, 12.26f)
                curveToRelative(-0.414f, 0.278f, -0.905f, 0.663f, -1.319f, 0.942f)
                curveToRelative(0.129f, 0.209f, 0.802f, 0.732f, 0.931f, 0.942f)
                curveToRelative(0.39f, 0.235f, 0.296f, 0.427f, 0.776f, 0.209f)
                arcToRelative(1.401f, 1.401f, 0.0f, false, false, 0.853f, -1.255f)
                curveToRelative(-0.206f, -0.244f, -0.414f, -0.593f, -0.621f, -0.837f)
                close()
            }
        }
        .build()
        return _mambaui!!
    }

private var _mambaui: ImageVector? = null
