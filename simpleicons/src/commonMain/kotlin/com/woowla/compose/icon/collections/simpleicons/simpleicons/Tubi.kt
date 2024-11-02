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

public val Simpleicons.Tubi: ImageVector
    get() {
        if (_tubi != null) {
            return _tubi!!
        }
        _tubi = Builder(name = "Tubi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.696f, 15.272f)
                verticalLineToRelative(-0.752f)
                curveToRelative(0.4f, 0.548f, 1.107f, 0.917f, 1.934f, 0.917f)
                curveToRelative(1.475f, 0.0f, 2.28f, -0.956f, 2.28f, -2.865f)
                curveToRelative(0.0f, -1.714f, -0.893f, -2.858f, -2.235f, -2.858f)
                curveToRelative(-0.851f, 0.0f, -1.55f, 0.347f, -1.979f, 0.908f)
                verticalLineToRelative(-2.06f)
                horizontalLineToRelative(-2.674f)
                verticalLineToRelative(6.71f)
                close()
                moveTo(18.266f, 12.658f)
                curveToRelative(0.0f, 0.827f, -0.337f, 1.275f, -0.827f, 1.275f)
                curveToRelative(-0.486f, 0.0f, -0.837f, -0.452f, -0.837f, -1.275f)
                reflectiveCurveToRelative(0.342f, -1.28f, 0.837f, -1.28f)
                curveToRelative(0.495f, 0.0f, 0.828f, 0.452f, 0.828f, 1.28f)
                close()
                moveTo(6.94f, 9.988f)
                verticalLineToRelative(3.6f)
                curveToRelative(0.0f, 1.236f, 0.754f, 1.841f, 1.955f, 1.841f)
                curveToRelative(0.959f, 0.0f, 1.625f, -0.396f, 2.028f, -1.064f)
                verticalLineToRelative(0.91f)
                horizontalLineToRelative(2.597f)
                lineTo(13.52f, 9.989f)
                horizontalLineToRelative(-2.675f)
                verticalLineToRelative(3.14f)
                curveToRelative(0.0f, 0.493f, -0.346f, 0.693f, -0.666f, 0.693f)
                curveToRelative(-0.321f, 0.0f, -0.568f, -0.192f, -0.568f, -0.655f)
                lineTo(9.611f, 9.989f)
                close()
                moveTo(21.33f, 9.988f)
                lineTo(24.0f, 9.988f)
                verticalLineToRelative(5.276f)
                horizontalLineToRelative(-2.67f)
                close()
                moveTo(6.553f, 11.136f)
                curveToRelative(0.0f, 0.781f, -0.635f, 1.415f, -1.42f, 1.415f)
                curveToRelative(-0.783f, 0.0f, -1.419f, -0.634f, -1.419f, -1.415f)
                curveToRelative(0.0f, -0.782f, 0.636f, -1.415f, 1.42f, -1.415f)
                curveToRelative(0.784f, 0.0f, 1.42f, 0.633f, 1.42f, 1.415f)
                close()
                moveTo(3.49f, 9.702f)
                verticalLineToRelative(2.668f)
                curveToRelative(0.005f, 0.653f, 0.327f, 0.924f, 0.976f, 0.924f)
                curveToRelative(0.225f, 0.0f, 0.526f, -0.053f, 0.672f, -0.166f)
                verticalLineToRelative(1.931f)
                curveToRelative(-0.49f, 0.243f, -0.869f, 0.378f, -1.535f, 0.378f)
                curveToRelative(0.0f, 0.0f, -0.069f, 0.0f, -0.18f, -0.006f)
                lineToRelative(-0.003f, 0.006f)
                curveToRelative(-1.614f, 0.0f, -2.51f, -1.035f, -2.482f, -2.686f)
                verticalLineToRelative(-0.47f)
                lineTo(0.0f, 12.281f)
                lineTo(0.0f, 9.99f)
                horizontalLineToRelative(0.92f)
                lineTo(0.92f, 8.563f)
                horizontalLineToRelative(2.569f)
                close()
            }
        }
        .build()
        return _tubi!!
    }

private var _tubi: ImageVector? = null
