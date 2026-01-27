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

public val Simpleicons.Woo: ImageVector
    get() {
        if (_woo != null) {
            return _woo!!
        }
        _woo = Builder(name = "Woo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.118f, 8.895f)
                curveToRelative(-0.562f, 0.0f, -0.928f, 0.183f, -1.255f, 0.797f)
                lineToRelative(-1.49f, 2.811f)
                verticalLineToRelative(-2.496f)
                curveToRelative(0.0f, -0.745f, -0.353f, -1.111f, -1.007f, -1.111f)
                reflectiveCurveToRelative(-0.928f, 0.222f, -1.255f, 0.85f)
                lineToRelative(-1.412f, 2.757f)
                verticalLineToRelative(-2.47f)
                curveToRelative(0.0f, -0.797f, -0.327f, -1.137f, -1.124f, -1.137f)
                lineTo(0.954f, 8.896f)
                curveTo(0.34f, 8.895f, 0.0f, 9.183f, 0.0f, 9.706f)
                reflectiveCurveToRelative(0.327f, 0.837f, 0.928f, 0.837f)
                horizontalLineToRelative(0.667f)
                verticalLineToRelative(3.15f)
                curveToRelative(0.0f, 0.889f, 0.601f, 1.412f, 1.464f, 1.412f)
                reflectiveCurveToRelative(1.255f, -0.34f, 1.686f, -1.137f)
                lineToRelative(0.941f, -1.765f)
                verticalLineToRelative(1.49f)
                curveToRelative(0.0f, 0.876f, 0.575f, 1.412f, 1.451f, 1.412f)
                reflectiveCurveToRelative(1.203f, -0.301f, 1.699f, -1.137f)
                lineToRelative(2.17f, -3.66f)
                curveToRelative(0.471f, -0.798f, 0.144f, -1.413f, -0.901f, -1.413f)
                close()
                moveTo(14.196f, 8.895f)
                curveToRelative(-1.778f, 0.0f, -3.124f, 1.321f, -3.124f, 3.112f)
                reflectiveCurveToRelative(1.359f, 3.098f, 3.124f, 3.098f)
                reflectiveCurveToRelative(3.111f, -1.32f, 3.124f, -3.098f)
                curveToRelative(0.0f, -1.791f, -1.359f, -3.112f, -3.124f, -3.112f)
                moveToRelative(0.0f, 4.301f)
                curveToRelative(-0.667f, 0.0f, -1.124f, -0.497f, -1.124f, -1.19f)
                reflectiveCurveToRelative(0.458f, -1.203f, 1.124f, -1.203f)
                reflectiveCurveToRelative(1.124f, 0.51f, 1.124f, 1.203f)
                reflectiveCurveToRelative(-0.444f, 1.19f, -1.124f, 1.19f)
                moveToRelative(6.68f, -4.301f)
                curveToRelative(-1.765f, 0.0f, -3.124f, 1.32f, -3.124f, 3.111f)
                reflectiveCurveToRelative(1.359f, 3.098f, 3.124f, 3.098f)
                reflectiveCurveTo(24.0f, 13.784f, 24.0f, 12.006f)
                reflectiveCurveToRelative(-1.359f, -3.111f, -3.124f, -3.111f)
                moveToRelative(0.0f, 4.301f)
                curveToRelative(-0.68f, 0.0f, -1.111f, -0.497f, -1.111f, -1.19f)
                reflectiveCurveToRelative(0.444f, -1.203f, 1.111f, -1.203f)
                reflectiveCurveTo(22.0f, 11.313f, 22.0f, 12.006f)
                reflectiveCurveToRelative(-0.444f, 1.19f, -1.124f, 1.19f)
            }
        }
        .build()
        return _woo!!
    }

private var _woo: ImageVector? = null
