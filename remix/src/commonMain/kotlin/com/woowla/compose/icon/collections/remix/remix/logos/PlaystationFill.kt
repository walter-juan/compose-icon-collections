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

public val LogosGroup.PlaystationFill: ImageVector
    get() {
        if (_playstationFill != null) {
            return _playstationFill!!
        }
        _playstationFill = Builder(name = "PlaystationFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.585f, 17.011f)
                curveTo(22.155f, 17.554f, 21.102f, 17.941f, 21.102f, 17.941f)
                lineTo(13.27f, 20.758f)
                verticalLineTo(18.681f)
                lineTo(19.034f, 16.624f)
                curveTo(19.688f, 16.39f, 19.788f, 16.058f, 19.257f, 15.884f)
                curveTo(18.726f, 15.709f, 17.765f, 15.759f, 17.11f, 15.995f)
                lineTo(13.27f, 17.349f)
                verticalLineTo(15.194f)
                lineTo(13.491f, 15.118f)
                curveTo(13.491f, 15.118f, 14.601f, 14.725f, 16.161f, 14.552f)
                curveTo(17.722f, 14.38f, 19.633f, 14.576f, 21.133f, 15.145f)
                curveTo(22.823f, 15.68f, 23.014f, 16.468f, 22.585f, 17.011f)
                close()
                moveTo(14.015f, 13.474f)
                verticalLineTo(8.162f)
                curveTo(14.015f, 7.538f, 13.9f, 6.964f, 13.316f, 6.801f)
                curveTo(12.868f, 6.658f, 12.59f, 7.074f, 12.59f, 7.697f)
                verticalLineTo(21.0f)
                lineTo(9.007f, 19.861f)
                verticalLineTo(4.0f)
                curveTo(10.53f, 4.283f, 12.75f, 4.953f, 13.943f, 5.355f)
                curveTo(16.978f, 6.398f, 18.007f, 7.697f, 18.007f, 10.622f)
                curveTo(18.007f, 13.473f, 16.249f, 14.554f, 14.015f, 13.474f)
                close()
                moveTo(2.432f, 18.463f)
                curveTo(0.696f, 17.974f, 0.407f, 16.955f, 1.198f, 16.367f)
                curveTo(1.929f, 15.825f, 3.173f, 15.417f, 3.173f, 15.417f)
                lineTo(8.311f, 13.588f)
                verticalLineTo(15.673f)
                lineTo(4.613f, 16.998f)
                curveTo(3.96f, 17.232f, 3.86f, 17.565f, 4.39f, 17.739f)
                curveTo(4.922f, 17.913f, 5.883f, 17.863f, 6.537f, 17.628f)
                lineTo(8.311f, 16.984f)
                verticalLineTo(18.849f)
                curveTo(8.198f, 18.869f, 8.073f, 18.889f, 7.957f, 18.909f)
                curveTo(6.183f, 19.199f, 4.293f, 19.078f, 2.432f, 18.463f)
                close()
            }
        }
        .build()
        return _playstationFill!!
    }

private var _playstationFill: ImageVector? = null
