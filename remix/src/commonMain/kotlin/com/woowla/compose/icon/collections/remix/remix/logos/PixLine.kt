package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.PixLine: ImageVector
    get() {
        if (_pixLine != null) {
            return _pixLine!!
        }
        _pixLine = Builder(name = "PixLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.747f, 9.525f)
                    curveTo(0.38f, 10.892f, 0.38f, 13.108f, 1.747f, 14.475f)
                    lineTo(9.525f, 22.253f)
                    curveTo(10.892f, 23.62f, 13.108f, 23.62f, 14.475f, 22.253f)
                    lineTo(22.253f, 14.475f)
                    curveTo(23.62f, 13.108f, 23.62f, 10.892f, 22.253f, 9.525f)
                    lineTo(14.475f, 1.747f)
                    curveTo(13.108f, 0.38f, 10.892f, 0.38f, 9.525f, 1.747f)
                    lineTo(1.747f, 9.525f)
                    close()
                    moveTo(5.989f, 8.111f)
                    curveTo(6.575f, 7.525f, 7.525f, 7.525f, 8.111f, 8.111f)
                    lineTo(10.586f, 10.586f)
                    curveTo(11.367f, 11.367f, 12.633f, 11.367f, 13.414f, 10.586f)
                    lineTo(15.889f, 8.111f)
                    curveTo(16.475f, 7.525f, 17.424f, 7.526f, 18.01f, 8.111f)
                    lineTo(20.839f, 10.939f)
                    curveTo(21.424f, 11.525f, 21.424f, 12.475f, 20.839f, 13.061f)
                    lineTo(18.01f, 15.889f)
                    lineTo(18.009f, 15.89f)
                    curveTo(17.423f, 16.475f, 16.474f, 16.475f, 15.889f, 15.889f)
                    lineTo(13.414f, 13.414f)
                    curveTo(12.633f, 12.633f, 11.367f, 12.633f, 10.586f, 13.414f)
                    lineTo(8.111f, 15.889f)
                    curveTo(7.525f, 16.475f, 6.576f, 16.475f, 5.99f, 15.89f)
                    lineTo(5.989f, 15.889f)
                    lineTo(3.161f, 13.061f)
                    curveTo(2.575f, 12.475f, 2.575f, 11.525f, 3.161f, 10.939f)
                    lineTo(5.989f, 8.111f)
                    close()
                    moveTo(15.774f, 5.874f)
                    curveTo(15.299f, 6.043f, 14.854f, 6.317f, 14.475f, 6.697f)
                    lineTo(12.0f, 9.172f)
                    lineTo(9.525f, 6.697f)
                    curveTo(9.145f, 6.317f, 8.7f, 6.043f, 8.226f, 5.874f)
                    lineTo(10.939f, 3.161f)
                    curveTo(11.525f, 2.575f, 12.475f, 2.575f, 13.061f, 3.161f)
                    lineTo(15.774f, 5.874f)
                    close()
                    moveTo(15.774f, 18.126f)
                    lineTo(13.061f, 20.839f)
                    curveTo(12.475f, 21.425f, 11.525f, 21.425f, 10.939f, 20.839f)
                    lineTo(8.226f, 18.126f)
                    curveTo(8.7f, 17.957f, 9.145f, 17.683f, 9.525f, 17.303f)
                    lineTo(12.0f, 14.828f)
                    lineTo(14.475f, 17.303f)
                    curveTo(14.854f, 17.683f, 15.299f, 17.957f, 15.774f, 18.126f)
                    close()
                }
            }
        }
        .build()
        return _pixLine!!
    }

private var _pixLine: ImageVector? = null
