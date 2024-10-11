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

public val MapGroup.PlanetLine: ImageVector
    get() {
        if (_planetLine != null) {
            return _planetLine!!
        }
        _planetLine = Builder(name = "PlanetLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.918f, 8.037f)
                curveTo(3.33f, 9.233f, 3.0f, 10.579f, 3.0f, 12.0f)
                curveTo(3.0f, 16.971f, 7.029f, 21.0f, 12.0f, 21.0f)
                curveTo(13.422f, 21.0f, 14.768f, 20.67f, 15.966f, 20.081f)
                curveTo(16.838f, 20.455f, 17.685f, 20.699f, 18.456f, 20.762f)
                curveTo(19.358f, 20.836f, 20.3f, 20.667f, 20.982f, 19.985f)
                curveTo(21.734f, 19.233f, 21.862f, 18.169f, 21.728f, 17.173f)
                curveTo(21.605f, 16.264f, 21.248f, 15.254f, 20.726f, 14.212f)
                curveTo(20.905f, 13.503f, 21.0f, 12.762f, 21.0f, 12.0f)
                curveTo(21.0f, 7.029f, 16.971f, 3.0f, 12.0f, 3.0f)
                curveTo(11.239f, 3.0f, 10.499f, 3.095f, 9.791f, 3.273f)
                curveTo(8.747f, 2.75f, 7.736f, 2.392f, 6.826f, 2.268f)
                curveTo(5.829f, 2.133f, 4.764f, 2.261f, 4.011f, 3.014f)
                curveTo(3.329f, 3.697f, 3.16f, 4.64f, 3.234f, 5.542f)
                curveTo(3.298f, 6.315f, 3.543f, 7.163f, 3.918f, 8.037f)
                close()
                moveTo(5.322f, 5.966f)
                curveTo(5.273f, 5.753f, 5.242f, 5.557f, 5.227f, 5.379f)
                curveTo(5.179f, 4.793f, 5.317f, 4.537f, 5.425f, 4.428f)
                curveTo(5.545f, 4.309f, 5.848f, 4.154f, 6.557f, 4.25f)
                curveTo(6.755f, 4.277f, 6.97f, 4.322f, 7.2f, 4.386f)
                curveTo(6.504f, 4.825f, 5.872f, 5.358f, 5.322f, 5.966f)
                close()
                moveTo(19.612f, 16.803f)
                curveTo(19.675f, 17.032f, 19.719f, 17.245f, 19.746f, 17.441f)
                curveTo(19.842f, 18.149f, 19.687f, 18.452f, 19.568f, 18.571f)
                curveTo(19.459f, 18.679f, 19.204f, 18.816f, 18.619f, 18.769f)
                curveTo(18.442f, 18.754f, 18.247f, 18.723f, 18.037f, 18.675f)
                curveTo(18.643f, 18.127f, 19.174f, 17.497f, 19.612f, 16.803f)
                close()
                moveTo(15.881f, 17.826f)
                curveTo(14.205f, 16.948f, 12.257f, 15.503f, 10.375f, 13.621f)
                curveTo(8.495f, 11.741f, 7.051f, 9.796f, 6.172f, 8.12f)
                curveTo(7.064f, 6.785f, 8.401f, 5.773f, 9.969f, 5.299f)
                curveTo(10.611f, 5.105f, 11.292f, 5.0f, 12.0f, 5.0f)
                curveTo(15.866f, 5.0f, 19.0f, 8.134f, 19.0f, 12.0f)
                curveTo(19.0f, 12.708f, 18.895f, 13.391f, 18.701f, 14.033f)
                curveTo(18.226f, 15.599f, 17.215f, 16.936f, 15.881f, 17.826f)
                close()
                moveTo(13.605f, 18.815f)
                curveTo(13.09f, 18.936f, 12.553f, 19.0f, 12.0f, 19.0f)
                curveTo(8.134f, 19.0f, 5.0f, 15.866f, 5.0f, 12.0f)
                curveTo(5.0f, 11.448f, 5.064f, 10.911f, 5.184f, 10.396f)
                curveTo(6.149f, 11.913f, 7.435f, 13.509f, 8.961f, 15.035f)
                curveTo(10.489f, 16.563f, 12.087f, 17.85f, 13.605f, 18.815f)
                close()
            }
        }
        .build()
        return _planetLine!!
    }

private var _planetLine: ImageVector? = null
