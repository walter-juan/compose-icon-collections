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

public val FinanceGroup.ExchangeDollarLine: ImageVector
    get() {
        if (_exchangeDollarLine != null) {
            return _exchangeDollarLine!!
        }
        _exchangeDollarLine = Builder(name = "ExchangeDollarLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.379f, 15.106f)
                curveTo(20.926f, 11.442f, 19.537f, 7.114f, 16.004f, 5.075f)
                curveTo(13.451f, 3.6f, 10.423f, 3.694f, 8.035f, 5.056f)
                lineTo(7.042f, 3.319f)
                curveTo(10.028f, 1.616f, 13.813f, 1.5f, 17.004f, 3.342f)
                curveTo(21.495f, 5.935f, 23.214f, 11.485f, 21.122f, 16.112f)
                lineTo(22.463f, 16.887f)
                lineTo(18.298f, 19.101f)
                lineTo(18.133f, 14.387f)
                lineTo(19.379f, 15.106f)
                close()
                moveTo(4.63f, 8.9f)
                curveTo(3.083f, 12.563f, 4.471f, 16.891f, 8.004f, 18.931f)
                curveTo(10.557f, 20.405f, 13.585f, 20.312f, 15.974f, 18.95f)
                lineTo(16.966f, 20.687f)
                curveTo(13.98f, 22.389f, 10.196f, 22.506f, 7.004f, 20.663f)
                curveTo(2.514f, 18.07f, 0.795f, 12.521f, 2.887f, 7.893f)
                lineTo(1.545f, 7.119f)
                lineTo(5.71f, 4.905f)
                lineTo(5.875f, 9.619f)
                lineTo(4.63f, 8.9f)
                close()
                moveTo(8.504f, 14.003f)
                horizontalLineTo(14.004f)
                curveTo(14.28f, 14.003f, 14.504f, 13.779f, 14.504f, 13.503f)
                curveTo(14.504f, 13.227f, 14.28f, 13.003f, 14.004f, 13.003f)
                horizontalLineTo(10.004f)
                curveTo(8.623f, 13.003f, 7.504f, 11.883f, 7.504f, 10.503f)
                curveTo(7.504f, 9.122f, 8.623f, 8.003f, 10.004f, 8.003f)
                horizontalLineTo(11.004f)
                verticalLineTo(7.003f)
                horizontalLineTo(13.004f)
                verticalLineTo(8.003f)
                horizontalLineTo(15.504f)
                verticalLineTo(10.003f)
                horizontalLineTo(10.004f)
                curveTo(9.728f, 10.003f, 9.504f, 10.227f, 9.504f, 10.503f)
                curveTo(9.504f, 10.779f, 9.728f, 11.003f, 10.004f, 11.003f)
                horizontalLineTo(14.004f)
                curveTo(15.385f, 11.003f, 16.504f, 12.122f, 16.504f, 13.503f)
                curveTo(16.504f, 14.883f, 15.385f, 16.003f, 14.004f, 16.003f)
                horizontalLineTo(13.004f)
                verticalLineTo(17.003f)
                horizontalLineTo(11.004f)
                verticalLineTo(16.003f)
                horizontalLineTo(8.504f)
                verticalLineTo(14.003f)
                close()
            }
        }
        .build()
        return _exchangeDollarLine!!
    }

private var _exchangeDollarLine: ImageVector? = null
