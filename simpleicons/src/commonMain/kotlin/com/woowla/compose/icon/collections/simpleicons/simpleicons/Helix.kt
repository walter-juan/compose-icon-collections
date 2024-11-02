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

public val Simpleicons.Helix: ImageVector
    get() {
        if (_helix != null) {
            return _helix!!
        }
        _helix = Builder(name = "Helix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.968f, 4.97f)
                lineTo(4.364f, 0.0f)
                verticalLineToRelative(3.55f)
                curveToRelative(0.0f, 0.449f, 0.239f, 0.863f, 0.627f, 1.087f)
                lineToRelative(4.276f, 2.47f)
                close()
                moveTo(18.307f, 8.053f)
                lineTo(14.607f, 10.191f)
                lineTo(19.467f, 12.998f)
                curveToRelative(0.11f, -0.19f, 0.17f, -0.407f, 0.17f, -0.633f)
                lineTo(19.637f, 9.552f)
                curveToRelative(0.0f, -0.452f, -0.241f, -0.87f, -0.633f, -1.096f)
                close()
                moveTo(19.637f, 20.45f)
                curveToRelative(0.0f, -0.449f, -0.24f, -0.863f, -0.627f, -1.087f)
                lineToRelative(-4.253f, -2.456f)
                lineToRelative(-3.7f, 2.137f)
                lineTo(19.637f, 24.0f)
                close()
                moveTo(5.717f, 15.96f)
                lineTo(9.417f, 13.823f)
                curveToRelative(-2.703f, -1.562f, -4.884f, -2.82f, -4.884f, -2.82f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, false, -0.17f, 0.632f)
                verticalLineToRelative(2.813f)
                curveToRelative(0.0f, 0.452f, 0.242f, 0.87f, 0.634f, 1.096f)
                close()
                moveTo(5.43f, 14.708f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, 0.343f, -0.342f)
                lineToRelative(12.455f, -7.194f)
                lineToRelative(-0.01f, 0.007f)
                lineToRelative(0.786f, -0.455f)
                curveToRelative(0.392f, -0.226f, 0.633f, -0.643f, 0.633f, -1.096f)
                lineTo(19.637f, 2.815f)
                curveToRelative(0.0f, -0.452f, -0.241f, -0.87f, -0.633f, -1.096f)
                lineToRelative(-0.765f, -0.442f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.005f, 1.617f)
                lineToRelative(-0.006f, 0.004f)
                lineToRelative(-13.231f, 7.641f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, false, -0.633f, 1.096f)
                verticalLineToRelative(2.813f)
                curveToRelative(0.0f, 0.453f, 0.24f, 0.87f, 0.633f, 1.096f)
                lineToRelative(0.72f, 0.416f)
                horizontalLineToRelative(0.002f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.29f, -1.252f)
                moveToRelative(12.873f, -6.652f)
                arcToRelative(0.945f, 0.945f, 0.0f, false, true, -0.07f, 1.575f)
                lineToRelative(-0.005f, 0.004f)
                lineToRelative(-13.231f, 7.641f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, false, -0.633f, 1.096f)
                verticalLineToRelative(2.813f)
                curveToRelative(0.0f, 0.452f, 0.24f, 0.87f, 0.633f, 1.096f)
                lineToRelative(0.765f, 0.442f)
                arcToRelative(0.945f, 0.945f, 0.0f, false, true, 0.01f, -1.62f)
                lineToRelative(12.456f, -7.194f)
                lineToRelative(-0.01f, 0.006f)
                lineToRelative(0.786f, -0.454f)
                curveToRelative(0.392f, -0.226f, 0.633f, -0.644f, 0.633f, -1.096f)
                lineTo(19.636f, 9.552f)
                curveToRelative(0.0f, -0.453f, -0.241f, -0.87f, -0.633f, -1.096f)
                lineToRelative(-0.697f, -0.403f)
                close()
            }
        }
        .build()
        return _helix!!
    }

private var _helix: ImageVector? = null
