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

public val MapGroup.PlanetFill: ImageVector
    get() {
        if (_planetFill != null) {
            return _planetFill!!
        }
        _planetFill = Builder(name = "PlanetFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.322f, 5.966f)
                curveTo(5.424f, 5.854f, 5.528f, 5.744f, 5.636f, 5.636f)
                curveTo(6.119f, 5.153f, 6.644f, 4.736f, 7.199f, 4.385f)
                curveTo(6.885f, 4.299f, 6.603f, 4.247f, 6.355f, 4.229f)
                curveTo(5.783f, 4.186f, 5.532f, 4.322f, 5.426f, 4.428f)
                curveTo(5.319f, 4.535f, 5.183f, 4.786f, 5.226f, 5.358f)
                curveTo(5.24f, 5.542f, 5.272f, 5.745f, 5.322f, 5.966f)
                close()
                moveTo(20.726f, 14.211f)
                curveTo(20.787f, 14.334f, 20.846f, 14.456f, 20.903f, 14.577f)
                curveTo(21.379f, 15.598f, 21.694f, 16.594f, 21.762f, 17.49f)
                curveTo(21.829f, 18.382f, 21.656f, 19.311f, 20.982f, 19.985f)
                curveTo(20.308f, 20.659f, 19.379f, 20.832f, 18.487f, 20.765f)
                curveTo(17.707f, 20.706f, 16.85f, 20.459f, 15.967f, 20.081f)
                lineTo(15.964f, 20.083f)
                curveTo(15.811f, 20.017f, 15.657f, 19.948f, 15.502f, 19.875f)
                curveTo(13.469f, 18.912f, 11.144f, 17.221f, 8.96f, 15.037f)
                curveTo(6.779f, 12.856f, 5.088f, 10.532f, 4.125f, 8.501f)
                curveTo(4.052f, 8.346f, 3.982f, 8.191f, 3.916f, 8.038f)
                lineTo(3.917f, 8.036f)
                curveTo(3.538f, 7.151f, 3.291f, 6.291f, 3.232f, 5.509f)
                curveTo(3.164f, 4.617f, 3.337f, 3.688f, 4.011f, 3.014f)
                curveTo(4.685f, 2.34f, 5.614f, 2.167f, 6.506f, 2.234f)
                curveTo(7.402f, 2.302f, 8.398f, 2.617f, 9.419f, 3.093f)
                curveTo(9.543f, 3.151f, 9.667f, 3.211f, 9.792f, 3.274f)
                curveTo(12.762f, 2.525f, 16.04f, 3.312f, 18.364f, 5.636f)
                curveTo(20.688f, 7.96f, 21.476f, 11.24f, 20.726f, 14.211f)
                close()
                moveTo(19.613f, 16.804f)
                curveTo(19.263f, 17.358f, 18.847f, 17.881f, 18.364f, 18.364f)
                curveTo(18.257f, 18.471f, 18.148f, 18.575f, 18.037f, 18.675f)
                curveTo(18.255f, 18.725f, 18.456f, 18.757f, 18.638f, 18.77f)
                curveTo(19.21f, 18.813f, 19.461f, 18.677f, 19.568f, 18.571f)
                curveTo(19.675f, 18.464f, 19.81f, 18.213f, 19.767f, 17.641f)
                curveTo(19.749f, 17.395f, 19.698f, 17.115f, 19.613f, 16.804f)
                close()
                moveTo(5.636f, 18.364f)
                curveTo(3.372f, 16.1f, 2.567f, 12.931f, 3.219f, 10.022f)
                curveTo(4.301f, 12.003f, 5.924f, 14.122f, 7.899f, 16.098f)
                curveTo(9.876f, 18.075f, 11.997f, 19.698f, 13.979f, 20.781f)
                curveTo(11.071f, 21.434f, 7.9f, 20.628f, 5.636f, 18.364f)
                close()
            }
        }
        .build()
        return _planetFill!!
    }

private var _planetFill: ImageVector? = null
