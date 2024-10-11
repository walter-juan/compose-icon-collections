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

public val LogosGroup.SvelteLine: ImageVector
    get() {
        if (_svelteLine != null) {
            return _svelteLine!!
        }
        _svelteLine = Builder(name = "SvelteLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8f, 3.77f)
                curveTo(17.945f, 0.859f, 14.082f, 0.003f, 11.171f, 1.857f)
                lineTo(6.11f, 5.081f)
                curveTo(3.231f, 6.915f, 2.362f, 10.714f, 4.137f, 13.613f)
                curveTo(2.935f, 15.585f, 2.876f, 18.15f, 4.201f, 20.23f)
                curveTo(6.055f, 23.141f, 9.919f, 23.997f, 12.83f, 22.143f)
                lineTo(17.89f, 18.919f)
                curveTo(20.769f, 17.085f, 21.639f, 13.286f, 19.864f, 10.387f)
                curveTo(21.066f, 8.415f, 21.125f, 5.851f, 19.8f, 3.77f)
                close()
                moveTo(18.448f, 8.774f)
                curveTo(17.628f, 8.115f, 16.663f, 7.683f, 15.651f, 7.499f)
                curveTo(15.688f, 7.265f, 15.644f, 7.017f, 15.507f, 6.802f)
                curveTo(15.21f, 6.336f, 14.592f, 6.199f, 14.126f, 6.496f)
                lineTo(9.066f, 9.72f)
                curveTo(8.6f, 10.017f, 8.463f, 10.635f, 8.759f, 11.1f)
                curveTo(9.056f, 11.566f, 9.674f, 11.703f, 10.14f, 11.406f)
                lineTo(12.249f, 10.063f)
                curveTo(14.228f, 8.802f, 16.855f, 9.385f, 18.117f, 11.364f)
                curveTo(19.378f, 13.344f, 18.795f, 15.971f, 16.816f, 17.232f)
                lineTo(11.755f, 20.456f)
                curveTo(9.776f, 21.717f, 7.149f, 21.135f, 5.887f, 19.155f)
                curveTo(5.11f, 17.935f, 5.033f, 16.467f, 5.553f, 15.226f)
                curveTo(6.373f, 15.885f, 7.338f, 16.317f, 8.35f, 16.501f)
                curveTo(8.313f, 16.735f, 8.357f, 16.983f, 8.494f, 17.198f)
                curveTo(8.791f, 17.664f, 9.409f, 17.801f, 9.875f, 17.504f)
                lineTo(14.935f, 14.28f)
                curveTo(15.401f, 13.983f, 15.538f, 13.365f, 15.241f, 12.899f)
                curveTo(14.944f, 12.434f, 14.326f, 12.297f, 13.861f, 12.593f)
                lineTo(11.752f, 13.937f)
                curveTo(9.772f, 15.198f, 7.145f, 14.615f, 5.884f, 12.636f)
                curveTo(4.623f, 10.656f, 5.205f, 8.029f, 7.185f, 6.768f)
                lineTo(12.245f, 3.544f)
                curveTo(14.225f, 2.283f, 16.852f, 2.865f, 18.113f, 4.845f)
                curveTo(18.891f, 6.065f, 18.968f, 7.532f, 18.448f, 8.774f)
                close()
            }
        }
        .build()
        return _svelteLine!!
    }

private var _svelteLine: ImageVector? = null
