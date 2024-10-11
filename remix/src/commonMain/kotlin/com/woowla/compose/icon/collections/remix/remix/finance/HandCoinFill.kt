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

public val FinanceGroup.HandCoinFill: ImageVector
    get() {
        if (_handCoinFill != null) {
            return _handCoinFill!!
        }
        _handCoinFill = Builder(name = "HandCoinFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.335f, 11.502f)
                lineTo(11.505f, 11.503f)
                curveTo(13.99f, 11.503f, 16.005f, 13.517f, 16.005f, 16.003f)
                horizontalLineTo(9.004f)
                lineTo(9.005f, 17.003f)
                lineTo(17.005f, 17.002f)
                verticalLineTo(16.003f)
                curveTo(17.005f, 14.92f, 16.687f, 13.9f, 16.119f, 13.002f)
                lineTo(19.005f, 13.003f)
                curveTo(20.997f, 13.003f, 22.717f, 14.168f, 23.521f, 15.854f)
                curveTo(21.156f, 18.975f, 17.327f, 21.003f, 13.005f, 21.003f)
                curveTo(10.244f, 21.003f, 7.904f, 20.412f, 6.005f, 19.378f)
                lineTo(6.006f, 10.074f)
                curveTo(7.251f, 10.252f, 8.391f, 10.759f, 9.335f, 11.502f)
                close()
                moveTo(5.005f, 19.003f)
                curveTo(5.005f, 19.555f, 4.557f, 20.003f, 4.005f, 20.003f)
                horizontalLineTo(2.005f)
                curveTo(1.453f, 20.003f, 1.005f, 19.555f, 1.005f, 19.003f)
                verticalLineTo(10.003f)
                curveTo(1.005f, 9.451f, 1.453f, 9.003f, 2.005f, 9.003f)
                horizontalLineTo(4.005f)
                curveTo(4.557f, 9.003f, 5.005f, 9.451f, 5.005f, 10.003f)
                verticalLineTo(19.003f)
                close()
                moveTo(18.005f, 5.003f)
                curveTo(19.662f, 5.003f, 21.005f, 6.346f, 21.005f, 8.003f)
                curveTo(21.005f, 9.66f, 19.662f, 11.003f, 18.005f, 11.003f)
                curveTo(16.348f, 11.003f, 15.005f, 9.66f, 15.005f, 8.003f)
                curveTo(15.005f, 6.346f, 16.348f, 5.003f, 18.005f, 5.003f)
                close()
                moveTo(11.005f, 2.003f)
                curveTo(12.662f, 2.003f, 14.005f, 3.346f, 14.005f, 5.003f)
                curveTo(14.005f, 6.66f, 12.662f, 8.003f, 11.005f, 8.003f)
                curveTo(9.348f, 8.003f, 8.005f, 6.66f, 8.005f, 5.003f)
                curveTo(8.005f, 3.346f, 9.348f, 2.003f, 11.005f, 2.003f)
                close()
            }
        }
        .build()
        return _handCoinFill!!
    }

private var _handCoinFill: ImageVector? = null
