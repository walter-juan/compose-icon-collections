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

public val Simpleicons.Arcgis: ImageVector
    get() {
        if (_arcgis != null) {
            return _arcgis!!
        }
        _arcgis = Builder(name = "Arcgis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(0.849f, 0.849f, 0.0f, false, false, -0.338f, 0.07f)
                lineToRelative(-8.518f, 3.694f)
                curveTo(2.146f, 4.198f, 1.5f, 5.182f, 1.5f, 6.27f)
                verticalLineToRelative(13.252f)
                lineToRelative(10.163f, 4.408f)
                curveToRelative(0.215f, 0.093f, 0.46f, 0.094f, 0.675f, 0.001f)
                lineToRelative(8.518f, -3.696f)
                curveToRelative(0.998f, -0.433f, 1.644f, -1.417f, 1.644f, -2.505f)
                lineTo(22.5f, 4.478f)
                lineTo(12.338f, 0.07f)
                curveTo(12.23f, 0.023f, 12.115f, -0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 4.837f)
                curveToRelative(4.163f, 0.0f, 7.538f, 3.375f, 7.538f, 7.538f)
                reflectiveCurveTo(16.163f, 19.912f, 12.0f, 19.912f)
                curveToRelative(-4.163f, 0.0f, -7.538f, -3.375f, -7.538f, -7.538f)
                reflectiveCurveTo(7.837f, 4.837f, 12.0f, 4.837f)
                close()
                moveTo(11.65f, 6.226f)
                curveToRelative(-0.897f, -0.023f, -2.327f, 0.241f, -3.746f, 1.614f)
                curveToRelative(0.35f, 0.555f, 0.645f, 0.978f, 0.49f, 1.418f)
                curveToRelative(-0.231f, 0.655f, -0.514f, 0.514f, -1.071f, 0.995f)
                curveToRelative(-0.396f, 0.342f, 0.207f, 1.013f, -0.313f, 1.306f)
                curveToRelative(-0.519f, 0.293f, -1.213f, 0.664f, -0.949f, 1.176f)
                curveToRelative(0.264f, 0.512f, 1.469f, 0.83f, 1.959f, 1.075f)
                curveToRelative(0.49f, 0.245f, 0.928f, 0.706f, 0.607f, 1.237f)
                curveToRelative(-0.314f, 0.519f, -0.537f, 1.131f, -0.601f, 1.609f)
                curveToRelative(1.055f, 0.944f, 2.447f, 1.519f, 3.974f, 1.519f)
                curveToRelative(3.293f, 0.0f, 5.818f, -2.71f, 5.962f, -6.0f)
                curveToRelative(0.041f, -0.925f, -0.939f, -0.94f, -1.534f, -0.94f)
                curveToRelative(0.0f, 0.0f, 0.341f, 0.924f, 0.018f, 1.436f)
                curveToRelative(-0.322f, 0.513f, -0.85f, 0.762f, -0.835f, 1.377f)
                curveToRelative(0.015f, 0.615f, -0.937f, 1.597f, -1.26f, 1.948f)
                curveToRelative(-0.322f, 0.352f, -0.923f, 0.747f, -1.128f, -0.059f)
                curveToRelative(-0.205f, -0.806f, -0.126f, -1.478f, 0.108f, -2.049f)
                curveToRelative(0.234f, -0.571f, -0.217f, -0.747f, -0.921f, -0.762f)
                curveToRelative(-0.703f, -0.015f, -1.08f, -0.108f, -1.187f, -1.193f)
                curveToRelative(-0.088f, -0.894f, 1.243f, -1.844f, 1.814f, -1.844f)
                curveToRelative(0.334f, 0.0f, 1.455f, 0.22f, 1.507f, -0.341f)
                curveToRelative(0.081f, -0.859f, -0.82f, -1.042f, -1.039f, -1.602f)
                curveTo(13.288f, 7.587f, 14.986f, 6.607f, 12.0f, 6.25f)
                curveToRelative(-0.105f, -0.013f, -0.222f, -0.021f, -0.35f, -0.024f)
                close()
            }
        }
        .build()
        return _arcgis!!
    }

private var _arcgis: ImageVector? = null
