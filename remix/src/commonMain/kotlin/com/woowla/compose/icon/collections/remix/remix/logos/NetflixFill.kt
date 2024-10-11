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

public val LogosGroup.NetflixFill: ImageVector
    get() {
        if (_netflixFill != null) {
            return _netflixFill!!
        }
        _netflixFill = Builder(name = "NetflixFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.292f, 3.814f)
                lineTo(13.31f, 9.521f)
                lineTo(13.706f, 10.637f)
                lineTo(13.713f, 5.826f)
                lineTo(13.722f, 1.009f)
                horizontalLineTo(17.993f)
                lineTo(18.0f, 11.871f)
                curveTo(18.003f, 17.852f, 17.997f, 22.762f, 17.985f, 22.771f)
                curveTo(17.973f, 22.78f, 17.776f, 22.771f, 17.549f, 22.743f)
                curveTo(16.56f, 22.626f, 15.26f, 22.508f, 14.21f, 22.462f)
                curveTo(13.863f, 22.446f, 13.576f, 22.428f, 13.573f, 22.424f)
                curveTo(13.57f, 22.42f, 13.3f, 21.662f, 12.797f, 20.24f)
                lineTo(12.797f, 20.236f)
                curveTo(12.305f, 18.848f, 11.585f, 16.812f, 10.653f, 14.175f)
                lineTo(10.313f, 13.221f)
                lineTo(10.305f, 17.807f)
                curveTo(10.299f, 22.172f, 10.295f, 22.417f, 10.248f, 22.417f)
                curveTo(10.085f, 22.417f, 8.678f, 22.508f, 8.208f, 22.553f)
                curveTo(7.9f, 22.58f, 7.282f, 22.644f, 6.838f, 22.698f)
                curveTo(6.392f, 22.749f, 6.022f, 22.784f, 6.015f, 22.776f)
                curveTo(6.007f, 22.769f, 6.001f, 17.867f, 6.001f, 11.883f)
                verticalLineTo(1.002f)
                horizontalLineTo(6.006f)
                lineTo(6.006f, 1.0f)
                horizontalLineTo(10.294f)
                lineTo(10.322f, 1.081f)
                curveTo(10.329f, 1.096f, 10.387f, 1.256f, 10.479f, 1.517f)
                lineTo(11.12f, 3.295f)
                lineTo(11.293f, 3.791f)
                lineTo(11.292f, 3.814f)
                close()
            }
        }
        .build()
        return _netflixFill!!
    }

private var _netflixFill: ImageVector? = null
