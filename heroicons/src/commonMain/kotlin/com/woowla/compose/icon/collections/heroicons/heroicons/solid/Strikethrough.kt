package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.657f, 4.728f)
                curveTo(8.571f, 5.113f, 7.891f, 5.785f, 7.678f, 6.578f)
                curveTo(7.464f, 7.378f, 7.724f, 8.311f, 8.488f, 9.194f)
                curveTo(9.234f, 10.056f, 10.417f, 10.806f, 11.876f, 11.197f)
                curveTo(11.946f, 11.216f, 12.016f, 11.233f, 12.086f, 11.25f)
                horizontalLineTo(20.249f)
                curveTo(20.664f, 11.25f, 20.999f, 11.586f, 20.999f, 12.0f)
                curveTo(20.999f, 12.415f, 20.664f, 12.75f, 20.249f, 12.75f)
                horizontalLineTo(12.01f)
                curveTo(12.003f, 12.75f, 11.997f, 12.75f, 11.99f, 12.75f)
                horizontalLineTo(3.75f)
                curveTo(3.335f, 12.75f, 3.0f, 12.415f, 3.0f, 12.0f)
                curveTo(3.0f, 11.586f, 3.335f, 11.25f, 3.75f, 11.25f)
                horizontalLineTo(8.529f)
                curveTo(8.084f, 10.925f, 7.69f, 10.564f, 7.354f, 10.176f)
                curveTo(6.372f, 9.042f, 5.849f, 7.611f, 6.229f, 6.19f)
                curveTo(6.606f, 4.782f, 7.757f, 3.81f, 9.156f, 3.314f)
                curveTo(10.558f, 2.817f, 12.283f, 2.765f, 14.011f, 3.228f)
                curveTo(15.118f, 3.524f, 16.114f, 4.002f, 16.94f, 4.601f)
                curveTo(17.275f, 4.845f, 17.35f, 5.314f, 17.107f, 5.649f)
                curveTo(16.863f, 5.984f, 16.394f, 6.059f, 16.059f, 5.816f)
                curveTo(15.388f, 5.329f, 14.561f, 4.928f, 13.623f, 4.677f)
                curveTo(12.15f, 4.282f, 10.738f, 4.345f, 9.657f, 4.728f)
                close()
                moveTo(16.19f, 14.359f)
                curveTo(16.544f, 14.144f, 17.005f, 14.257f, 17.22f, 14.611f)
                curveTo(17.812f, 15.584f, 18.066f, 16.704f, 17.769f, 17.811f)
                curveTo(17.392f, 19.218f, 16.242f, 20.191f, 14.843f, 20.686f)
                curveTo(13.441f, 21.183f, 11.716f, 21.236f, 9.988f, 20.773f)
                curveTo(8.276f, 20.314f, 6.82f, 19.419f, 5.854f, 18.302f)
                curveTo(5.583f, 17.989f, 5.617f, 17.515f, 5.93f, 17.244f)
                curveTo(6.243f, 16.973f, 6.717f, 17.007f, 6.988f, 17.321f)
                curveTo(7.734f, 18.183f, 8.917f, 18.933f, 10.376f, 19.324f)
                curveTo(11.849f, 19.718f, 13.26f, 19.655f, 14.342f, 19.272f)
                curveTo(15.427f, 18.888f, 16.108f, 18.215f, 16.32f, 17.422f)
                curveTo(16.489f, 16.794f, 16.366f, 16.093f, 15.939f, 15.39f)
                curveTo(15.724f, 15.036f, 15.836f, 14.575f, 16.19f, 14.359f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
