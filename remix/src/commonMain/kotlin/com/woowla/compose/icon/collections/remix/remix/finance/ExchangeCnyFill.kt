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

public val FinanceGroup.ExchangeCnyFill: ImageVector
    get() {
        if (_exchangeCnyFill != null) {
            return _exchangeCnyFill!!
        }
        _exchangeCnyFill = Builder(name = "ExchangeCnyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.005f, 13.538f)
                horizontalLineTo(16.005f)
                verticalLineTo(15.538f)
                horizontalLineTo(13.005f)
                verticalLineTo(17.538f)
                horizontalLineTo(11.005f)
                verticalLineTo(15.538f)
                horizontalLineTo(8.005f)
                verticalLineTo(13.538f)
                horizontalLineTo(11.005f)
                verticalLineTo(12.538f)
                horizontalLineTo(8.005f)
                verticalLineTo(10.538f)
                horizontalLineTo(10.591f)
                lineTo(8.469f, 8.417f)
                lineTo(9.884f, 7.003f)
                lineTo(12.005f, 9.124f)
                lineTo(14.126f, 7.003f)
                lineTo(15.54f, 8.417f)
                lineTo(13.419f, 10.538f)
                horizontalLineTo(16.005f)
                verticalLineTo(12.538f)
                horizontalLineTo(13.005f)
                verticalLineTo(13.538f)
                close()
            }
        }
        .build()
        return _exchangeCnyFill!!
    }

private var _exchangeCnyFill: ImageVector? = null
