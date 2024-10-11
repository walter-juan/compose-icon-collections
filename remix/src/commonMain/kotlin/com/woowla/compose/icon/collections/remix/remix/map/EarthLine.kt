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

public val MapGroup.EarthLine: ImageVector
    get() {
        if (_earthLine != null) {
            return _earthLine!!
        }
        _earthLine = Builder(name = "EarthLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.235f, 6.453f)
                curveTo(4.851f, 7.891f, 4.0f, 9.846f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(13.081f, 20.0f, 14.112f, 19.786f, 15.052f, 19.397f)
                curveTo(15.167f, 18.647f, 14.915f, 17.927f, 14.812f, 17.675f)
                curveTo(14.582f, 17.115f, 13.824f, 16.158f, 12.559f, 14.831f)
                curveTo(12.221f, 14.476f, 12.243f, 14.203f, 12.364f, 13.394f)
                lineTo(12.377f, 13.303f)
                curveTo(12.46f, 12.749f, 12.597f, 12.421f, 14.462f, 12.125f)
                curveTo(15.41f, 11.975f, 15.659f, 12.353f, 16.004f, 12.878f)
                curveTo(16.042f, 12.936f, 16.081f, 12.993f, 16.12f, 13.05f)
                curveTo(16.448f, 13.53f, 16.691f, 13.639f, 17.058f, 13.806f)
                curveTo(17.223f, 13.881f, 17.428f, 13.975f, 17.703f, 14.131f)
                curveTo(18.355f, 14.504f, 18.355f, 14.925f, 18.355f, 15.847f)
                verticalLineTo(15.952f)
                curveTo(18.355f, 16.343f, 18.317f, 16.687f, 18.257f, 16.986f)
                curveTo(19.348f, 15.618f, 20.0f, 13.885f, 20.0f, 12.0f)
                curveTo(20.0f, 8.701f, 18.003f, 5.868f, 15.152f, 4.645f)
                curveTo(14.599f, 5.018f, 13.84f, 5.547f, 13.575f, 5.91f)
                curveTo(13.44f, 6.095f, 13.248f, 7.042f, 12.626f, 7.12f)
                curveTo(12.463f, 7.14f, 12.244f, 7.126f, 12.012f, 7.111f)
                curveTo(11.391f, 7.071f, 10.54f, 7.016f, 10.268f, 7.755f)
                curveTo(10.095f, 8.223f, 10.065f, 9.494f, 10.624f, 10.154f)
                curveTo(10.713f, 10.26f, 10.731f, 10.455f, 10.67f, 10.674f)
                curveTo(10.59f, 10.961f, 10.429f, 11.136f, 10.378f, 11.172f)
                curveTo(10.282f, 11.116f, 10.09f, 10.893f, 9.959f, 10.741f)
                curveTo(9.646f, 10.377f, 9.254f, 9.922f, 8.748f, 9.782f)
                curveTo(8.564f, 9.731f, 8.362f, 9.689f, 8.165f, 9.647f)
                curveTo(7.616f, 9.532f, 6.994f, 9.401f, 6.85f, 9.093f)
                curveTo(6.744f, 8.867f, 6.745f, 8.556f, 6.745f, 8.228f)
                curveTo(6.745f, 7.811f, 6.745f, 7.34f, 6.541f, 6.883f)
                curveTo(6.462f, 6.705f, 6.357f, 6.564f, 6.235f, 6.453f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _earthLine!!
    }

private var _earthLine: ImageVector? = null
