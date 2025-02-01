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

public val Simpleicons.Crewai: ImageVector
    get() {
        if (_crewai != null) {
            return _crewai!!
        }
        _crewai = Builder(name = "Crewai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.482f, 0.18f)
                curveTo(7.161f, 1.319f, 1.478f, 9.069f, 1.426f, 15.372f)
                curveToRelative(-0.051f, 5.527f, 3.1f, 8.68f, 8.68f, 8.627f)
                curveToRelative(6.716f, -0.05f, 14.259f, -6.87f, 12.09f, -10.9f)
                curveToRelative(-0.672f, -1.292f, -1.396f, -1.344f, -2.687f, -0.207f)
                curveToRelative(-1.602f, 1.395f, -1.654f, 0.31f, -0.207f, -2.893f)
                curveToRelative(1.757f, -3.98f, 1.705f, -5.322f, -0.31f, -7.544f)
                curveTo(17.03f, 0.388f, 14.962f, -0.388f, 12.482f, 0.181f)
                close()
                moveTo(17.804f, 2.248f)
                curveToRelative(2.273f, 2.015f, 2.376f, 4.236f, 0.465f, 8.42f)
                curveToRelative(-1.395f, 3.1f, -2.17f, 3.515f, -3.824f, 1.86f)
                curveToRelative(-1.24f, -1.24f, -1.343f, -3.46f, -0.258f, -6.044f)
                curveToRelative(1.137f, -2.635f, 0.982f, -3.1f, -0.568f, -1.653f)
                curveToRelative(-3.72f, 3.358f, -6.458f, 9.765f, -5.424f, 12.503f)
                curveToRelative(0.464f, 1.189f, 0.825f, 1.395f, 2.737f, 1.395f)
                curveToRelative(2.79f, 0.0f, 6.303f, -1.705f, 7.957f, -3.926f)
                curveToRelative(1.756f, -2.274f, 2.79f, -2.274f, 2.79f, -0.052f)
                curveToRelative(0.0f, 3.875f, -6.459f, 8.627f, -11.625f, 8.627f)
                curveToRelative(-6.251f, 0.0f, -9.351f, -4.752f, -7.491f, -11.47f)
                curveToRelative(0.878f, -2.995f, 4.443f, -7.904f, 7.077f, -9.66f)
                curveToRelative(3.255f, -2.17f, 5.684f, -2.17f, 8.164f, 0.0f)
                close()
            }
        }
        .build()
        return _crewai!!
    }

private var _crewai: ImageVector? = null
