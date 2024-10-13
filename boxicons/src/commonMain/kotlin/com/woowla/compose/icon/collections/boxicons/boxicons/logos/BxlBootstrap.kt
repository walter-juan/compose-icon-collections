package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlBootstrap: ImageVector
    get() {
        if (_bxlBootstrap != null) {
            return _bxlBootstrap!!
        }
        _bxlBootstrap = Builder(name = "BxlBootstrap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.002f, 2.997f)
                lineTo(5.999f, 2.997f)
                arcTo(3.011f, 3.011f, 0.0f, false, false, 2.997f, 6.0f)
                verticalLineToRelative(12.002f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, false, 3.002f, 3.001f)
                horizontalLineToRelative(12.003f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, false, 3.001f, -3.001f)
                lineTo(21.003f, 6.0f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, false, -3.001f, -3.003f)
                close()
                moveTo(16.362f, 15.644f)
                curveToRelative(-0.152f, 0.36f, -0.389f, 0.68f, -0.693f, 0.927f)
                arcToRelative(3.594f, 3.594f, 0.0f, false, true, -1.206f, 0.614f)
                curveToRelative(-0.49f, 0.151f, -1.074f, 0.229f, -1.75f, 0.229f)
                lineTo(7.888f, 17.414f)
                lineTo(7.888f, 6.909f)
                horizontalLineToRelative(5.103f)
                curveToRelative(0.943f, 0.0f, 1.7f, 0.213f, 2.267f, 0.646f)
                curveToRelative(0.569f, 0.436f, 0.854f, 1.082f, 0.854f, 1.958f)
                curveToRelative(0.0f, 0.528f, -0.13f, 0.983f, -0.389f, 1.357f)
                curveToRelative(-0.259f, 0.373f, -0.63f, 0.664f, -1.111f, 0.868f)
                verticalLineToRelative(0.034f)
                curveToRelative(0.642f, 0.135f, 1.137f, 0.438f, 1.464f, 0.912f)
                curveToRelative(0.327f, 0.473f, 0.493f, 1.069f, 0.493f, 1.789f)
                curveToRelative(0.0f, 0.405f, -0.078f, 0.788f, -0.225f, 1.147f)
                lineToRelative(0.02f, 0.021f)
                verticalLineToRelative(0.003f)
                close()
                moveTo(14.278f, 13.055f)
                curveToRelative(-0.309f, -0.282f, -0.739f, -0.419f, -1.297f, -0.419f)
                lineTo(9.737f, 12.636f)
                verticalLineToRelative(3.276f)
                horizontalLineToRelative(3.253f)
                curveToRelative(0.554f, 0.0f, 0.991f, -0.144f, 1.298f, -0.435f)
                curveToRelative(0.308f, -0.289f, 0.464f, -0.701f, 0.464f, -1.229f)
                curveToRelative(-0.005f, -0.518f, -0.156f, -0.919f, -0.464f, -1.193f)
                horizontalLineToRelative(-0.014f)
                horizontalLineToRelative(0.004f)
                close()
                moveTo(13.827f, 10.936f)
                curveToRelative(0.299f, -0.251f, 0.444f, -0.613f, 0.444f, -1.084f)
                curveToRelative(0.0f, -0.526f, -0.131f, -0.902f, -0.397f, -1.116f)
                curveToRelative(-0.264f, -0.214f, -0.646f, -0.326f, -1.146f, -0.326f)
                lineTo(9.727f, 8.41f)
                verticalLineToRelative(2.898f)
                horizontalLineToRelative(3.001f)
                curveToRelative(0.436f, 0.001f, 0.81f, -0.127f, 1.099f, -0.372f)
                close()
            }
        }
        .build()
        return _bxlBootstrap!!
    }

private var _bxlBootstrap: ImageVector? = null
