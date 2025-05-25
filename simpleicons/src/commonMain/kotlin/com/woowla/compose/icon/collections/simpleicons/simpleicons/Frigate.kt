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

public val Simpleicons.Frigate: ImageVector
    get() {
        if (_frigate != null) {
            return _frigate!!
        }
        _frigate = Builder(name = "Frigate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.892f, 0.036f)
                curveToRelative(-0.066f, 0.078f, -4.134f, 1.356f, -5.313f, 1.679f)
                curveToRelative(-1.089f, 0.3f, -4.201f, 1.49f, -4.646f, 1.778f)
                curveToRelative(-0.144f, 0.1f, -0.255f, 0.267f, -0.255f, 0.378f)
                reflectiveCurveToRelative(0.278f, 0.622f, 0.611f, 1.134f)
                curveToRelative(0.756f, 1.156f, 0.778f, 1.434f, 0.211f, 2.767f)
                curveToRelative(-0.556f, 1.29f, -0.9f, 1.7f, -1.8f, 2.123f)
                curveToRelative(-0.412f, 0.19f, -0.867f, 0.467f, -1.023f, 0.6f)
                curveToRelative(-0.156f, 0.134f, -0.556f, 0.356f, -0.89f, 0.478f)
                curveToRelative(-0.333f, 0.123f, -0.622f, 0.3f, -0.644f, 0.39f)
                curveToRelative(-0.033f, 0.144f, 0.022f, 0.144f, 0.4f, 0.022f)
                curveToRelative(0.6f, -0.212f, 0.912f, -0.112f, 0.912f, 0.289f)
                curveToRelative(0.0f, 0.355f, -0.445f, 0.666f, -1.623f, 1.156f)
                curveToRelative(-2.823f, 1.144f, -3.646f, 1.511f, -4.024f, 1.822f)
                curveToRelative(-0.578f, 0.445f, -0.655f, 0.856f, -0.355f, 1.79f)
                curveToRelative(0.122f, 0.378f, 0.222f, 0.811f, 0.222f, 0.945f)
                curveToRelative(0.0f, 0.233f, 0.589f, 1.923f, 1.5f, 4.323f)
                curveToRelative(0.367f, 0.956f, 1.123f, 2.279f, 1.312f, 2.29f)
                curveToRelative(0.056f, 0.0f, 0.067f, -0.256f, 0.022f, -0.567f)
                curveToRelative(-0.066f, -0.5f, -0.166f, -3.245f, -0.189f, -5.602f)
                curveToRelative(-0.022f, -1.2f, 0.223f, -1.767f, 1.112f, -2.634f)
                curveToRelative(0.844f, -0.834f, 2.123f, -1.712f, 3.256f, -2.256f)
                curveToRelative(0.756f, -0.356f, 0.834f, -0.378f, 1.701f, -0.312f)
                curveToRelative(0.934f, 0.067f, 2.479f, -0.144f, 3.323f, -0.444f)
                curveToRelative(0.3f, -0.111f, 0.578f, -0.122f, 0.89f, -0.067f)
                curveToRelative(0.6f, 0.111f, 4.412f, 0.122f, 4.412f, 0.011f)
                curveToRelative(0.0f, -0.044f, -0.356f, -0.144f, -0.789f, -0.21f)
                curveToRelative(-1.167f, -0.179f, -1.19f, -0.334f, -0.056f, -0.423f)
                curveToRelative(1.845f, -0.156f, 0.834f, -0.39f, -1.69f, -0.39f)
                curveToRelative(-1.655f, 0.0f, -1.978f, -0.088f, -2.567f, -0.7f)
                curveToRelative(-0.578f, -0.61f, -0.855f, -2.211f, -0.555f, -3.19f)
                curveToRelative(0.066f, -0.21f, 0.155f, -1.111f, 0.21f, -2.0f)
                curveToRelative(0.045f, -0.89f, 0.123f, -1.7f, 0.168f, -1.812f)
                curveToRelative(0.1f, -0.256f, 1.344f, -0.978f, 2.512f, -1.456f)
                curveToRelative(0.51f, -0.211f, 1.333f, -0.556f, 1.822f, -0.767f)
                curveToRelative(0.778f, -0.333f, 1.845f, -0.789f, 2.557f, -1.078f)
                curveToRelative(0.167f, -0.078f, 0.122f, -0.1f, -0.234f, -0.1f)
                curveToRelative(-0.244f, -0.011f, -0.478f, 0.011f, -0.5f, 0.033f)
            }
        }
        .build()
        return _frigate!!
    }

private var _frigate: ImageVector? = null
