package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.EarthFill: ImageVector
    get() {
        if (_earthFill != null) {
            return _earthFill!!
        }
        _earthFill = Builder(name = "EarthFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.004f, 12.878f)
                curveTo(15.659f, 12.353f, 15.41f, 11.975f, 14.462f, 12.125f)
                curveTo(12.672f, 12.409f, 12.473f, 12.722f, 12.388f, 13.238f)
                lineTo(12.364f, 13.394f)
                lineTo(12.339f, 13.56f)
                curveTo(12.242f, 14.243f, 12.245f, 14.501f, 12.559f, 14.831f)
                curveTo(13.824f, 16.158f, 14.582f, 17.115f, 14.812f, 17.675f)
                curveTo(14.924f, 17.948f, 15.212f, 18.775f, 15.014f, 19.593f)
                curveTo(16.237f, 19.107f, 17.316f, 18.333f, 18.165f, 17.356f)
                curveTo(18.275f, 16.982f, 18.355f, 16.517f, 18.355f, 15.952f)
                verticalLineTo(15.847f)
                curveTo(18.355f, 14.925f, 18.355f, 14.504f, 17.703f, 14.131f)
                curveTo(17.428f, 13.975f, 17.223f, 13.881f, 17.058f, 13.806f)
                curveTo(16.691f, 13.639f, 16.448f, 13.53f, 16.12f, 13.05f)
                curveTo(16.081f, 12.993f, 16.042f, 12.936f, 16.004f, 12.878f)
                close()
                moveTo(12.0f, 3.833f)
                curveTo(9.683f, 3.833f, 7.591f, 4.799f, 6.104f, 6.349f)
                curveTo(6.281f, 6.472f, 6.435f, 6.645f, 6.541f, 6.883f)
                curveTo(6.745f, 7.34f, 6.745f, 7.811f, 6.745f, 8.228f)
                curveTo(6.745f, 8.556f, 6.744f, 8.867f, 6.85f, 9.093f)
                curveTo(6.994f, 9.401f, 7.616f, 9.532f, 8.165f, 9.647f)
                curveTo(8.362f, 9.689f, 8.564f, 9.731f, 8.748f, 9.782f)
                curveTo(9.254f, 9.922f, 9.646f, 10.377f, 9.959f, 10.741f)
                curveTo(10.09f, 10.893f, 10.282f, 11.116f, 10.378f, 11.172f)
                curveTo(10.429f, 11.136f, 10.59f, 10.961f, 10.67f, 10.674f)
                curveTo(10.731f, 10.455f, 10.713f, 10.26f, 10.624f, 10.154f)
                curveTo(10.065f, 9.494f, 10.095f, 8.223f, 10.268f, 7.755f)
                curveTo(10.54f, 7.016f, 11.391f, 7.071f, 12.012f, 7.111f)
                curveTo(12.244f, 7.126f, 12.463f, 7.14f, 12.626f, 7.12f)
                curveTo(13.248f, 7.042f, 13.44f, 6.095f, 13.575f, 5.91f)
                curveTo(13.867f, 5.51f, 14.761f, 4.907f, 15.316f, 4.535f)
                curveTo(14.302f, 4.084f, 13.181f, 3.833f, 12.0f, 3.833f)
                close()
            }
        }
        .build()
        return _earthFill!!
    }

private var _earthFill: ImageVector? = null
