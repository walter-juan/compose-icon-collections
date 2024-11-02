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

public val Simpleicons.Flydotio: ImageVector
    get() {
        if (_flydotio != null) {
            return _flydotio!!
        }
        _flydotio = Builder(name = "Flydotio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.987f, 0.0f)
                curveToRelative(-2.45f, -0.01f, -5.002f, 0.925f, -6.541f, 2.897f)
                curveToRelative(-1.17f, 1.502f, -1.664f, 3.474f, -1.49f, 5.356f)
                curveToRelative(0.29f, 2.112f, 1.476f, 3.96f, 2.676f, 5.672f)
                arcToRelative(41.5f, 41.5f, 0.0f, false, false, 4.216f, 4.831f)
                curveToRelative(-1.063f, 0.832f, -1.943f, 2.286f, -1.357f, 3.644f)
                curveToRelative(0.821f, 2.32f, 4.665f, 2.05f, 5.122f, -0.372f)
                curveToRelative(0.39f, -1.288f, -0.694f, -2.533f, -1.428f, -3.309f)
                curveToRelative(2.388f, -2.431f, 4.706f, -5.036f, 6.17f, -8.145f)
                curveToRelative(0.595f, -1.32f, 0.902f, -2.802f, 0.614f, -4.24f)
                curveToRelative(-0.28f, -2.341f, -1.823f, -4.473f, -3.967f, -5.46f)
                curveTo(14.76f, 0.266f, 13.364f, 0.016f, 11.987f, 0.0f)
                moveToRelative(-0.236f, 1.577f)
                verticalLineToRelative(15.534f)
                curveTo(9.881f, 13.483f, 7.724f, 9.266f, 8.73f, 5.069f)
                curveToRelative(0.35f, -1.539f, 1.253f, -3.309f, 3.02f, -3.492f)
                moveToRelative(1.996f, 0.04f)
                curveToRelative(1.534f, 0.357f, 3.031f, 1.096f, 3.906f, 2.48f)
                curveToRelative(1.3f, 1.93f, 1.318f, 4.55f, 0.1f, 6.521f)
                curveToRelative(-1.268f, 2.395f, -3.06f, 4.463f, -4.916f, 6.415f)
                curveToRelative(1.472f, -2.974f, 3.074f, -6.106f, 3.182f, -9.5f)
                curveToRelative(-0.043f, -2.08f, -0.438f, -4.612f, -2.272f, -5.916f)
                moveTo(11.97f, 20.103f)
                curveToRelative(0.848f, 0.342f, 1.597f, 1.983f, 0.153f, 2.173f)
                curveToRelative(-0.664f, 0.15f, -1.367f, -0.599f, -0.995f, -1.222f)
                curveToRelative(0.213f, -0.355f, 0.488f, -0.73f, 0.842f, -0.95f)
            }
        }
        .build()
        return _flydotio!!
    }

private var _flydotio: ImageVector? = null
