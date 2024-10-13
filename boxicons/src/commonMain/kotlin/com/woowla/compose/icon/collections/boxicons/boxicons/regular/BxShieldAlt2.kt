package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxShieldAlt2: ImageVector
    get() {
        if (_bxShieldAlt2 != null) {
            return _bxShieldAlt2!!
        }
        _bxShieldAlt2 = Builder(name = "BxShieldAlt2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.438f, 5.089f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -0.959f, 0.015f)
                curveToRelative(-0.684f, 0.389f, -1.355f, 0.577f, -2.053f, 0.577f)
                curveToRelative(-2.035f, 0.0f, -3.952f, -1.629f, -5.722f, -3.39f)
                curveToRelative(-0.375f, -0.373f, -1.063f, -0.373f, -1.438f, 0.0f)
                curveTo(9.592f, 3.959f, 7.598f, 5.663f, 5.51f, 5.663f)
                curveToRelative(-0.69f, 0.0f, -1.351f, -0.184f, -2.018f, -0.561f)
                curveToRelative(-0.298f, -0.166f, -0.658f, -0.171f, -0.96f, -0.012f)
                reflectiveCurveToRelative(-0.501f, 0.461f, -0.528f, 0.801f)
                curveToRelative(-0.011f, 0.129f, -0.944f, 12.872f, 9.683f, 16.041f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 0.286f, 0.042f)
                lineTo(12.0f, 21.974f)
                curveToRelative(0.097f, 0.0f, 0.192f, -0.014f, 0.285f, -0.041f)
                curveToRelative(10.657f, -3.17f, 9.695f, -15.916f, 9.684f, -16.044f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.531f, -0.8f)
                close()
                moveTo(11.986f, 19.931f)
                curveToRelative(-6.979f, -2.255f, -7.934f, -9.412f, -8.014f, -12.477f)
                curveToRelative(0.505f, 0.14f, 1.019f, 0.209f, 1.537f, 0.209f)
                curveToRelative(2.492f, 0.0f, 4.65f, -1.567f, 6.476f, -3.283f)
                curveToRelative(1.893f, 1.788f, 3.983f, 3.301f, 6.442f, 3.301f)
                curveToRelative(0.53f, 0.0f, 1.057f, -0.074f, 1.575f, -0.22f)
                curveToRelative(-0.074f, 3.065f, -1.021f, 10.217f, -8.016f, 12.47f)
                close()
            }
        }
        .build()
        return _bxShieldAlt2!!
    }

private var _bxShieldAlt2: ImageVector? = null
