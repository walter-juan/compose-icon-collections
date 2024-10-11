package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.AmazonLine: ImageVector
    get() {
        if (_amazonLine != null) {
            return _amazonLine!!
        }
        _amazonLine = Builder(name = "AmazonLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.626f, 14.62f)
                curveTo(14.519f, 16.239f, 12.898f, 17.004f, 11.001f, 17.004f)
                curveTo(8.697f, 17.004f, 6.724f, 15.231f, 7.008f, 12.88f)
                curveTo(7.322f, 10.272f, 9.347f, 9.15f, 12.716f, 8.737f)
                curveTo(13.317f, 8.664f, 13.566f, 8.643f, 14.863f, 8.547f)
                curveTo(14.912f, 8.543f, 14.958f, 8.54f, 15.001f, 8.537f)
                curveTo(15.001f, 8.465f, 15.001f, 8.394f, 15.001f, 8.322f)
                curveTo(15.001f, 6.526f, 13.933f, 5.3f, 12.501f, 5.3f)
                curveTo(11.064f, 5.3f, 10.06f, 6.047f, 9.446f, 7.826f)
                lineTo(7.555f, 7.174f)
                curveTo(8.443f, 4.604f, 10.193f, 3.3f, 12.501f, 3.3f)
                curveTo(15.103f, 3.3f, 17.001f, 5.478f, 17.001f, 8.322f)
                curveTo(17.001f, 10.971f, 17.164f, 13.078f, 17.484f, 13.879f)
                curveTo(17.84f, 14.771f, 17.97f, 14.996f, 18.368f, 15.492f)
                lineTo(16.808f, 16.743f)
                curveTo(16.284f, 16.091f, 16.055f, 15.694f, 15.626f, 14.621f)
                lineTo(15.626f, 14.62f)
                close()
                moveTo(21.257f, 20.545f)
                curveTo(20.986f, 20.745f, 20.516f, 20.626f, 20.729f, 20.105f)
                curveTo(20.993f, 19.457f, 21.275f, 18.697f, 20.991f, 18.353f)
                curveTo(20.781f, 18.098f, 20.524f, 17.971f, 19.964f, 17.971f)
                curveTo(19.504f, 17.971f, 19.273f, 18.031f, 18.969f, 18.051f)
                curveTo(18.765f, 18.065f, 18.675f, 17.754f, 18.878f, 17.611f)
                curveTo(19.139f, 17.426f, 19.422f, 17.281f, 19.748f, 17.183f)
                curveTo(20.898f, 16.839f, 22.253f, 17.028f, 22.417f, 17.266f)
                curveTo(22.783f, 17.796f, 22.219f, 19.835f, 21.257f, 20.545f)
                close()
                moveTo(20.075f, 19.461f)
                curveTo(19.814f, 19.716f, 19.53f, 19.95f, 19.246f, 20.156f)
                curveTo(17.124f, 21.772f, 14.375f, 22.617f, 11.988f, 22.617f)
                curveTo(8.145f, 22.617f, 4.708f, 20.823f, 2.1f, 17.821f)
                curveTo(1.876f, 17.591f, 2.061f, 17.256f, 2.323f, 17.437f)
                curveTo(5.132f, 19.514f, 8.611f, 20.77f, 12.211f, 20.77f)
                curveTo(14.477f, 20.77f, 16.92f, 20.233f, 19.246f, 19.077f)
                curveTo(19.409f, 19.001f, 19.591f, 18.896f, 19.75f, 18.823f)
                curveTo(20.117f, 18.613f, 20.44f, 19.129f, 20.075f, 19.461f)
                close()
                moveTo(15.011f, 10.541f)
                curveTo(13.752f, 10.635f, 13.515f, 10.654f, 12.959f, 10.722f)
                curveTo(10.406f, 11.035f, 9.162f, 11.725f, 8.993f, 13.12f)
                curveTo(8.868f, 14.163f, 9.803f, 15.004f, 11.001f, 15.004f)
                curveTo(13.04f, 15.004f, 14.518f, 13.776f, 15.023f, 10.541f)
                curveTo(15.019f, 10.541f, 15.015f, 10.541f, 15.011f, 10.541f)
                close()
            }
        }
        .build()
        return _amazonLine!!
    }

private var _amazonLine: ImageVector? = null
