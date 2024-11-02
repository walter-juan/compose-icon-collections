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

public val Simpleicons.Freelancermap: ImageVector
    get() {
        if (_freelancermap != null) {
            return _freelancermap!!
        }
        _freelancermap = Builder(name = "Freelancermap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                lineToRelative(-0.012f, -1.396f)
                lineTo(12.0f, 22.604f)
                curveToRelative(5.857f, 0.0f, 10.604f, -4.747f, 10.604f, -10.604f)
                lineTo(24.0f, 12.0f)
                curveToRelative(0.0f, -6.628f, -5.372f, -12.0f, -12.0f, -12.0f)
                moveToRelative(0.0f, 21.205f)
                curveToRelative(-5.084f, 0.0f, -9.205f, -4.122f, -9.205f, -9.205f)
                reflectiveCurveTo(6.916f, 2.792f, 12.0f, 2.792f)
                reflectiveCurveToRelative(9.205f, 4.122f, 9.205f, 9.205f)
                reflectiveCurveTo(17.084f, 21.203f, 12.0f, 21.203f)
                close()
                moveTo(18.325f, 16.608f)
                curveToRelative(3.577f, -5.049f, 0.173f, -10.212f, -2.864f, -11.615f)
                curveToRelative(-3.609f, 0.575f, -6.861f, 3.925f, -7.232f, 7.911f)
                curveToRelative(2.818f, 4.816f, 8.504f, 4.223f, 10.099f, 3.704f)
                moveToRelative(-9.911f, -1.449f)
                curveToRelative(0.265f, 1.636f, 0.725f, 3.247f, 1.703f, 4.438f)
                curveToRelative(3.425f, 0.884f, 6.45f, -0.782f, 7.943f, -2.642f)
                curveToRelative(-3.15f, 1.463f, -6.662f, 0.623f, -9.644f, -1.795f)
                moveTo(4.705f, 9.071f)
                curveToRelative(-1.897f, 4.994f, 1.325f, 9.143f, 4.675f, 10.304f)
                curveToRelative(-1.075f, -1.311f, -1.853f, -3.164f, -2.052f, -4.998f)
                curveToRelative(-1.431f, -1.431f, -2.411f, -3.249f, -2.626f, -5.305f)
                moveTo(14.31f, 4.53f)
                curveToRelative(-3.09f, -1.006f, -6.051f, 0.191f, -7.742f, 1.795f)
                curveToRelative(0.044f, 2.075f, 0.376f, 3.695f, 0.909f, 5.07f)
                curveToRelative(0.732f, -3.48f, 3.552f, -6.342f, 6.833f, -6.863f)
            }
        }
        .build()
        return _freelancermap!!
    }

private var _freelancermap: ImageVector? = null
