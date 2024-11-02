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

public val Simpleicons.Viadeo: ImageVector
    get() {
        if (_viadeo != null) {
            return _viadeo!!
        }
        _viadeo = Builder(name = "Viadeo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.289f, 13.898f)
                curveToRelative(0.361f, 0.884f, 0.543f, 1.842f, 0.543f, 2.875f)
                curveToRelative(0.0f, 1.931f, -0.659f, 3.618f, -1.977f, 5.063f)
                curveTo(13.537f, 23.28f, 11.842f, 24.0f, 9.77f, 24.0f)
                curveToRelative(-2.082f, 0.0f, -3.778f, -0.72f, -5.097f, -2.164f)
                curveToRelative(-1.318f, -1.444f, -1.979f, -3.131f, -1.979f, -5.063f)
                curveToRelative(0.0f, -1.914f, 0.621f, -3.575f, 1.869f, -4.979f)
                curveTo(5.938f, 10.244f, 7.669f, 9.469f, 9.767f, 9.469f)
                curveToRelative(0.884f, 0.0f, 1.702f, 0.139f, 2.454f, 0.413f)
                curveToRelative(-0.245f, 0.481f, -0.466f, 1.07f, -0.526f, 1.704f)
                curveToRelative(-0.599f, -0.25f, -1.242f, -0.376f, -1.933f, -0.376f)
                curveToRelative(-1.454f, 0.0f, -2.701f, 0.545f, -3.742f, 1.638f)
                curveToRelative(-1.041f, 1.092f, -1.561f, 2.413f, -1.561f, 3.963f)
                curveToRelative(0.0f, 1.0f, 0.24f, 1.931f, 0.711f, 2.795f)
                curveToRelative(0.479f, 0.864f, 1.115f, 1.53f, 1.925f, 2.001f)
                curveToRelative(0.81f, 0.47f, 1.694f, 0.705f, 2.66f, 0.705f)
                curveToRelative(0.967f, 0.0f, 1.859f, -0.234f, 2.66f, -0.705f)
                curveToRelative(0.81f, -0.47f, 1.454f, -1.137f, 1.925f, -2.001f)
                curveToRelative(0.835f, -1.497f, 0.962f, -3.465f, 0.297f, -5.039f)
                curveToRelative(0.471f, -0.099f, 1.049f, -0.295f, 1.652f, -0.669f)
                close()
                moveTo(20.387f, 0.428f)
                lineToRelative(-0.013f, -0.015f)
                curveToRelative(-0.757f, 1.615f, -2.159f, 1.918f, -2.159f, 1.918f)
                curveToRelative(-1.401f, 0.361f, -1.892f, 0.9f, -1.892f, 0.9f)
                curveToRelative(-1.401f, 1.416f, -0.295f, 3.134f, -0.295f, 3.134f)
                curveToRelative(3.031f, -0.693f, 4.137f, -3.186f, 4.137f, -3.186f)
                curveToRelative(-0.133f, 1.681f, -3.732f, 3.658f, -3.732f, 3.658f)
                curveToRelative(1.195f, 1.173f, 2.33f, 1.033f, 3.083f, 0.583f)
                curveToRelative(0.996f, -0.59f, 1.475f, -1.895f, 1.475f, -1.895f)
                curveToRelative(0.966f, -2.898f, -0.605f, -5.096f, -0.605f, -5.096f)
                close()
                moveTo(7.03f, 20.473f)
                reflectiveCurveToRelative(0.428f, 0.074f, 0.912f, 0.052f)
                curveToRelative(0.0f, 0.0f, 10.329f, -7.021f, 7.609f, -14.315f)
                lineToRelative(-0.041f, -0.118f)
                verticalLineToRelative(0.007f)
                curveToRelative(0.034f, 0.487f, -4.483f, 13.061f, -8.481f, 14.374f)
                close()
                moveTo(15.413f, 5.283f)
                curveTo(15.049f, 1.41f, 12.933f, 0.0f, 12.933f, 0.0f)
                curveToRelative(1.49f, 2.513f, 2.299f, 4.769f, 2.482f, 5.306f)
                curveToRelative(0.0f, -0.013f, -0.001f, -0.022f, -0.001f, -0.022f)
                close()
            }
        }
        .build()
        return _viadeo!!
    }

private var _viadeo: ImageVector? = null
