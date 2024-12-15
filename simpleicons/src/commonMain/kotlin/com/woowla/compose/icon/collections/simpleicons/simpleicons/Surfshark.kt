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

public val Simpleicons.Surfshark: ImageVector
    get() {
        if (_surfshark != null) {
            return _surfshark!!
        }
        _surfshark = Builder(name = "Surfshark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.47f, 0.0f)
                curveTo(7.815f, 0.2f, 6.3f, 2.293f, 5.872f, 3.43f)
                curveToRelative(-1.615f, 4.866f, -3.127f, 14.325f, -3.33f, 15.662f)
                curveToRelative(-0.201f, 1.31f, -0.228f, 2.119f, -0.228f, 2.119f)
                curveToRelative(0.0f, 0.328f, 0.026f, 0.705f, 0.102f, 1.059f)
                curveToRelative(0.454f, 1.286f, 1.792f, 2.37f, 4.768f, 1.287f)
                arcToRelative(192.353f, 192.353f, 0.0f, false, false, 9.533f, -4.44f)
                curveToRelative(1.387f, -0.807f, 3.227f, -2.32f, 4.236f, -4.312f)
                curveToRelative(0.404f, -0.807f, 0.682f, -1.716f, 0.733f, -2.65f)
                verticalLineToRelative(-0.452f)
                curveToRelative(-0.026f, -2.295f, -0.052f, -4.692f, -0.204f, -7.013f)
                curveToRelative(0.0f, 0.0f, -0.125f, -1.488f, -0.2f, -2.017f)
                curveToRelative(-0.076f, -0.53f, -0.177f, -0.733f, -0.177f, -0.733f)
                curveTo(20.626f, 0.906f, 19.693f, 0.38f, 18.71f, 0.126f)
                curveTo(18.23f, 0.026f, 17.7f, 0.024f, 17.095f, 0.0f)
                close()
                moveTo(16.162f, 4.44f)
                horizontalLineToRelative(0.252f)
                curveToRelative(0.277f, 0.0f, 0.48f, 0.2f, 0.48f, 0.452f)
                lineTo(16.894f, 6.53f)
                curveToRelative(0.0f, 0.252f, -0.203f, 0.455f, -0.48f, 0.455f)
                horizontalLineToRelative(-0.252f)
                curveToRelative(-1.589f, 0.0f, -2.875f, 1.26f, -2.875f, 2.8f)
                verticalLineToRelative(2.498f)
                curveToRelative(0.0f, 2.976f, -2.472f, 5.37f, -5.498f, 5.37f)
                horizontalLineToRelative(-0.254f)
                curveToRelative(-0.277f, 0.0f, -0.478f, -0.2f, -0.478f, -0.452f)
                verticalLineToRelative(-1.64f)
                curveToRelative(0.0f, -0.253f, 0.226f, -0.454f, 0.478f, -0.454f)
                horizontalLineToRelative(0.254f)
                curveToRelative(1.589f, 0.0f, 2.875f, -1.262f, 2.875f, -2.8f)
                lineTo(10.664f, 9.81f)
                curveToRelative(0.0f, -2.977f, 2.472f, -5.373f, 5.498f, -5.373f)
                close()
            }
        }
        .build()
        return _surfshark!!
    }

private var _surfshark: ImageVector? = null
