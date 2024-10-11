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

public val FinanceGroup.ExchangeDollarFill: ImageVector
    get() {
        if (_exchangeDollarFill != null) {
            return _exchangeDollarFill!!
        }
        _exchangeDollarFill = Builder(name = "ExchangeDollarFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.378f, 4.513f)
                curveTo(7.143f, 2.951f, 9.463f, 2.003f, 12.005f, 2.003f)
                curveTo(17.528f, 2.003f, 22.005f, 6.48f, 22.005f, 12.003f)
                curveTo(22.005f, 14.128f, 21.342f, 16.098f, 20.212f, 17.718f)
                lineTo(17.505f, 12.003f)
                horizontalLineTo(20.005f)
                curveTo(20.005f, 7.584f, 16.423f, 4.003f, 12.005f, 4.003f)
                curveTo(9.761f, 4.003f, 7.732f, 4.927f, 6.279f, 6.415f)
                lineTo(5.378f, 4.513f)
                close()
                moveTo(18.631f, 19.492f)
                curveTo(16.867f, 21.054f, 14.547f, 22.003f, 12.005f, 22.003f)
                curveTo(6.482f, 22.003f, 2.005f, 17.526f, 2.005f, 12.003f)
                curveTo(2.005f, 9.878f, 2.668f, 7.908f, 3.798f, 6.288f)
                lineTo(6.505f, 12.003f)
                horizontalLineTo(4.005f)
                curveTo(4.005f, 16.421f, 7.587f, 20.003f, 12.005f, 20.003f)
                curveTo(14.249f, 20.003f, 16.278f, 19.079f, 17.73f, 17.59f)
                lineTo(18.631f, 19.492f)
                close()
                moveTo(8.505f, 14.003f)
                horizontalLineTo(14.005f)
                curveTo(14.281f, 14.003f, 14.505f, 13.779f, 14.505f, 13.503f)
                curveTo(14.505f, 13.227f, 14.281f, 13.003f, 14.005f, 13.003f)
                horizontalLineTo(10.005f)
                curveTo(8.624f, 13.003f, 7.505f, 11.884f, 7.505f, 10.503f)
                curveTo(7.505f, 9.122f, 8.624f, 8.003f, 10.005f, 8.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(7.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(8.003f)
                horizontalLineTo(15.505f)
                verticalLineTo(10.003f)
                horizontalLineTo(10.005f)
                curveTo(9.729f, 10.003f, 9.505f, 10.227f, 9.505f, 10.503f)
                curveTo(9.505f, 10.779f, 9.729f, 11.003f, 10.005f, 11.003f)
                horizontalLineTo(14.005f)
                curveTo(15.386f, 11.003f, 16.505f, 12.122f, 16.505f, 13.503f)
                curveTo(16.505f, 14.884f, 15.386f, 16.003f, 14.005f, 16.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(17.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(16.003f)
                horizontalLineTo(8.505f)
                verticalLineTo(14.003f)
                close()
            }
        }
        .build()
        return _exchangeDollarFill!!
    }

private var _exchangeDollarFill: ImageVector? = null
