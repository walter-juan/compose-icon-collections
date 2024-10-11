package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.HandHeartLine: ImageVector
    get() {
        if (_handHeartLine != null) {
            return _handHeartLine!!
        }
        _handHeartLine = Builder(name = "HandHeartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.005f, 9.003f)
                curveTo(5.557f, 9.003f, 6.005f, 9.45f, 6.005f, 10.003f)
                curveTo(7.64f, 10.003f, 9.144f, 10.563f, 10.335f, 11.502f)
                lineTo(12.505f, 11.503f)
                curveTo(13.837f, 11.503f, 15.034f, 12.082f, 15.858f, 13.001f)
                lineTo(19.005f, 13.003f)
                curveTo(20.997f, 13.003f, 22.717f, 14.168f, 23.521f, 15.854f)
                curveTo(21.156f, 18.975f, 17.327f, 21.003f, 13.005f, 21.003f)
                curveTo(10.214f, 21.003f, 7.855f, 20.399f, 5.944f, 19.345f)
                curveTo(5.806f, 19.728f, 5.437f, 20.003f, 5.005f, 20.003f)
                horizontalLineTo(2.005f)
                curveTo(1.453f, 20.003f, 1.005f, 19.555f, 1.005f, 19.003f)
                verticalLineTo(10.003f)
                curveTo(1.005f, 9.45f, 1.453f, 9.003f, 2.005f, 9.003f)
                horizontalLineTo(5.005f)
                close()
                moveTo(6.006f, 12.003f)
                lineTo(6.005f, 17.024f)
                lineTo(6.05f, 17.057f)
                curveTo(7.844f, 18.318f, 10.183f, 19.003f, 13.005f, 19.003f)
                curveTo(16.009f, 19.003f, 18.803f, 17.847f, 20.84f, 15.873f)
                lineTo(20.973f, 15.74f)
                lineTo(20.854f, 15.639f)
                curveTo(20.39f, 15.276f, 19.82f, 15.051f, 19.21f, 15.01f)
                lineTo(19.005f, 15.003f)
                lineTo(16.893f, 15.002f)
                curveTo(16.966f, 15.324f, 17.005f, 15.659f, 17.005f, 16.003f)
                verticalLineTo(17.003f)
                horizontalLineTo(8.005f)
                verticalLineTo(15.003f)
                lineTo(14.795f, 15.002f)
                lineTo(14.76f, 14.923f)
                curveTo(14.38f, 14.13f, 13.593f, 13.568f, 12.669f, 13.508f)
                lineTo(12.505f, 13.503f)
                lineTo(9.575f, 13.502f)
                curveTo(8.668f, 12.577f, 7.404f, 12.003f, 6.006f, 12.003f)
                close()
                moveTo(4.005f, 11.003f)
                horizontalLineTo(3.005f)
                verticalLineTo(18.003f)
                horizontalLineTo(4.005f)
                verticalLineTo(11.003f)
                close()
                moveTo(13.651f, 3.578f)
                lineTo(14.005f, 3.932f)
                lineTo(14.358f, 3.578f)
                curveTo(15.335f, 2.602f, 16.918f, 2.602f, 17.894f, 3.578f)
                curveTo(18.87f, 4.554f, 18.87f, 6.137f, 17.894f, 7.114f)
                lineTo(14.005f, 11.003f)
                lineTo(10.116f, 7.114f)
                curveTo(9.139f, 6.137f, 9.139f, 4.554f, 10.116f, 3.578f)
                curveTo(11.092f, 2.602f, 12.675f, 2.602f, 13.651f, 3.578f)
                close()
                moveTo(11.53f, 4.992f)
                curveTo(11.356f, 5.166f, 11.337f, 5.435f, 11.471f, 5.629f)
                lineTo(11.529f, 5.698f)
                lineTo(14.004f, 8.174f)
                lineTo(16.48f, 5.699f)
                curveTo(16.653f, 5.526f, 16.673f, 5.256f, 16.538f, 5.062f)
                lineTo(16.48f, 4.992f)
                curveTo(16.306f, 4.819f, 16.037f, 4.799f, 15.842f, 4.935f)
                lineTo(15.772f, 4.992f)
                lineTo(14.003f, 6.761f)
                lineTo(12.236f, 4.991f)
                lineTo(12.168f, 4.934f)
                curveTo(11.973f, 4.799f, 11.704f, 4.819f, 11.53f, 4.992f)
                close()
            }
        }
        .build()
        return _handHeartLine!!
    }

private var _handHeartLine: ImageVector? = null
